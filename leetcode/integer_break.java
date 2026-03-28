package leetcode;

public class integer_break {
	public static void main(String []args) {
		int n=12;
	System.out.println(intb(n));	
	}
	public static int intb(int n) {
		if(n<=3) {
			return n-1;
		}
		int ans=1;
		while(n>4) {
			ans=ans*3;
			n=n-3;
		}
		
		return ans*n;
		 
}
}