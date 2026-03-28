package CN_week_17_Priority_Queues_1;

public class PriorityQueueUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue que=new PriorityQueue();
		
		int arr[]= {5,1,9,2,0}; 
		for(int i=0;i<arr.length;i++) {
			que.insert(arr[i]);
		}
		
		while(!que.isEmpty()) {
			System.out.print(que.removeMax()+" ");
		}
		System.out.println();
	}

}
