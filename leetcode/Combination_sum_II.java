package leetcode;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Combination_sum_II {
public static void main(String []args) {
	int []arr= {1,1,1,2,2};
	int target=4;
	Arrays.sort(arr);
  System.out.println(combinationSum2(arr,target));	
}

public static List<List<Integer>> combinationSum2(int[] arr, int tar) {
    List<List<Integer>> ans= new ArrayList<>();
    
    findcombination(0,arr,tar,ans,new ArrayList<>());
    return ans;
}
private static void findcombination(int idx,int[]arr,int tar , List<List<Integer>> ans, List<Integer> ds) {
	
		
     if(tar==0) {
    	 ans.add(new ArrayList<>(ds));
    	 return;
		}
     
     for(int i=idx ;i<arr.length;i++) {
    	 
    	 if(i>idx && arr[i]==arr[i-1]) continue;
    		 
    	 
    	 if(arr[i]>tar) break;
    	 ds.add(arr[i]);
    	 findcombination(i+1,arr,tar-arr[i],ans,ds);
    	 ds.remove(ds.size()-1);
     }
     



}
}