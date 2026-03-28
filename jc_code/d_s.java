package jc_code;
import java.util.Scanner;
public class d_s {
	public static void main(String args[]) {
		Scanner in =new Scanner(System.in);
		int t=in.nextInt();
		int n=in.nextInt();
		int a[]=new int[n];
		int count=0;
		for(int i=0;i<a.length;i++) {
			a[i]=in.nextInt();
		}
		
		while(t-->0) {
			for(int i=0;i<a.length-1;i++) {
				if(a[i]==1 && a[i+1]==0) {
					a[i+1]=1;
					count++;
				}
					
				}
			}
			
		System.out.println(count);
		}
		
		
		
	}


