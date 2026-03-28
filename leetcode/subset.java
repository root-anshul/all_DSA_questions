package leetcode;
import java.util.*;
public class subset {
	public static void main(String []args) {
		int arr[]= {1,2,3};
		List<List<Integer>> res= new ArrayList();
	
		subset(0,arr,new ArrayList(),res);
		
		 
	} 
	static void subset(int idx,int []arr,List<Integer> curr, 
			List<List<Integer>> res){
	     res.add(new ArrayList(curr));
	    for(int i=idx;i<arr.length;i++){
	        curr.add(arr[i]);
	        subset(i+1,arr,curr,res);
	        curr.remove(curr.size()-1);
	        }
	    List<List<Integer>> res1= new ArrayList();
	    res1=res;
	    System.out.println(res1);
	 }
}