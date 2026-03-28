package CN_week_17_HashMaps;

import java.util.HashMap;

public class maxFrequency {
    public static int maxFrequencyNumber(int[] arr){ 
    	
    	 HashMap<Integer,Integer> h=new HashMap<>();
         for(int i=0;i<arr.length;i++){
             if(h.containsKey(arr[i])){
                 h.put(arr[i],h.get(arr[i])+1);
             }
             else
                 h.put(arr[i],1);
         }
         int max=0;
         int maxKey=Integer.MIN_VALUE;
         for(int i=0;i<arr.length;i++)
        
         {
             if(h.get(arr[i])>max){
                 max=h.get(arr[i]);
                 maxKey=arr[i];}
         }
      


         return maxKey ;

    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {2 ,12, 2 ,11 ,12, 2, 1 ,2 ,2, 11 ,12, 2, 6 };
		int ans=maxFrequencyNumber(arr);
		System.out.println(ans);
	}

}
