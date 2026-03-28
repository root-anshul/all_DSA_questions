package leetcode;

public class richest_person {
public static void main(String []args) {
	int[][]arr= {
			{1,2,3},
			{3,2,1}
	};
System.out.println(maximumWealth(arr));	
	
}
static int maximumWealth(int[][] arr) {
 int ans=Integer.MIN_VALUE;
	for(int i=0;i<arr.length;i++) {
		int sum=0;
		for(int j=0;j<arr[i].length;j++) {
			sum=sum+arr[i][j];
		}
		if(sum>ans) {
			ans=sum;
		}
	}
	return ans;
	
}
}
