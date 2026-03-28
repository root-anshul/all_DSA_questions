package leetcode;

public class concentration_of_array {
	public static void main(String[]args) {
		int arr[]= {1,2,1};
		
		int []arr1=new int[2*arr.length];
		System.out.println(arr1.length);
		for(int i=0;i<arr.length;i++) {
			arr1[i]=arr[i];
		}
		
		for(int i=0;i<arr.length;i++) {
			arr1[arr.length+i]=arr[i];
		}
		
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
	
	}
	
	
}
