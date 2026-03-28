package strings;

public class rev_string {
	public static void main(String[]args) {
		String str="abcde";
		char[]ch=str.toCharArray();
		
		String s="";
		for(int i=ch.length-1;i>=0;i--) {
			s=s+ch[i];
		}
		System.out.println(s.toCharArray());
	}
}
