package CN_week_2Darrays;

public class matrix_multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int mat1[][] = {{1, 2},
//						{3, 4}};
//		
//		int mat2[][] = {{5, 6},
//	            		{7, 8}};
//		
//		int ans[][]=new int[mat1[0].length][mat2.length];
//		
//		for(int i=0;i<ans.length;i++) {
//			for(int j=0;j<ans[0].length;j++) {
////				for(int k=0;k< ;k++) {
////					ans[i][j] += 
////				}
//			}
//		}
		int arr[]= {437,315,322,431,686,264,442};
		int count=0;
        int ele=0;
       int evenCount=0;
        for(int i=0;i<arr.length;i++){
            int num=arr[i];
            while(num!=0){
                num=num/10;
                 count++;
                 
            }
//            System.out.println(count);
            if(count%2==0){
                evenCount++;
            }else {
            	count=0;
            }
            
        }
       System.out.println(evenCount);
		
		
	}

}
