package recursion;

public class factorial {
public static void main(String []args) {
	int n=3;
	System.out.println(recu(n)); 
	}

	public static int recu(int n) {
		if(n==0) {
			return 1;
		}
		return n* recu(n-1);
	}
}
