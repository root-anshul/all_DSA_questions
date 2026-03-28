package binary_search;

public class lower_bound {
	public static void main(String[]args) {
		int arr[]= {2,3,6,7,8,8 ,11,11,12};
		int n=5;
		int start=0;
		int end=arr.length-1;
		int ans=n;
		while(start<=end) {
			
			int mid=start+(end-start)/2;
		
			if(arr[mid]>=n) {
				ans=arr[mid];
				
				end=mid-1;
			}
			else {
				start=mid+1;
			}
		}
		System.out.println(ans);
		
	}
	
}
