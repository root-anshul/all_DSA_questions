package recursion.copy;
import java.util.ArrayList;

public class subsequence_sum_equal_k {
public static void main(String []args) {
	int []arr= {1,2,1};
	int k=2;
	ArrayList<Integer> list= new ArrayList();
	int sum=0;
	sub(0,list,0,arr,k);
}

public static void sub(int idx,ArrayList<Integer> list
	,int s,int []arr,int k){
	
	if(idx<=arr.length) {
		if(s==k) {
		System.out.println(list);
		}
		}
	
	list.add(arr[idx]);
	
	s+=arr[idx];
	
	sub(idx+1,list,s,arr,k);
	
	s-=arr[idx];
	
	list.remove(arr[idx]);
	
	sub(idx+1,list,s,arr,k);
	
	
}
}
