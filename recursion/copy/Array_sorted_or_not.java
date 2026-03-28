package recursion.copy;

public class Array_sorted_or_not {
public static void main(String[]args) {
	int arr[]= {
			1,2,3,4,5
	};
	System.out.println(arr.length);
	System.out.println(sortarray(0,arr)) ;
}


public static boolean sortarray(int idx,int []arr) {
	
	if(idx==arr.length-1) {
		return true;
	}
	
	boolean sort=sortarray(idx+1,arr);
		System.out.println(arr[idx]);
	boolean ans=sort & arr[idx]<=arr[idx+1];
		
	return ans;	
}
}
