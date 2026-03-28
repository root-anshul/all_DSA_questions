package leetcode;

public class single_number {
public static void main(String []args) {

	 int n=4;
	 int i=n;
	 while(i>=0) {
		 int j=0;
		 while(j<=i){
			System.out.print("* ");
			j++;
		 }
		 System.out.println();
		 i-- ;
	 }
	
}
}