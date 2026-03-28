package recursion.copy;

public class linear_search {
public static void main(String[]args) {
	
	int []arr= {1,2,3,4,5};
	int target=4;
	int ans=recc(arr,target,0);
	
	System.out.println(ans);
}

public static int recc(int[]arr,int tar,int idx) {
	if(idx == arr.length) {
		return -1;
	}
	if(arr[idx]== tar) {
		return idx;
	}
	else {
	return recc(arr,tar,idx+1);
}
}
}
