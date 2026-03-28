package Server_temp.copy;

import java.net.InetAddress;
import java.net.ServerSocket;
import java.awt.Container;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client_multi {
	
	
	public Runnable getRunnable() {
		return new Runnable(){
		@Override
		public void run() {
		int port= 8010;
		try {
			InetAddress address = InetAddress.getByName("localhost");
			Socket socket =new Socket(address,port);
		try (
			PrintWriter toSocket=new PrintWriter(socket.getOutputStream());
			BufferedReader fromSocket=new BufferedReader(new InputStreamReader(socket.getInputStream()));
		){
			toSocket.println("hello from the client "+socket.getLocalSocketAddress());
			String line=fromSocket.readLine();
			System.out.println("Response from: "+line);
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			}	
		};
	}
	

	public static void main(String[] args) {
	
		int port =8010;
		Client_multi client =new Client_multi();	
		
		for(int i=0;i<100;i++) {
			
				Thread thread =new Thread(client.getRunnable());
				thread.start();
		}

	}

}
