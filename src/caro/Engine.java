package caro;

import caro.database.impl.PlayerDAO;
import caro.database.impl.RoomDAO;
import caro.entity.Player;
import caro.entity.Room;
import caro.server.Server;
import caro.server.Worker;

import javax.xml.bind.DatatypeConverter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Engine
{
	public static List<Player> listPlayer = new ArrayList<>();
	public static List<Room> listRoom = new ArrayList<>();

	public static void init()
	{
//        Database.init();
	}

	// TODO GUI NOTICE
	public static void error(String mes)
	{
		System.out.println(mes);
	}
	public static void warning(String mes)
	{
		System.out.println(mes);
	}
	public static void notice(String mes)
	{
		System.out.println(mes);
	}
	public static void log(String mes)
	{
		System.out.println(mes);
	}

	public static boolean register(String account, String password, String passwordconfirm, String email, String numphone)
	{
		// Default
		PlayerDAO dao = new PlayerDAO();

		// kiem tra ten tai khoan
		if (account.isEmpty())
		{
			notice("Chưa nhập tên tài khoản");
			return false;
		}

		// Kiem tra trung lap tai khoan
		Player ckPlayer = dao.findByAccount(account);
		if (ckPlayer != null)
		{
			notice("Tai khoan da ton tai, vui long chon ton dang nhap khac");
			return false;
		}

		// kiem tra mat khau
		if (password.length() < 6)
		{
			notice("Mật khẩu tối thiểu 6 ký tự");
			return false;
		}

		if (!password.equals(passwordconfirm))
		{
			notice("Mật khẩu nhập lại không khớp");
			return false;
		}

		String hashpass = hashMD5(password);

		// kiem tra email
		if (email.isEmpty())
		{
			notice("Chưa nhập Email");
			return false;
		}

		final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
		Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(email);
		if (!matcher.find())
		{
			notice("Dinh dang email chua dung");
			return false;
		}

		// TODO validate email (feature)

		// Luu player vao database
		Player p = new Player();
		p.setAccount(account);
		p.setPassword(hashpass);
		p.setEmail(email);
		if (!numphone.isEmpty())
			p.setNumPhone(numphone);

		dao.save(p);

		return true;
	}

	public static Player login(String account, String password)
	{
		// Default
		PlayerDAO dao = new PlayerDAO();
		password = hashMD5(password); // Bam mat khau

		// Tim kiem tren database
		Player p = dao.findByAccount(account);

		// Kiem tra ten tai khoan
		if (p == null)
		{
			notice("Tai khoan hoac mat khau khong dung!");
			return null;
		}

		// Kiem tra mat khau
		if (!p.getPassword().equals(password))
		{
			notice("Tai khoan hoac mat khau khong dung!");
			return null;
		}

		// Dang nhap thanh cong
		return p;
	}

	public void clientConnect(Player p)
	{
		listPlayer.add(p);
	}

	public void clientDisconnect(Player p)
	{
		listPlayer.remove(p);
	}

	public static boolean verifyRequest(Player p)
	{
		int id = p.getID();
		for (Worker w : Server.workers)
		{

		}
		return true;
	}

	public void createRoom(Player p1, Player p2)
	{
		Room r = new Room();
		r.setPlayer1(p1);
		r.setPlayer2(p2);
		listRoom.add(r);
	}

	public void closeRoom(Room r, int kq)
	{
		r.setResult(kq);
		RoomDAO dao = new RoomDAO();
		dao.save(r);
		listRoom.remove(r);
	}

	public static String hashMD5(String s)
	{
            String hash = "";
            try {
                    MessageDigest md = null;
                    md = MessageDigest.getInstance("MD5");
                    md.update(s.getBytes());
                    byte[] digest = md.digest();
                    hash = DatatypeConverter.printHexBinary(digest).toUpperCase();
            } catch (NoSuchAlgorithmException e) {
                    e.printStackTrace();
            }
            return hash;
	}

}
