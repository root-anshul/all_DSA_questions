package CN_week_18_DP;

public class min_steps_to_1 {
	
//	public static int stepsrecc(int n) {
//		return stepsrecchelper(n,0);
//	}
//	
//	
	//recurssion
	
	public static int stepscount(int n) {
		if(n==1) {
			return 0;
		}
		
		int opt1=stepscount(n-1);
		int min=opt1;
		
		if(n%3==0) {
			int opt2 =stepscount(n/3);
			if(min>opt2) {
				min=opt2;
			}
		}
		if(n%2==0) {
			int opt3 =stepscount(n/2);
			if(min>opt3) {
				min=opt3;
			}
		}
		return min+1;
		
		
	}
	
	//memoizaition
	
	public static int  stepscountmemo(int n) {
		int arr[]=new int[n+1];
		return stepscountmemohelper(n,arr);
	}
	
	public static int stepscountmemohelper(int n,int arr[]) {
		
		
		if(n==1) {
			arr[n]=0;
			return arr[n];
		}
		
		if(arr[n]!=0) {
			return arr[n];
		}
		int opt1=stepscountmemohelper(n-1,arr);
		int min=opt1;
		
		if(n%3==0) {
			int opt2 =stepscountmemohelper(n/3,arr);
			if(min>opt2) {
				min=opt2;
			}
		}
		if(n%2==0) {
			int opt3 =stepscountmemohelper(n/2,arr);
			if(min>opt3) {
				min=opt3;
			}
		}
		arr[n]=min+1;
		return arr[n];
		
	}
	
//	DP approach 
	
	public static int stepscountDP(int n) {
		int arr[]=new int[n+1];
		arr[1]=0;
		
		for(int i=2;i<arr.length;i++) {
			int min =arr[i-1];
			if(i%3==0) {
				if(min>arr[i/3]) {
					min=arr[i/3];
				}
			}
			if(i%2==0) {
				if(min>arr[i/2]) {
					min=arr[i/2];
				}
			}
			
			arr[i]=1+min;
			
		}
		return arr[n];
	}
	
	
	public static void main(String[] args) {
		int n=10;
		
		System.out.println(stepscount(n));
		System.out.println(stepscountmemo(n));
		System.out.println(stepscountDP(n));
	}

}
