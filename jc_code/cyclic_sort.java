package jc_code;

public class cyclic_sort {
public static void main(String [] args) {
	int arr[]= {4,3,2,1,5};
	int correct=0;
	for(int i=0 ;i<arr.length;i++) {
		correct=arr[i]-1;
		if(arr[i]!=correct) {
			int temp=arr[i];
			arr[i]=arr[correct];
			arr[correct]=temp;
		}
	System.out.print(arr[i]+" ");
	}
	
}
}
