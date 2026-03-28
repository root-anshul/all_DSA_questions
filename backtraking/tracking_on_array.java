package backtraking;

public class tracking_on_array {
	public static void main(String []args) {
		int arr[]=new int[5];
		back(arr,0,1);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	
	public static void back(int []arr,int idx,int val) {
		if(idx==arr.length) {
//			for(int i=0;i<arr.length;i++) {
//				System.out.print(arr[i]+" ");
//			}
			return;
		
		}
		
		arr[idx]=val;
		back(arr,idx+1,val+1);
		arr[idx]=arr[idx]-2;
		
	}
	
}

