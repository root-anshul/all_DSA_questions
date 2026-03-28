package Executor;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FetchName implements Callable<String>{
	
	public String str=" ";
		
	public FetchName(String str) {
		this.str=str;
	}
		
	public String call() throws Exception {

		Thread.sleep(4000);
		
		return str ;
	}


	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		FetchName f1=new FetchName("Anshul");
		FetchName f2=new FetchName("Anshul 1");
		FetchName f3=new FetchName("Anshul 2");
		FetchName f4=new FetchName("Anshul 3");
		
		ExecutorService service = Executors.newFixedThreadPool(1);
		
		Future<String> name1= service.submit(f1);
		Future<String> name2=service.submit(f2);
		Future<String> name3=service.submit(f3);
		Future<String> name4=service.submit(f4);
		
		System.out.println(name1.get());
		System.out.println(name2.get());
		System.out.println(name3.get());
		System.out.println(name4.get());
		
		service.shutdown();
	}

	
	
}
