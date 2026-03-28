package leetcode;

public class time_buy_tickets {
	public static void main(String []args) {
		int arr[]= {5,1,1,1};
		int k=0;
		int time=0;
		
		
		while(arr[k]>0) {
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {
				time++;
				arr[i]=arr[i]-1;
			}
		}
		if(arr[k]==0) {
			break;
		}
	}
		System.out.println(time);
}
}