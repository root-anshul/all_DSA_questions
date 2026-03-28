package Leetcode_100;

public class buy_sell_II {
	public static void main(String []args) {
		int arr[]= {7,6,4,3,1};
		
		int ele=arr[0];
		int sum=0;
		int ans=0;
		
		for(int i=1;i<arr.length;i++) {
			sum=Math.max(sum, arr[i]-ele);
			ele=Math.min(ele, arr[i]);
			
			if(sum>0) {
				ans=ans+sum;
				sum=0;
				ele=arr[i];
			}
		}
		System.out.println(ans);
	}
}
