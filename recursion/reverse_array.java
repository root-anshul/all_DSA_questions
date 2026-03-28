package recursion;

public class reverse_array {
	public static void main(String []args) {
		int arr[]= {1,2,3,4,5};
		int len=arr.length;
		recu(0,len,arr);
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
			}
			
		}
		public static void recu(int i,int len,int []arr) {
			if(i>=len/2) {
				return;
			}
			int temp=arr[i];
			arr[i]=arr[len-i-1];
			arr[len-i-1]=temp;
			recu(i+1,len,arr);
			
		}
//		public static void swap(int start,int end) {
//			int temp=start;
//			start=end;
//			end=temp;
//		}
}
