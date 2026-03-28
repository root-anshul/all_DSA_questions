package Server_temp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SingleThreaded {

	
	public static void run() throws IOException {
		int port=8080;
		ServerSocket socket=new ServerSocket(port); 
		socket.setSoTimeout(10000); 
		//to free the port after 10 seconds 
		while(true) {
			System.out.println("The server is listining to the port "+port);
			Socket acceptedConnection = socket.accept();
			//agar 10 seconds tk koi connection nhi aata to apne aap port bnd ho jayega
			System.out.println("Accepted connection from client "+acceptedConnection.getRemoteSocketAddress());
			/*
			getRemoteSocketAddress() is a method in Java’s Socket class that returns the remote
			address to which the socket is connected.
			
			Socket Address= ip address + port no.
			*/
			 PrintWriter toClient = new PrintWriter(acceptedConnection.getOutputStream());
			 BufferedReader fromClient= new BufferedReader(new InputStreamReader(acceptedConnection.getInputStream()));
			 toClient.println("hello from the server");
			 toClient.close();
			 fromClient.close();
			 acceptedConnection.close();
	
		}
	}
	public static void main(String[] args) {
		System.out.println("Running the server");
		 SingleThreaded single=new  SingleThreaded ();
		try {
			single.run();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
