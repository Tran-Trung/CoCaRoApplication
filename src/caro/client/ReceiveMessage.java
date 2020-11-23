package caro.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.Socket;
import java.util.StringTokenizer;


class ReceiveMessage implements Runnable
{
	private BufferedReader in;
	private Socket socket;
	public ReceiveMessage(Socket s, BufferedReader i)
	{
		this.socket = s;
		this.in = i;
	}
    
    public void reslogin(String res)
    {
        if(res.equals("yes")){
            LoginGUI.result = 2;
        }else{
            LoginGUI.result = 1;
        }
    }
    
	public void request(int idplayer)
	{
		// TODO hien bang confirm
	}

	public void join()
	{
		// TODO vao  giao dien game
	}

	public void turn(String res)
	{
		if (res.equals("yes"))
		{
			// TODO ddem nguoc luot cua minh

			// TODO enable input cho clent nay
		}
		else if (res.equals("no"))
		{
			// TODO ddem nguoc luot cua doi thu

			// TODO disable input clent nay
		}
	}

	public void end(String res)
	{
		if (res.equals("win"))
		{
			// TODO hien thong bao chien thang
		}
		else if (res.equals("lost"))
		{
			// TODO hien thong bao thua
		}

		// TODO Hien mot vai thong so luc choi

		// TODO hien confirm choi lai hoac thoat phong
	}

	public void run()
	{
		try
		{
			while(true)
			{
				String input = in.readLine();
				if (input == null || input.isEmpty())
					continue;

				StringTokenizer stk = new StringTokenizer(input);
				String cmd = stk.nextToken();
                
                
				if (cmd.equals("reslogin"))
					reslogin(stk.nextToken());
                else if (cmd.equals("join"))
					join();
				else if (cmd.equals("request"))
					request(Integer.parseInt(stk.nextToken()));
				else if (cmd.equals("turn"))
					turn(stk.nextToken());
				else if (cmd.equals("end"))
					end(stk.nextToken());
			}
		}
		catch (IOException e)
		{

		}
	}
}
