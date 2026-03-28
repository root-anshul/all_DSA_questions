package recursion.copy;

import java.util.Scanner;

public class last_idx {
public static void main(String[] args) {
	Scanner in =new Scanner(System.in);
	int n=in.nextInt();

	int arr[]=new int[n];
	for(int i=0;i<arr.length;i++) {
		arr[i]=in.nextInt();
	}
	int tar=in.nextInt();
	
	int ans=last(arr,tar,0);
	System.out.println(ans);
}
	public static int last(int []arr,int tar,int idx) {
		if(idx==arr.length) {
			return -1;
		}
		int liisa=last(arr,tar,idx+1);
		if(liisa==-1) {
			if(arr[idx]==tar) {
				return idx;
			}
			else {
				return liisa;
			}
		}
		else {
			return liisa;
		}
		
		
	}
}

