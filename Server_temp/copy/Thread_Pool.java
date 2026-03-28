package Server_temp.copy;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Thread_Pool {

	public final ExecutorService threadpool; 
	
	public Thread_Pool(int poolsize) {
		this.threadpool = Executors.newFixedThreadPool(poolsize);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
