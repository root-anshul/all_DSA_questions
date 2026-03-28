package leetcode;

public class buy_sell {
public static void main (String[] args) {
	int []arr= {7,1,5,3,6,4};
	
	int minsofar=arr[0];
	int max=0;
	for(int i =0;i<arr.length;i++) {
		minsofar=Math.min(minsofar, arr[i]);
		int pro=arr[i]-minsofar;
		max=Math.max(pro, max);
	}
	System.out.println(max);
}
}
