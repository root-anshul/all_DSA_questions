package Server_temp;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.function.Consumer;

public class MultiThreadedServer {
	
	public Consumer<Socket> getConsumer(){
		return (clientSocket)->{
			try {
				PrintWriter toClient = new PrintWriter(clientSocket.getOutputStream());
				toClient.println("Hello from server");
				toClient.close();
				clientSocket.close();
//				BufferedReader fromClient= new BufferedReader(new InputStream());
			}catch(IOException ex) {
				ex.printStackTrace();
			}
			
		};
		
	}

	public static void main(String[] args) {
		int port = 8010;
		MultiThreadedServer multiServer= new MultiThreadedServer();
		try {
			ServerSocket serverSocket=new ServerSocket(port);
			serverSocket.setSoTimeout(10000);
			System.out.println("Server is listning on the port: "+port);
		while(true) {
			Socket acceptSocket = serverSocket.accept();
			Thread t1=new Thread(()->multiServer.getConsumer().accept(acceptSocket));
			t1.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
