package jc_code;
import java.util.Scanner;
public class alleq {
public static void main(String args[]) {
	
	Scanner in=new Scanner(System.in);
	int t=in.nextInt();

	while(t-->0) {
		int n=in.nextInt();
		int arr[]=new int [n];
		int m=in.nextInt();
		int k=0;
		for(int i=0;i<arr.length;i++) {
			arr[i]=in.nextInt();

			 if(arr[i]>m) {
				 k++;
			 
		 }
		}
	
		 
	System.out.print(k);
	
}
}
}