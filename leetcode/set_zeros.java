package leetcode;

import java.util.Arrays;

public class set_zeros {
public static void main(String []args) {
	int [][]arr= {{1,1,1},{1,0,1},{1,1,1}};
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length;j++) {
			if(arr[i][j]==0) {
				makerow(arr,i);
				makecol(arr,j);
			}
		}
	}
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length;j++) {
			if(arr[i][j]==-1) {
				arr[i][j]=0;
			}
			}
		
}
	
}

public static void makerow(int [][]arr,int i) {
	for(int j=0;j<arr.length;j++) {
		if(arr[i][j]!=0) {
			arr[i][j]=-1;
		}
	}
}
public static void makecol(int [][]arr,int j) {
	for(int i=0;i<arr.length;i++) {
		if(arr[i][j]!=0) {
			arr[i][j]=-1;
		}
	}
	
	
}
}
