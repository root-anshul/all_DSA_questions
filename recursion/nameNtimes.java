package recursion;

import java.util.Scanner;

public class nameNtimes {
	public static void main(String []args) {
		   String name="Abc";
		   int n=5;
		   recu(n);
		   
}
 public static void recu(int n) {
		if(n<=0) {
			return;
		}
	System.out.println(n);
		recu(n-1);
 	System.out.println(n);
	
	}

} 

