package jc_code;

public class plus_one {
public static void main(String args[]) {
	
	int[] arr= {1,2,3,4};
	one (arr);
	
}
public static int[] one(int[] arr) {
	for(int i=arr.length-1;i>0;i--) {
		if(arr[i]<9) {
			arr[i]=arr[i]+1;
			return arr;
		}
		
	}
	arr=new int[arr.length+1];
	arr[0]=1;
	return arr;
}
}
