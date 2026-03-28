package recursion;

public class count_zeros {
	public static void main(String []args) {
		int n=100;
		recu(n);
		System.out.println(count);
		
	}
	static int count=0;
	public static void recu(int n) {
		if(n<=0) {
			return;
		}
		int rem=n%10;
		if(rem==0) {
			count++;
		}
		recu(n/10);
	}
}
