package CN_week_17_Priority_Queues_2;

import java.util.PriorityQueue;
public class K_sorted_array {

	
	public static void kSort(int arr[],int k) {
		PriorityQueue<Integer>pq=new PriorityQueue<Integer>();
		
		int i=0;
		for(;i<k;i++) {
			pq.add(arr[i]);
		}
		
		/*n elements 
		 * putting k elements in pq 
		 * insertion and deletion T.C. = logK
		 * so nlogK (insertion) + nlogK (deletion)
		 * total work = O(nlogK)
		 * */
		
		for(;i<arr.length;i++) {
			arr[i-k]=pq.remove();
			pq.add(arr[i]);
		}
		for(int l=arr.length-k;l<arr.length;l++) {
			arr[l]=pq.remove();
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,2,1,6,5,4,9,8,7};
		int k=3;
		kSort(arr,k);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
