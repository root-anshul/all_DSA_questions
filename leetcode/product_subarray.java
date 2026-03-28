package leetcode;

public class product_subarray {
public static void main(String[]args) {
	int arr[]= {-3};
	int max=1;
	int pro=Integer.MIN_VALUE;
	for(int i=0;i<arr.length;i++) {
		max=max*arr[i];
		pro=Math.max(pro,max);
		if(max==0) {
			max=1;
		}
	}
	max=1;
	for(int i=arr.length-1;i>=0;i--) {
		max=max*arr[i];
		pro=Math.max(pro,max);
		if(max==0) {
			max=1;
		}
	}
	System.out.println(pro);
	
	
}
}
