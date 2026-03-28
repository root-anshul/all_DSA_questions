package Executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class tasks extends Thread{
	
	public void run() {
		
			print();
		
	}
	public void print() {
    System.out.println(Thread.currentThread().getName());
		
		System.out.println();
	}
	
}


public class question_2 {

	public static void main(String[] args) throws InterruptedException {
		tasks t1 =new tasks();
		tasks t2 =new tasks();
		tasks t3 =new tasks();
		tasks t4 =new tasks();
		
		
		ExecutorService service= Executors.newFixedThreadPool(4);
		service.submit(t1);
		Thread.sleep(3000);
		service.submit(t2);
		Thread.sleep(3000);
		service.submit(t3);
		Thread.sleep(3000);
		service.submit(t4);
		service.shutdown();
	}

}
