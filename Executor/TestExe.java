package Executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

 class PrintTask implements Runnable {

	public final char ch;
	
	
	PrintTask(char ch){
		this.ch=ch;
	}
	
	
	public void run() {
		for (int i=1;i<=1000;i++) {
			System.out.print(ch+""+i+" ");
		}
		System.out.println();
		System.out.println(Thread.currentThread().getName());
		System.out.println(ch);
	}
	
}


 public class TestExe{
	public static void main(String[]args) {
		
//		ExecutorService service = Executors.newSingleThreadExecutor();
		
		ExecutorService service = Executors.newFixedThreadPool(2);
		ExecutorService service1 = Executors.newFixedThreadPool(2);
		
		PrintTask t1=new PrintTask('@');
		PrintTask t2=new PrintTask('#');
		PrintTask t3=new PrintTask('$');
		
		service.submit(t1);
		service1.submit(t2);
		service.submit(t3);
		service.shutdown();
		
	}
}