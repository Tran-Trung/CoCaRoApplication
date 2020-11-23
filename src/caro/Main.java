package caro;

import caro.entity.Player;

import java.util.List;

public class Main {

	public static void testCaro()
	{

		// Init
		Caro caro = new Caro();

		// Framework
		caro.update(true, 0, 0);
		caro.update(false, 1, 1);
		caro.update(true, 0, 1);
		caro.update(false, 1, 2);
		caro.update(true, 0, 2);
		caro.update(false, 1, 3);
		caro.update(true, 0, 3);
		caro.update(false, 1, 4);
		caro.update(true, 0, 4);
		caro.update(false, 1, 5);

		// Kiem tra thang thua
		int win = caro.getWin();
		if (win > 0)
			System.out.println("Winner is "+win);

		// Hien du lieu ma tran
		int[][] m = caro.getMatrix();
		for (int y=0; y<Caro.h_row; y++) {
			for (int x=0; x<Caro.h_col; x++) {
				System.out.print(m[y][x] + " ");
			}
			System.out.print("\n");
		}
	}

	public static void testPlayer()
	{
		// Input
		String account = "minhtri";
		String password = "ILoveJava";

		// Check in Database
		Player p = Engine.login(account, password);
		if (p != null) // Dang nha thanh cong
		{
			// Add to lobby
			System.out.println("DANG NHAP THANH CONG");
		}
		else // Dang nhap that bai
		{
			System.out.println("[Notice] account or password invaild.");
		}
	}

	public static void testDatabase()
	{
		// ADD
//        Player p = new Player("minhtri", "123456", "minhtri258em@gmail.com");
//        p.setScore(4);
//        Database db = new Database();
//        int id = db.add(p);
//        p.setID(id);

		// LIST
//        List list = Database.list(Player.class);
//        if (list == null)
//        {
//            System.out.println("Cant get list player from database!");
//            return;
//        }
//        else
//            System.out.println("Co ket ua");
//
//        for (Object o : list)
//        {
//            Player obj = (Player) o;
//            System.out.println("========================");
//            System.out.println("account "+obj.getAccount());
//            System.out.println("password "+obj.getPassword());
//            System.out.println("email "+obj.getEmail());
//        }
	}

	private static void testEngineRegister()
	{
		String account = "minhtri";
		String password = "123456";
		String passwordconfirm = "123456";
		String email = "minhtri@gmail.com";
		String numphone = "";
		Engine.register(account, password, passwordconfirm, email, numphone);
	}

	private static void testEngineLogin()
	{
		String account = "minhtri";
		String password = "123456";
		Player p = Engine.login(account, password);
		System.out.println(p.getPassword());
	}

	public static void main(String[] args)
	{
		Engine.sendEmail();
	}

}
