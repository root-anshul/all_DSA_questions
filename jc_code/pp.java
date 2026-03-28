package jc_code;
import java.util.Scanner;
public class pp {
public static void main (String args[]) {
	Scanner in =new Scanner(System.in);
	
	
	int n=in.nextInt();
	int a=2;
	 while (a <= n) {
         int i = 2, count = 0;
         while (i <= a / 2) {
             if (a % i == 0) {
                 count++;
                 break;
             }
             i++;
         }
         if (count == 0) {
             System.out.println(a );
         }
         a++;
     }
	
}

}
