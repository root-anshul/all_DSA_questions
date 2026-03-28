package leetcode;

public class minimum_commom_value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {1,2,3};
		int arr2[]= {2,4};
		
		int i=0;
		int j=0;
			while(i<0 && j<0) {
				if(arr1[i]==arr2[j]) {
//					return arr1[i];
				}else if(arr1[i]>arr2[j]) {
					j++;
				}else {
					i++;
					j++;
				}
			}
//		return -1;
	}

}
