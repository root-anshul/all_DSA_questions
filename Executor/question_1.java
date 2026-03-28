package Executor;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class countnumber implements Runnable{
	
	public int count = 0;
	
	public countnumber(int count) {
		this.count=count;
	}
	
	public void run() {
		for(int i=1;i<=count;i++) {
			System.out.println(i);
		}
	}
}




public class question_1 {

	public static void main(String[] args) {
		countnumber c=new countnumber(10);
		
		ExecutorService service = Executors.newSingleThreadExecutor();
		service.submit(c);
		service.shutdown();

	}

}
