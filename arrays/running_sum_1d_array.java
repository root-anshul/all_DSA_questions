package arrays;

public class running_sum_1d_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,3,4};

		
		int ans[]=running(arr);
		

	}
	public static int[] running (int[] arr) {
	
		for(int i=1;i<arr.length;i++) {
			
			int temp = arr[i-1];
			arr[i] += temp;
			
		}
		return arr;
		
		
	}

}
