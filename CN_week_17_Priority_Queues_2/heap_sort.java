package CN_week_17_Priority_Queues_2;

public class heap_sort {

	
	//heap sort using O(1) space and O(n) time complexity
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2 ,6, 8 ,5 ,4, 3};
		for(int i=0;i<arr.length;i++) {
			inplaceHeapSort(arr,i);
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("==========");
		for(int i=0;i<arr.length;i++) {
			arr[arr.length-1-i]=removeMinHeapElement(arr,arr.length-i);
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	
	private static int removeMinHeapElement(int[] arr, int heapSize) {
		// TODO Auto-generated method stub
		int temp=arr[0];
		arr[0]=arr[heapSize-1];
		heapSize--;
		int index=0;
		int leftchildIndex=2*index+1;
		int rightchildIndex=2*index+2;
		while(leftchildIndex<heapSize) {
			int minIndex=index;
			if(arr[leftchildIndex]<arr[minIndex]) {
				minIndex=leftchildIndex;
			}
			if(rightchildIndex <heapSize && arr[rightchildIndex]<arr[minIndex]) {
				minIndex=rightchildIndex;
			}
			if(minIndex!=index) {
				int temp1=arr[index];
				arr[index]=arr[minIndex];
				arr[minIndex]=temp1;
				index=minIndex;
				leftchildIndex=2*index+1;
				rightchildIndex=2*index+2;
				
			}else {
				break;
			}
		}
		return temp;
	}


	private static void inplaceHeapSort(int arr[],int i) {
		int childIndex=i;
		int parentIndex=(childIndex-1)/2;
		
		while(childIndex>0) {
			if(arr[childIndex]<arr[parentIndex]) {
				int temp=arr[childIndex];
				arr[childIndex]=arr[parentIndex];
				arr[parentIndex]=temp;
				
				childIndex=parentIndex;
				parentIndex=(childIndex-1)/2;
						
			}else {
				return;
			}
		}
		
		
	}
}
