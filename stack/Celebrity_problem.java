package stack;

import java.util.Stack;

public class Celebrity_problem {

	public static void main(String[] args) {
		int arr[][]= { {1, 2, 3, 4}, {5, 6, 7} };
		Stack <Integer>st= new Stack<>();
		
		
		for(int i =0;i<arr.length;i++) {
//			st.push(arr[i]);
		}
		while(st.size()>=2) {
			int i=st.pop();
			int j=st.pop();
			if(arr[i][j]==1) {
				st.push(j);
			}
			else {
				st.push(i);
			}
		}
		int pos=st.pop();
	
		for(int i=0;i<arr.length;i++) {
			if(i!=pos) {
				if(arr[pos][i]==1||arr[i][pos]==0) {
					System.out.println("-1");
				}
			}
		}
		System.out.println(pos);
		
		
	}

}
