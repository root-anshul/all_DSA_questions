package recursion;

public class num_reverse {
	public static void main(String []args) {
		int n=12345;
		recu(n);
		System.out.println(sum); 
		
		
	}
	 static int sum=0;
	public static void recu(int n) {
		if(n==0) {
			return;
		}
		
		int num=n%10;
		 sum=(sum*10)+num;
		 recu(n/10);
		
		
	}
}
