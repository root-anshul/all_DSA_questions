package test;

import java.util.Scanner;

public class par2_test {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t>0) {
			int n=in.nextInt();
			int i=1;
			while(i<=n) {
				int j=1;
				while(j<=i-1) {
					System.out.print(" ");
					j++;
				}
				j=1;
				while(j<=n-i+1) {
					System.out.print("*");
					j++;
				}
				System.out.println();
				i++;
				
				
			}
			
			
		t--;	
		}
			
		
		
		
		
		

	}

}
