package jc_code;

public class bs {
public static void main (String []args) {
	int arr[]= {95,70,65,60,55,50,45};
	int target=45;
	 
	int arr1[]= {1,2,3,4,5,6,7,8,9,10};
	int target1=5;
	
	int tar=search(arr,target);
	System.out.println(tar);
	
	System.out.println("===============");
	int tar1=search(arr1,target1);
	
	System.out.println(tar1);
	
}

static int search(int []arr,int target){
	int start=0;
	int end=arr.length-1;
	while(start<end) {
		int mid=start+(end-start)/2;
		if(target>arr[mid]) {
			start=mid+1;
		}
		else if(target<arr[mid]) {
			end=mid-1;
		}
		else {
			return mid;
		}
	}
	
	
	int first=arr[0];
	int last=arr[arr.length-1];
	//asc
	if(first<last) {
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(arr[mid]==target) {
				return mid;
			}
			else if(target>arr[mid]) {
				start=mid+1;
			}
			else if(target<arr[mid]) {
				end=mid-1;
			}
			else {
				return mid;
			}
		}
	}
	//desc
	else {
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(arr[mid]==target) {
				return mid;
			}
			else if(target>arr[mid]) {
				end=mid-1;
			}
			else if(target<arr[mid]) {
				start=mid+1;
			}
			else {
				return mid;
			}
		}
	}
	
	
	
	return -1;
}

}
