package leetcode;
//leetcode 3
public class leetcode_3 {
public static void main (String []args) {
	String s="abcabcbb";
	boolean[]set=new boolean[256];
	int i=0;
	int j=-1;
	int maxlen=0;
	while(i<s.length()) {
		char chi=s.charAt(i);
		
		while(set[chi]==true) {
			j++;
			char chj=s.charAt(j);
			set[chj]=false;
		}
		
		set[chi]=true;
		maxlen=Math.max(maxlen, i-j);
		System.out.println(maxlen);
		//return maxlen;
		
		i++;
	}
	
}
}
