package test.copy;

import java.util.Scanner;

public class pat_test {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int i=1;
		while(i<=n) { 
			int j=1;
			while(j<=n) {
				if(j<=n-i) {
				System.out.print(n-j+1);
				}if(j==n-i+1) { 
					System.out.print("*");
				}
				j++;
			}
			
			j=1;
			while(j<=n) {
				if(j>=n-i+2) {
				System.out.print(n-j+1); 
				
			}
				j++;
		}
			System.out.println();
			i++;
		}
		
		
	}
}
