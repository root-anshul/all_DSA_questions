package leetcode;

public class next_permuntation {

	public static void main(String[] args) {
		int arr[]= {3,2,1};
		int ind=-1;
		for(int i=arr.length-2;i>=0;i--) {
			if(arr[i]<arr[i+1]) {
				ind=i;
				break;
			}
		}
		if(ind==-1) {
			reverse(arr,ind+1,arr.length-1);
			
			return;
		}
//		System.out.println(arr[ind]);
		for(int i=arr.length-1;i>=ind;i--) {
			if(arr[i]>arr[ind]) {
//				System.out.println(arr[i]);
				int temp=arr[i];
				arr[i]=arr[ind];
				arr[ind]=temp;
				break;
			}
		}
		reverse(arr,ind+1,arr.length-1);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

	private static void reverse(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		while(i<=j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
	}

}
