package jc_code;

public class merge_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {6,4,6,2,6,9,10};
		ms(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	
	public static void ms(int arr[],int si,int ei) {
			
		if(si>=ei) {
			return;
		}
		int mid=(si+ei)/2;
		ms(arr,si,mid);
		ms(arr,mid+1,ei);
		merge(arr,si,ei);
			
	}
	
	
	public static void merge(int arr[],int si,int ei) {
		int mid=(si+ei)/2;
		int i=si;
		int j=mid+1; 
		int ans[]=new int[ei-si+1];
		int k=0;
		while(i<=mid && j<=ei) {
			if(arr[i]<arr[j]) {
				ans[k]=arr[i];
				k++;
				i++;
			}else {
				ans[k]=arr[j];
				k++;
				j++;
			}
		}
		while(i<=mid) {
			ans[k]=arr[i];
			k++;
			i++;
		}
		while(j<=ei) {
			ans[k]=arr[j];
			k++;
			j++;
		}
		for(int idx=0;idx<ans.length;idx++) {
			arr[si+idx]=ans[idx];
		}
		
	}
	
}
