package Leetcode_100;

import java.util.Arrays;

public class single_ele {

	public static void main(String[] args) {
		int arr[]= {2,7,11,15};
		int sum=9;
		// TODO Auto-generated method stub
		  Arrays.sort(arr);
	        int ans[]=new int[2];
	        int i=0;
	        int j=arr.length-1;
	        while(i<j){
	        	int a=arr[i]+arr[j];
	            if(a==sum){
	                ans[0]=i;
	                ans[1]=j;
	            }else if(a>sum){
	                j--;
	            }else{
	                i++;
	            }
	        }
	        for(int k=0;k<ans.length;k++) {
	        	System.out.println(ans[k]);
	        }
		
	}

}
