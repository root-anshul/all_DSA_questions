package test;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t>0) {
			 int a=in.nextInt();
			 int b=in.nextInt();
			 int min=0;
				int ans=0;
			 int i=1;
			if(a<=b) {
				min=a;
			}else {
				min=b;
			}
			
			while(i<=min) {
				if(a%i==0 && b%i==0) {
					ans=Math.max(ans, i);
				}
				i++;
			}
			

			System.out.println(ans);
			t--;
			
		}
		
			
			
			
		
			
		
		

	}

}
