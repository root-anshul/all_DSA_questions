package jc_code;

import java.util.Scanner;

public class prime {
public static void main(String []args) {
	Scanner in =new Scanner(System.in);
	int a=23;
	int count=0;
	int i=2;
	while(a>i) {
		if(a%i==0) {
			count++;
			
		}
		
		i++;
	}
	if(count==1) {
		System.out.println("not prime");
	}
	else {
		System.out.println(" prime");
	}
	
}
}
