package stack;

import java.util.Stack;

public class DDIIDDII {
	public static void main(String[] args) {
		String str="IIIDIDDD";
		StringBuilder sb= new StringBuilder("");
		Stack<Integer> st=new Stack<>();
		int num=1;
		//st.push(num);
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='D') {
				st.push(num);
				num++;
			}
			else {
				st.push(num);
				num++;
				while(st.size()!=0) {
					sb.append(st.pop());
				}
			}
		}
		st.push(num);

		while(st.size()!=0) {
			sb.append(st.pop());
		}
		System.out.println(sb);
		
	}
}
