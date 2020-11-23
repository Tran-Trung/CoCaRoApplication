package caro.server;

import caro.Engine;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Server
{
	public static final int port = 1234;
	public static final int MAX_CLIENT = 2;
	private static ServerSocket server = null;
	public static Vector<Worker> workers = new Vector<>();


	public static void main(String[] args) throws IOException
	{
		ExecutorService executor = Executors.newFixedThreadPool(MAX_CLIENT);
		try
		{
			server = new ServerSocket(port);
			Engine.log("Server binding at port " + port);
			Engine.log("Waiting for client...");
			while(true)
			{
				Socket socket = server.accept();
				int id = workers.size();
				Worker client = new Worker(id, socket);
				workers.add(client);
				executor.execute(client);
			}
		}
		catch (IOException e)
		{
			Engine.error(e.getMessage());
		}
		finally
		{
			executor.shutdown();
			if(server != null)
				server.close();
		}
	}
}
