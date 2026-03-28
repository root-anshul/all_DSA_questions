package strings;

public class String_with_diff {
	public static void main(String[] args) {
		String str="abcdea";
		StringBuilder sb=new StringBuilder();
				
		int count=0;
		int diff=0;
		sb.append(str.charAt(0));
		
		for(int i=1;i<str.length();i++) {
			char curr=str.charAt(i);
			
			char prev=str.charAt(i-1);
			int gap =curr-prev;
			sb.append(gap);
			sb.append(curr);
			
			
		}
		System.out.println(sb);
		
	}
}
