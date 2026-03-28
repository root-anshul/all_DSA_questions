package CN_week_17_HashMaps;

import java.util.HashMap;

public class pair_sum_to_0 {
	
	public static int PairSum(int[] arr) {
		int count=0;
		
		 HashMap<Integer,Integer> h=new HashMap<>();
		 
		 
		 
		for(int i=0;i<arr.length;i++) {
			
			
			if(h.containsKey(-arr[i])) {
				count++;
				h.put(arr[i], h.get(arr[i])+1);
				
			}else {
				h.put(arr[i], h.get(arr[i])+1);
			}
		}
		return count;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int arr[]= {2 ,1 ,-2 ,2 ,3};
			int ans=PairSum(arr);
			System.out.println(ans);
	}

}
