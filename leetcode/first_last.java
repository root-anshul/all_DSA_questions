package leetcode;
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/
public class first_last {
public static void main(String []args) {
	
	
}

public int[] searchRange(int[]nums, int tar) {
	int arr[]= {-1,-1};
	arr[0]=search(nums,tar,true);
	
	if(arr[0]!=-1) {
	arr[1]=search(nums,tar,false);
	
	}
	return arr;
	
}
int search(int[] arr,int tar,boolean firststartidx) {
	
	int ans=-1;
	int start=0;
	int end=arr.length-1;
	while(start<=end) {
		int mid=start+(end-start)/2;
		if(tar<arr[mid]) {
			end=mid-1;
			
		}
		
		else if(tar>arr[mid]){
			start=mid+1;
		}
		else {
			ans=mid;
			if(firststartidx) {
				end=mid-1;
			}
			else {
				start=mid+1;
			}
		}
	}
	return ans;
	
	
	
	
	
}
}
