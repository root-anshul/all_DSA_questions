package Leetcode_100;

public class jump_game_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,1,1,1};
		int min=0;
		int step=0;
		int n=arr.length-1;
		int prevstep=0;
		for(int i=0;i<arr.length;i++) {
			if(step>=n) {
				break;
			}
			prevstep=step;
			step=Math.max(step, arr[i]+i);
			if(step>prevstep) {
			min++;
		}
		}
		System.out.println(min);
	}

}
