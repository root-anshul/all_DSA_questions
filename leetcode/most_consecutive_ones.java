package leetcode;

public class most_consecutive_ones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int arr[]= {1,0,1,1,0,1};
			int ans=0;
			int count=0;
			for(int i=0;i<arr.length;i++) {
				if(arr[i]==1) {
					count++;
				}else {
					count=0;
				}
				ans=Math.max(ans, count);
			}
			System.out.println(ans);
			
	}

}
