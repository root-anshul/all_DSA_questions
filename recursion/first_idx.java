package recursion;

import java.util.Scanner;

public class first_idx {
public static void main(String args[]) {
		
		Scanner in =new Scanner(System.in);
		int n=in.nextInt();

		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=in.nextInt();
		}
		int tar=in.nextInt();
		
		int ans=ind(arr,tar,0);
		System.out.println(ans);
	}
	public static int ind(int []arr,int tar,int idx){

			if(idx==arr.length){
				return -1;
			}
		
			if(arr[idx]==tar){
				return idx;
			}
			else {
				int fo=ind(arr,tar,idx+1);
				return fo;
			}

			



	}		

}
