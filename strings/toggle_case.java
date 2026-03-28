package strings;

//lc='a'+uc-'A'
//uc='A'+lc-'a'


public class toggle_case {
	public static void main(String[] args) {
		String s="vZm";
		
		StringBuilder str = new StringBuilder(s);
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>='a' && ch<='z') {
				char uc=(char)('A'+ ch - 'a');
				str.setCharAt(i, uc);
				
			}
			if(ch>='A'&&ch<='Z'){
				char lc=(char)('a'+ ch - 'A');
				str.setCharAt(i, lc);
			}
		}
		
		System.out.println(str);
	}
}
