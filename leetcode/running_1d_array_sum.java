package leetcode;

public class running_1d_array_sum {
	
	public static void main(String[] args) {
		int[]nums= {1,2,3,4};
		
		int arr[]=new int[nums.length];
		arr[0]=nums[0];
		
		for(int i=1;i<nums.length;i++) {
			arr[i]=arr[i-1]+nums[i];
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
