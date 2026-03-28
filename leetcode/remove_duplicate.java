package leetcode;

public class remove_duplicate {
public static void main(String []args) {
	  int idx =1;
      int count =0;
      int []nums= {1,1,1,2,2,3};
      for(int i =1;i<nums.length;i++){
          if(nums[i-1]==nums[i]){
              count++;
              System.out.println("count is"+count);
          }
          else{
             
              count=0;
          }
          if(count<=1){
              nums[idx]=nums[i];
              idx++;
          }
          
          
      }
      System.out.println("idx  is"+idx);
     
}
}
