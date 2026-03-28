package leetcode;

public class count_rotation {
public static void main(String [] args) {
	int[]arr= {1,2,4,5,6};
	int min=arr[0];
	for(int i=0;i<arr.length-1;i++) {
		
			if(arr[i]<min) {
				min=arr[i];
			
		}
	}
System.out.println(min);
}

}
