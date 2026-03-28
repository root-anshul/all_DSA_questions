package arrays;

public class Container_with_most_water {
	
	public static void main(String[] args) {
		
		int arr[]= {8,7,2,1};
		
		int ans=maxArea(arr);
		
		System.out.println(ans);
	}
	
	public static int maxArea(int arr[]) {
		
		int max=0;
		
		int i=0;
		int j= arr.length-1;
		int min =0;
		
		
		while(i<j) {
		
		min = Math.min(arr[i], arr[j]);
			
		int temp = min * (j-i);
		
		max = Math.max(max, temp);
		
		if(i>j) {
			j--;
		}else {
			i++;
		}
		}
		return max;
	}
	
}