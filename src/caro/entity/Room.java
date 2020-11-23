package caro.entity;

import caro.Caro;
import caro.database.impl.RoomDAO;
import caro.server.Worker;

import javax.persistence.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Entity
@Table(name = "room")

public class Room {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@ManyToOne
	@JoinColumn(name = "player_id", nullable = false, insertable = false, updatable = false)
	private Player player1;

	@ManyToOne
	@JoinColumn(name = "player_id", nullable = false, insertable = false, updatable = false)
	private Player player2;

	@Column(name = "result")
	private int result;

	@Column(name = "timebegin")
	@Temporal(TemporalType.TIME)
	private Date timebegin;

	// CONST
	public static final float MAX_ROUNDTIME = 600.0f; // 600 giay = 10 phut
	public static final float MAX_TURNTIME = 30.0f; // 30 giay

	// Process not entity on database
	private Caro m_caro;
	public List<Worker> workerList;

	// Game process
	private boolean isReady1, isReady2;


	public Room() {
		id = result = 0;
		player1 = player2 = null;
		timebegin = new Date();

		m_caro = new Caro();
		workerList = new ArrayList<>();

		isReady1 = isReady2 = false;
	}

	public Player getPlayer1() {
		return player1;
	}

	public void setPlayer1(Player p) {
		player1 = p;
	}

	public Player getPlayer2() {
		return player2;
	}

	public void setPlayer2(Player p) {
		player2 = p;
	}

	public void setResult(int result) {
		if (this.result > 0) {
			System.out.println("Ko the thay doi ket qua tran dau!");
			return;
		}

		if (result < 1 || result > 3) {
			System.out.println("Ket qua khong hop le!");
			return;
		}

		this.result = result;
	}

	public void setReady(Player p, boolean ready) {
		if (p == player1)
			isReady1 = true;
		else if (p == player2)
			isReady2 = true;
	}

	public boolean getReady() {
		return (isReady1 && isReady2);
	}

	public void start() throws IOException {
		// TODO bat dau dem thoi gian

		// trao quyen cho player
		workerList.get(0).send("turn yes");
		workerList.get(1).send("turn no");
	}

	public void update(Player p, int x, int y) throws IOException {
		// TODO check time

		if (p == player1)
			m_caro.update(true, x, y);
		else if (p == player2)
			m_caro.update(false, x, y);

		if (m_caro.getWin() != 0)
			endRound();
	}

	public void overtime(Player p) throws IOException {
		if (p == player1) {
			workerList.get(0).send("turn no");
			workerList.get(1).send("turn yes");
		} else if (p == player2) {
			workerList.get(0).send("turn yes");
			workerList.get(1).send("turn no");
		}
	}

	private void endRound() throws IOException
	{
		switch (m_caro.getWin()) {
			case 1: // player 1 win
				workerList.get(0).send("end win");
				workerList.get(1).send("end lost");
				break;
			case 2: // player 2 win
				workerList.get(0).send("end lost");
				workerList.get(1).send("end win");
				break;
		}

		isReady1 = isReady2 = false;

		// Luu database
		RoomDAO dao = new RoomDAO();
		// TODO set some value
		dao.save(this);

		// TODO Thay doi mot so thong tin trong player va luu database


		// TODO confirm play again
		// TODO out or reset round
	}

}
