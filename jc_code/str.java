package jc_code;

public class str {
public static void main(String []args) {
	String str="A man, a plan, a canal: Panama"; 
	str=str.replace("[^a-z0-9]", "");
	str=str.toLowerCase().strip();
	
	System.out.println(str);
}
}
