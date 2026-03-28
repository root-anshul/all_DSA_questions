package recursion;

public class no_to_string {
	static String arr[]= {"zero","one","two","three","four",
			"five","six","seven","eight","nine"};
	public static void main(String []args) {
		int n=2019;
		
		convert(n);
		
	}
	public static void convert(int n) {
		if(n==0) {
			return;
		}
		int ans=n%10;
		convert(n/10);
	System.out.print(arr[ans]+" ");
		
		
	}
}
