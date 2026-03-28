package backtraking;

import java.util.Scanner;

public class towerofHanoi {
	public static void main(String args[]) {
		Scanner in =new Scanner(System.in);
		int n=in.nextInt();	
			int arr[]=new int[n];
			for(int i=0;i<arr.length;i++){
				arr[i]=in.nextInt();
			}

			rev(arr,0);
	}
	public static void rev(int[]arr,int idx){
		if(idx==arr.length){
			return;
		}
		rev(arr,idx+1);
		System.out.println(arr[idx]+" ");

	}
}
