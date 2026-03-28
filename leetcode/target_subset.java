package leetcode;

import java.util.Scanner;

public class target_subset {

	public static void main(String[] args) {
Scanner in =new Scanner(System.in);
int n=in.nextInt();
int []arr=new int[n];
for(int i=0;i<arr.length;i++) {
	arr[i]=in.nextInt();
}
	int tar= in.nextInt();
	int ans=ptar(arr,tar);
	
	System.out.println(ans);
	}
	public static int ptar(int[] nums, int target) {
        //Solution 1
        int sum = 0;
        for(int x : nums)
            sum += x;
        if(((sum - target) % 2 == 1) || (target > sum))
            return 0;
        
        int n = nums.length;
        int s2 = (sum - target)/2;
        int[][] t = new int[n + 1][s2 + 1];
        t[0][0] = 1;
        
        for(int i = 1; i < n + 1; i++) {
            for(int j = 0; j < s2 + 1; j++) {
                if(nums[i - 1] <= j)
                    t[i][j] = t[i-1][j] + t[i - 1][j - nums[i - 1]];
                else
                    t[i][j] = t[i - 1][j];
            }
        }
        return t[n][s2];
	}
}
