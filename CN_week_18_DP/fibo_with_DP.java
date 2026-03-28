package CN_week_18_DP;

public class fibo_with_DP {

	
	public static int fib(int n) { // basic fib code
		if(n==0||n==1) {
			return n;
		}
		return fib(n-1)+fib(n-2);
		
	}
	
	public static int fibM(int n) {
		int arr[]=new int[n+1];
		for(int i=0;i<arr.length;i++) {
			arr[i]=-1;
		}
		return fibMhelper(arr,n);
	}
	
	public static int fibMhelper(int []arr,int n) {
		if(n==0||n==1) {
			arr[n]=n;
			return arr[n];
		}
		if(arr[n]!=-1) {
			return arr[n];
		}
		arr[n]=fibMhelper(arr,n-1)+fibMhelper(arr,n-2);
		return arr[n];
	}
	
	
	public static int fibDP(int n) {
		int arr[]=new int[n+1];
		arr[0]=0;
		arr[1]=1;
		for(int i=2;i<arr.length;i++) {
			arr[i]=arr[i-1]+arr[i-2];
		}
		return arr[n];
	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=45;
		System.out.println(fibDP(n));
		System.out.println(fibM(n));
		System.out.println(fib(n));
	}

}
