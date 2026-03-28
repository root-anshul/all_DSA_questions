package leetcode;

public class merge_sorted_array {
public static void main(String[]args) {
	int arr1[]= {1,2,3,0,0,0};
	int arr2[]= {2,5,6};
	int m=3;
	int n=3;
	int ans[]=new int[m+n];
	int i=0;
	int j=0;
	int k=0;
		while(i<m&&j<n) {
		
			if(arr1[i]<arr2[j]) {
				ans[k]=arr1[i];
				i++;
				k++;	
			}else if(arr1[i]==arr2[j]){
				ans[k]=arr1[i];
				i++;
				k++;
				ans[k]=arr2[j];
				j++;
				k++;
				
			}else {
				ans[k]=arr2[j];
				k++;
				j++;
			}
			
	}
		if(i<m) {
			while(i<m) {
				ans[k]=arr1[i];
				k++;
				i++;
				
			}
		}
		
		if(j<n) {
			while(j<n) {
				ans[k]=arr2[j];
				k++;
				j++;
				
			}
		}
		System.out.println(1%2);
		k=0;
		for(int l=0;l<ans.length;l++) {
			arr1[k]=ans[l];
			k++;
		}
		for(int l=0;l<ans.length;l++) {
			System.out.print(arr1[l]+" ");
		}
}

}
