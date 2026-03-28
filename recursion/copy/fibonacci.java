package recursion.copy;

public class fibonacci {
public static void main(String []args) {
		int n=4;
		System.out.println(recu(n));
		
		
	}
	public static int  recu(int n) {
		if(n<=1) return n;
		
		int last=recu(n-1);
		int slast=recu(n-2);
		return last+slast;
		
		
	}
}
