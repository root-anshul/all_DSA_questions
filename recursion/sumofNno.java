package recursion;

public class sumofNno {
	public static void main(String []args) {
	
		int n=3;
		int sum=0;
		recu(n,sum);
		System.out.println("======");
		System.out.println(recu(n) ); 
		
	}
	public static void recu(int n,int sum) {
		if(n<=0) {
			System.out.println(sum);
		return;
		}
		 sum=sum+n;
		 //System.out.println(sum);
		 recu(n-1,sum);
		 //System.out.println(sum);
	}
	public static int recu(int n) {
		if(n==0) {
			return 0;
		}
		
		return n+recu(n-1);
		
	}
	
}
