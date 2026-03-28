package CN_week_17_HashMaps;

import java.util.ArrayList;
import java.util.HashMap;

public class Remove_duplicate {

	
	public static ArrayList<Integer> removeDup(int[]arr){
		
		ArrayList<Integer> list=new ArrayList<Integer> ();
		HashMap<Integer,Boolean>seen=new HashMap<Integer,Boolean>();
		
		for(int i=0;i<arr.length;i++) {
			
			if(!seen.containsKey(arr[i])) {//O(1)
				list.add(arr[i]);
				seen.put(arr[i], true); //O(1)
			}
			
		}
		
		return list;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,2,2,3,4,5,5,65,6,7,7,7,78,8,8,88,88888888};
		ArrayList<Integer>ans=removeDup(arr);
		System.out.println(ans);
	}

}
