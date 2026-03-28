package leetcode;

public class Sorted_Rotated {
	public static void main(String[] args) {
		int arr[]= {2,1,3,4};
		int arr1[]= {3,4,5,1,2};
		int arr2[]= {6,8,7,6,9};
		check(arr);
		check(arr1);
//
		check(arr2);
//		
		
	}
	public static void check(int []arr) {
		int count=0;
		for(int i=1;i<arr.length;i++) {
			if(arr[i-1]>arr[i]) {
				count++;
			}
			
		}
		if(arr[arr.length-1]>arr[0]) {
			count++;
		}
		if(count<=1) {
			System.out.println(true);
			//return true;
		}else {
			System.out.println(false);
			//return false;
		
	}
		}
}
