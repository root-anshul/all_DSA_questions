package test_2;

import java.util.ArrayList;

public class leader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3, 12 ,34, 2 ,0 ,-1};
		int j=0;
			for(int i=0;i<arr.length-1;i++) {
				for(j=i+1;j<arr.length;j++) {
					if(arr[j]>arr[i]) {
						break;
					}
				}
				if(j==arr.length) {
					System.out.print(arr[i]+" ");
				}
			}
			System.out.print(arr[arr.length-1]);
	}

}
