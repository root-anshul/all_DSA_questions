package leetcode;

public class climbing_stairs {

	public static void main(String[] args) {
		int n = 6;
		
		int ans=ss(n);
		System.out.println(ans);
	}
	public static int ss(int n) {
		if(n==0|| n==1) {
			return 1;
		}
		return ss(n-1)+ss(n-2);
		
	}
}
