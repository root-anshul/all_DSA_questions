
package arrays;

public class difference_of_array {
	public static void main(String []args) {
		int arr1[]= {1,0,0,0};
										/*       i
										 * 1 0 0 0
										 * 	     1
										 * --------
										 * 		 9
										 * */
		int arr2[]= {1};
		
		int ans[] = difference(arr1,arr2);
		for(int i =1;i<ans.length;i++) {
			System.out.println(ans[i]);
		}
	}
	
	public static int [] difference(int arr1[], int arr2[]) {
		
		int diff[]= new int[arr1.length];
		
		int i=arr1.length-1;
		int j=arr2.length-1;
		int k=diff.length-1;
//		System.out.println(j);
		
		while(i>0) {
			int temp= j>=0 ? arr2[j] : 0;
					
			if(arr1[i]>=temp) {
				diff[k] = arr1[i]-temp;
			}
			else {
				arr1[i]+=10;
				diff[k]=arr1[i]-temp;
				arr1[i-1] -= 1;
			}
//			System.out.println(j);
			i--;
			j--;
			k--;
		}
		return diff;
		
	}
}
