package recursion;

public class occurrences {
	public static void main(String []args) {
		int arr[]= {3,2,4,5,6,2,7,2,2};
		int key=2;
		occur(arr, 0, 2);
	}
	
	public static void occur(int []arr,int idx,int key) {
		if(idx==arr.length) {
			return ;
		}
		if(arr[idx]==key) {
			System.out.print(idx);
		}
		occur(arr,idx+1,key);

	}	
}
