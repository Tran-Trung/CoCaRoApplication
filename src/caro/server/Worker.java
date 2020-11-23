package caro.server;

import caro.Engine;
import caro.database.impl.PlayerDAO;
import caro.entity.Player;
import caro.entity.Room;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.StringTokenizer;


public class Worker implements Runnable
{
	private final int id;
	private final Socket socket;
	private final BufferedReader in;
	private final BufferedWriter out;
	private Player player;
	private int idroom;
	private boolean isPlaying;

	public Worker(int id, Socket sk) throws IOException
	{
		this.id = id;
		this.socket = sk;
		this.in = new BufferedReader(new InputStreamReader(sk.getInputStream()));
		this.out = new BufferedWriter(new OutputStreamWriter(sk.getOutputStream()));
		this.player = null;
		this.idroom = -1;
		this.isPlaying = false;
	}

	public Player getPlayer()
	{
		return player;
	}

	public int getRoom()
	{
		return idroom;
	}

	public void setRoom(int id)
	{
		this.idroom = id;
	}

	public String receive() throws IOException
	{
		return in.readLine();
	}

	public void send(String mes) throws IOException
	{
		out.write(mes);
		out.newLine();
		out.flush();
	}

	private void close() throws IOException
	{
		Engine.log("Closed socket for client ["+id+"] " + socket.toString());

		in.close();
		out.close();
		socket.close();
	}

	private void login(String account, String password)
	{
		player = Engine.login(account, password);
	}

	private void logout()
	{
		player = null;
	}

	private void request(String param) throws IOException
	{
		if (player == null)
			return;

		if (param.equals("yes"))
		{
			Room r = Engine.listRoom.get(idroom);
			r.workerList.get(0).send("join");
			Worker w = r.workerList.get(0);

			send("join");
			w.send("join");

			isPlaying = true;
			w.isPlaying = true;
		}
		else if (param.equals("no"))
		{
			Room r = Engine.listRoom.get(idroom);
			Worker w = r.workerList.get(0);
			w.idroom = idroom = -1;
			Engine.listRoom.remove(r);
		}
		else
		{
			int idplayer = Integer.parseInt(param);
			PlayerDAO dao = new PlayerDAO();
			Room r = new Room();
			r.setPlayer1(player);
			r.setPlayer2(dao.findById(idplayer));
			r.workerList.add(this);

			Worker w = findClient(idplayer);
			if (w != null)
			{
				idroom = Engine.listRoom.size();
				Engine.listRoom.add(r);

				r.workerList.add(w);
				w.setRoom(idroom);
				w.send("request " + player.getID());
			}
		}
	}

	private void spec(int id) throws IOException
	{
		idroom = id;
		Room r = Engine.listRoom.get(idroom);
		r.workerList.add(this);
		send("joinspec");
	}

	private void ready() throws IOException
	{
		Room r = Engine.listRoom.get(idroom);
		r.setReady(player, true);

		if (r.getReady())
			r.start();
	}

	private void play(int x, int y) throws IOException
	{
		Room r = Engine.listRoom.get(idroom);
		r.update(player, x, y);
	}

	private void overtime() throws IOException
	{
		Room r = Engine.listRoom.get(idroom);
		r.overtime(player);
	}

	private void outroom() throws IOException
	{
		Room r = Engine.listRoom.get(idroom);
		r.overtime(player);
	}

	public void run()
	{
		Engine.log("Client [" + id + "]" + socket.toString() + " accepted.");
		try
		{
			while (true)
			{
				String input = receive();
				if (input == null || input.isEmpty())
					continue;

				System.out.println("input>> "+input);
				StringTokenizer stk = new StringTokenizer(input);
				String cmd = stk.nextToken();

				if (cmd.equals("bye"))
					break;

				if (isPlaying) // in game
				{
					if (cmd.equals("ready"))
						ready();
					else if (cmd.equals("play"))
						play(Integer.parseInt(stk.nextToken()), Integer.parseInt(stk.nextToken()));
					else if (cmd.equals("overtime"))
						overtime();
					else if (cmd.equals("outroom"))
						outroom();
				}
				else // in lobby
				{
					if (cmd.equals("login"))
						login(stk.nextToken(), stk.nextToken());
					else if (input.equals("logout"))
						logout();
					else if (input.equals("request"))
						request(stk.nextToken());
					else if (input.equals("spec"))
						spec(Integer.parseInt(stk.nextToken()));
				}
			}

			close();
		}
		catch (IOException e)
		{
			System.out.println(e);
		}
	}

	private Worker findClient(int idplayer)
	{
		for (Worker w : Server.workers)
		{
			if (w.getPlayer().getID() == idplayer)
				return w;
		}
		return null;
	}
}
