package strings;

public class string_subs {
public static void main(String[]args) {
	String s="Helloworld";
	int start=3;
	int end=7;
	String str = "";
	for(int i=start;i<end;i++) {
		str=str+s.charAt(i);	
	}
		System.out.println(str);
}
}
