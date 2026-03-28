package Server_temp.copy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void run()  throws UnknownHostException, IOException{
		int port=8080;
		InetAddress address = InetAddress.getByName("localhost");
		Socket socket =new Socket(address,port);
		PrintWriter toSocket =new PrintWriter(socket.getOutputStream());
		BufferedReader fromSocket = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		toSocket.println("hello from the client");
		String line = fromSocket.readLine();
		System.out.println("Response from the server: "+line);
		toSocket.close();
		fromSocket.close();
		socket.close();
	}
	
	public static void main(String[]args) {
		Client client = new Client();
		try {
			Client.run();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
