package leetcode;

public class Trapping_Rain_Water {
	public static void main(String[]args) {
		int arr[]= {4,2,0,6,3,2,5};
		
		int left[]=new int[arr.length];
		
		int right[]=new int[arr.length];
		int ans=0;
		int min=0;
		int count=0;
		//System.out.print(right.length);
		left[0]=arr[0];
		for(int i=1;i<arr.length;i++) {
			left[i]=Math.max(arr[i],left[i-1]);
	}
//		
//		for(int i=0;i<left.length-1;i++) {
//			System.out.print(left[i]+" ");
//		}
		
			right[right.length-1]=arr[arr.length-1];
		//	System.out.println();
			
		for(int i=arr.length-2;i>=0;i--) {
			right[i]=Math.max(arr[i], right[i+1]);
		}
		

//		for(int i=0;i<right.length-1;i++) {
//			System.out.print(right[i]+" ");
//		}
		
		for(int i=0;i<arr.length;i++) {
			min=Math.min(left[i],right[i]);
			
			count=min-arr[i];
			if(count<0) {
				count=0;
			}
			ans=ans+count;
		}
		System.out.println(ans);
		
	}
}
