package leetcode;

public class missing_number {
	public static void main(String []args) {
		
		int[]arr= {9,6,4,2,3,5,7,0,1};
		int i = 0;
		while (i < arr. length) {
		int correct = arr[i];
		if ( arr[i] < arr. length &&  arr[i] != arr [correct]) {
			int temp=arr[i];
			arr[i]=arr[correct];
			arr[correct]=temp;
		} 
		else {
			
			i++;	
		}
	
	}
	
		for(int index=0;index<arr.length;index++) {
			if(arr[index]!=index) {
				System.out.println(index);
			}
		}
	
System.out.println(arr.length);
	}
	
}