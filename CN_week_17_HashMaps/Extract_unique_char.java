package CN_week_17_HashMaps;

import java.util.HashMap;

public class Extract_unique_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="ababacd";
		HashMap<Character,Integer> map = new HashMap<>();
	    
		String s = "";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(!map.containsKey(ch)) {
				s=s+ch;
				map.put(ch, 1);
			}
			
			
		}
	    System.out.println(s);
		
		}
	

}
