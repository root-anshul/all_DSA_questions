package test_2;


import java.util.Scanner;


public class print_n_times {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		
		int arr[][]= {{1,2,3,},{4,5,6},{7,8,9}};
		int n=arr.length;
		System.out.println(n);
		int i=0;
		int num=0;
		int l=n;
		while(i<n) {
			int k=0;
			
			while(k<l ) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[num][j]+" ");
				}
			System.out.println();
			k++;
			
			}
			l--;
			num++;
			i++;
		}
		
		
	}
}
