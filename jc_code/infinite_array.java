package jc_code;
//amazon
public class infinite_array {
public static void main(String [] args) {
	
	int[]arr= {1,2,3,4,5,6,7,8,9,10,11,12,13,15,17,20,22,25};
	int target=6;
	System.out.println(sandeidx(arr,target));
	
} 

static int sandeidx(int []arr,int tar) {
	int start=0;
	int end=1;
	while(tar>arr[end]) {
		int temp=end+1;
		end=end+(end-start+1)*2;
		start=temp;
	}
	return searchele(arr,tar,start,end);
	
}
static int searchele(int []arr,int tar,int start,int end) {
	
	while(start<=end) {
		int mid=start+(end-start)/2;
		if(tar>arr[mid]) {
			start=mid+1;
			
		}
		else if(tar<arr[mid]) {
			end=mid-1;
		}
		else {
			return mid;
		}
	}
	
	return -1;
	
}

}
