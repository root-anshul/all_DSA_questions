package contest.copy;

public class binarysearch {
	public static void main(String[] args) {
		int arr[]= {1,1,2,2,2,2,3};
		int x=2;
		int count=0;
		
		int start=0;
		int end=arr.length-1;
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(arr[mid]==x) {
				count++;
			}
			if(arr[mid]<x) {
				
				start=mid+1;
			}
			else {
				end =mid-1;
			}
			System.out.println("00");
		}
		System.out.println(count);
	}
}
