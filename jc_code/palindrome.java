package jc_code;

public class palindrome {
public static void main(String []args) {
	String str="aaaa";
	
	
	for(int i=0;i<str.length()/2;i++) {
	int s=str.charAt(i);
	int e=str.charAt(str.length()-1-i);
	if(s!=e) {
		System.out.println("not palin");
		return;
	}
	
}
	System.out.println("palin");
}
}