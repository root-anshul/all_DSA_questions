package strings;

import java.util.ArrayList;

public class string_sub {
public static void main(String[]args) {
	String str="abc";
	//seq("",str);
	System.out.println(seqret("",str));
}
public static void seq(String p,String up) {
	if(up.isEmpty()) {
		System.out.println(p);
		return;
	}
	
	char ch=up.charAt(0);
	seq(p+ch,up.substring(1));
	seq(p,up.substring(1));
	
}
public static ArrayList <String> seqret(String p,String up) {
	if(up.isEmpty()) {
		ArrayList <String> list= new ArrayList<>();
		list.add(p);
		return list;
	}
	
	char ch=up.charAt(0);

	ArrayList <String> left = seqret(p+ch,up.substring(1));
	ArrayList <String> right =seqret(p,up.substring(1));
		left.addAll(right);
		return left;
		
}

}
