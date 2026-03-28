package recursion;

import java.util.Arrays;

public class duplicate_string {
	public static void main(String []args) {
		String str="bcabc";
		dub(str,0,new StringBuilder(""),new boolean[26]);
	}
	public static void dub(String str,int idx,StringBuilder 
			sb,boolean[] map) {
		if (idx==str.length()) {
			String st=sb.toString();
			 char tempArray[] = st.toCharArray();
		        Arrays.sort(tempArray);
			System.out.println(new String(tempArray));
			return ;
		}
		
		char ch=str.charAt(idx);
		if(map[ch-'a']==true) {
			dub(str,idx+1,sb,map);
		}
		else {
			map[ch-'a']=true;
			dub(str,idx+1,sb.append(ch),map);
		}
		
	}
}
