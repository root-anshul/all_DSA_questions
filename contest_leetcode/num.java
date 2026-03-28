package contest_leetcode;

public class num {
	public static void main(String[]args) {
		int arr[]= {0,1,2,10,3};
		int k=2;
		long max=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;i<arr.length;j=j+k){
            	
            	  System.out.println(max);
                max=max+arr[j+k];
                if(j-i<=2) {
                	break;
                }
            	
            }

        }
        long ans=0;
        ans=Math.max(ans,max);
       // System.out.println(ans);
	}
}
