package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combination {
	public static void main(String []args) {
		
		int n=4;
		int k=2;
		List<List<Integer>> res= new ArrayList<>();
	    
combine(1,n,k,new ArrayList<>(),res);	
		
	}
	
	public static void combine(int start,int n,int k,List<Integer> ds,List<List<Integer>> res) {
		
		if(ds.size()==k) {
			res.add(new ArrayList(ds));
			return;
		}
		
		for(int i=start;i<=n;i++) {
			ds.add(i);
			combine(start+1,n,k,ds,res);
			ds.remove(ds.size()-1);
		}
		
		
	}
	
}