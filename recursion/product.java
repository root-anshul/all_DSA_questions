package recursion;

public class product {
	public static void main(String []args) {
		int n=54;
		int ans=recu(n);
		System.out.println(ans);
		
	}
	public static int recu(int n) {
		if(n<10) {
			return n;
		}
		
		int rem=  recu(n%10);
		int num =recu(n/10);
		return rem*num;
		
	}
}
