package leetcode;

public class rearrange_ele {
public static void main(String[]args) {
	int []nums= {3,1,-2,-5,2,-4};
	int neg=1;
	int pos=0;
	int []arr=new int[nums.length];
	
	for(int i=0;i<nums.length;i++) {
		if(nums[i]>0) {
			arr[pos]=nums[i];
			pos=pos+2;
		}
		else {
			arr[neg]=nums[i];
			neg=neg+2;
		}
	}
for(int i=0;i<arr.length;i++) {
	System.out.println(arr[i]);
}
}
}