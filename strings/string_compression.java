package strings;

public class string_compression {
	public static void main(String []args) {
		String str="aaaabbbccd";
		int count=1;
		String s="";
		for(int i=0;i<str.length();i++) {
			while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
				count++;
				i++;
			}
			s=s+str.charAt(i);
			if(count>1) {
				s=s+count;
				count=1;
			}
			
		}
			System.out.println(s);
	}
}