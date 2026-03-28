package recursion.copy;

public class sum_of_n_natural_no {
	public static void main(String []args) {
		int n=5;
		System.out.println(rec(n)); 
	}
	public static int rec(int n) {
		if(n==0) {
			return 0;
		}
		int ans=n+rec(n-1);
		return ans;
	}
}
