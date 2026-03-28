package Leetcode_100;

public class containg_most_water {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,8,7,9,6,5,10,9};
		int res=0;
		int min=0;
		int l=0;
		int r=arr.length-1;
		while(l<r) {
			int left=arr[l];
			int right=arr[r];
			
			min=Math.min(left, right);
			int mul=min*(r-l);
			res=Math.max(res, mul);
			if(left>right) {
				r--;
			}else {
				l++;
			}
		}
		System.out.println(res);
	}

}
