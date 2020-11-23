package caro.client;

import caro.Engine;
import caro.server.Server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;


class SendMessage implements Runnable
{
	private static Socket socket;
	private static BufferedWriter out;


	public SendMessage(Socket s, BufferedWriter o)
	{
		this.socket = s;
		this.out = o;
	}

	public static void login(String account, String password) throws IOException
	{
		String data = "login "+account+' '+password;
		out.write(data+'\n');
		out.flush();
	}

	public void request(int idplayer) throws IOException
	{
		String data = "request "+idplayer;
		out.write(data+'\n');
		out.flush();
	}

	public void request(boolean confirm) throws IOException
	{
		String data = "request " + (confirm ? "yes" : "no");
		out.write(data+'\n');
		out.flush();
	}

	public void spec(int idroom) throws IOException
	{
		String data = "spec " + idroom;
		out.write(data+'\n');
		out.flush();
	}

	public void ready() throws IOException
	{
		out.write("ready\n");
		out.flush();
	}

	public void play(int x, int y) throws IOException
	{
		String data = "play " + x + ' ' + y;
		out.write(data+'\n');
		out.flush();
	}

	public void overtime() throws IOException
	{
		out.write("overtime\n");
		out.flush();
	}

	public void outroom() throws IOException
	{
		out.write("outroom\n");
		out.flush();
	}

	public void run()
	{
		// TODO Mo man hinh cho

//		man hinh cho ->> login ->> register;
//		man hinh cho ->> in game
        System.out.println("run before");

//		test Login
		LoginGUI.main(null);
        
        System.out.println("run after");

		try
		{
			while(true)
			{
				BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
				String data = stdIn.readLine();
				System.out.println("Input from client: " + data);
				out.write(data+'\n');
				out.flush();
				if(data.equals("bye"))
					break;
			}

			Client.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
