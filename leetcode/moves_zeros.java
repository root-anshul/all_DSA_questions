package leetcode;

import java.util.ArrayList;

public class moves_zeros {
	class Solution {
	    public void moveZeroes(int[] arr) {
	        ArrayList<Integer> list=new ArrayList<Integer>();
	        for(int i =0;i<arr.length;i++){
	            if(arr[i]!=0){
	                list.add(arr[i]);
	            }
	        }
	        int j=0;
	        for(int i=0;i<list.size();i++){
	            arr[j]=list.get(i);
	            j++;
	        }

	        for(int i=list.size();i<arr.length;i++){
	            arr[i]=0;
	        }
	    for(int i=0;i<arr.length;i++){
	        System.out.print(arr[i]+" ");
	    }
	    }
	}
}
