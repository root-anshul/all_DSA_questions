package recursion.copy;

import java.util.Scanner;

public class AllIndicesinArray {
public static void main(String args[]) {
		
		Scanner in =new Scanner(System.in);
		int n=in.nextInt();

		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=in.nextInt();
		}
		int tar=in.nextInt();
		
		int[] ans=ind(arr,tar,0,0);
		for(int i=0;i<arr.length;i++) {
		System.out.println(ans[i]);
		}
	}
public static int[] ind(int []arr,int tar,
		int idx,int count){
	if(idx==arr.length){
		return new int[count];
	}
	if(arr[idx]==tar) {
		int arr1[]= ind(arr,tar,idx+1,count+1);
		arr1[count]=idx;
		return arr1;
	}
	else {
		int arr1[]=ind(arr,tar,idx+1,count);
		return arr1;
	}
	
}
}
