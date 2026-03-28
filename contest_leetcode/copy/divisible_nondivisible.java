package contest_leetcode.copy;

public class divisible_nondivisible {
	public static void main(String []args) {
		int n=10;
		int m=3;
		int sum1=0;
		int sum2=0;
		for(int i=1;i<=n;i++) {
			if(i%m!=0) {
				sum1=sum1+i;
			}
			if(i%m==0) {
				sum2=sum2+i;
			}
		}
		int ans=sum1-sum2;
	}
}
