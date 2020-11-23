package caro.client;

import caro.Engine;
import caro.entity.Player;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Client
{
	private static String host = "localhost";
	private static int port = 1234;
	private static Socket socket;

	private static BufferedWriter out;
	private static BufferedReader in;

	private static ExecutorService executor;
    
	// thong tin game
	public static Player player = null;

	public static void main(String[] args) throws IOException
	{
		executor = Executors.newFixedThreadPool(2);

		socket = new Socket(host, port);
		Engine.log("Client connected ");

		out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

		SendMessage send = new SendMessage(socket, out);
		ReceiveMessage recv = new ReceiveMessage(socket, in);

		executor.execute(send);
		executor.execute(recv);
	}

	public static void close() throws IOException
	{
		executor.shutdown();
		Engine.notice("Client closed connection");
		in.close();
		out.close();
		socket.close();
	}
}
