package Leetcode_100;

public class move_zeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {0,1,0,3,12};
		int ans[]=new int[arr.length];
		
		int k=0;
		int j=ans.length-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				ans[j]=arr[i];
				j--;
			}else {
				ans[k]=arr[i];
				k++;
			}
		}
		for(int i=0;i<arr.length;i++) {
			arr[i]=ans[i];
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
