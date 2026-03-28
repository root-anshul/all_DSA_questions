package leetcode;
import java.util.List;
import java.util.ArrayList;

class Combination_sum_I {
	
	public static void main(String []args) {
		int[]arr= {2,3,6,7};
		int target = 7;
		
		System.out.println(combinationSum(arr,target));
	}
	
	
	
    public static List<List<Integer>> combinationSum(int[] arr, int tar) {
        List<List<Integer>>ans=new ArrayList();
        combination(0,arr,tar,ans,new ArrayList());
        return ans;
    }

    public static void combination(int idx,int[]arr,int tar,List<List<Integer>> ans,
    List<Integer> ds){
        if(idx==arr.length){
            if(tar==0){
                ans.add(new ArrayList(ds));
            }
            return;
        }
        if(arr[idx]<=tar){
            ds.add(arr[idx]);
            combination(idx,arr,tar-arr[idx],ans,ds);
            ds.remove(ds.size()-1);
        }

        combination(idx+1,arr,tar,ans,ds);
    }

}