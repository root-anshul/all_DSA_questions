package jc_code;

import java.util.Arrays;
import java.util.Scanner;

public class arrrr {
public static void main(String []args) {
	int arr[]= {5,1,5,1};
	 Arrays.sort(arr);
//	 for(int i=0;i<arr.length;i++) {
//	 System.out.println(arr[i]);
//	 }
	 int n=arr.length;
     int min1=arr[0];
     int min2=arr[n/2];
      for(int i=0;i<n/2;i++){
          if(arr[i]<min1){
              min1=arr[i];
              
          }
      }
      //System.out.println(min1);
      for(int i=n/2;i<arr.length;i++){
          if(arr[i]<min2){
              min2=arr[i];
          }
      }
      //System.out.println(min2);
     //System.out.println(min1+min2);
//     double a = 6/ 4;
//     System.out.println(a);
//     int b  = 6 / 4;
//     double c = a + b;
//     System.out.println(c);
     
//     double a = 55.5;
//     int b = 55;
//     a = a % 10;
//     b = b % 10;
//     System.out.println(a + " "  + b);
      Scanner in =new Scanner(System.in);
     int p=in.nextInt();		
		float r=in.nextFloat();
		int t=in.nextInt();
		int si=(int)(p*r*t)/100;
		System.out.print(si);
}
}
