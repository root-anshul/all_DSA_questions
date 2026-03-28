package leetcode;

import java.util.Arrays;

public class longest_consecutive {
public static void main(String []args) {
	  int arr[]= {100,4,200,1,3,2};
	  Arrays.sort(arr);
	  int longest=0;
	  int count=1;
	  int ele=Integer.MIN_VALUE;
	  if(arr.length==0) {
		  System.out.println(0);
	  }
	  
	  
	  for(int i=0;i<arr.length;i++) {
		  if(arr[i]-1==ele) {
			  count++;
			  ele=arr[i];
		  }
		  else if(arr[i]!=ele) {
			  count=1;
			  ele=arr[i];
		  }
		  longest=Math.max(longest,count);
	  }
	  System.out.println(longest);
}
}
