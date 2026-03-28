package jc_code;
import java.util.Arrays;
import java.util.Scanner;
public class merge_array {
public static void main(String args[]) {
	int [] arr= {2,7,11,15};
 	int t=9;
 	int[] arr1=mer(arr,t);
// 	for(int i =0;i<arr1.length;i++) 
// 	{
 	System.out.println(arr1);

 	
 	}
public static int[] mer(int []arr,int t) {
	int start=0,end=arr.length-1;
 	while(start<end) {
 		int sum=arr[0]+arr[arr.length-1];
 		if(sum>t) {
 			end--;
 		}
 		else if(sum<t) {
 			start--;
 		}
 		else {
 			return new int[] {start+1,end+1};
 		}
 	}
 	return new int[] {};
 	


}

}