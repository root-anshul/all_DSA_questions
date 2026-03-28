package jc_code;

public class majorityele {
public static void main (String args[]) {
	int []arr= {2,2,2,2,2,2,5,5,5,5,5,5,5,5,5,5,5,1};
	int m=major(arr);
	System.out.println(m);
	
}
public static int major(int []arr) {
int count=0;
	
	int ele=arr[0];
	for(int i=0;i<arr.length;i++) {
		
		if(ele==arr[i]) {
			count++;
			
			
		}
		
		else {
			count--;
//			System.out.println(count);
		}
		
		if(count==0) {
			ele=arr[i];
			count=1;
			
			
		}
		
	}
	return ele;

}
}