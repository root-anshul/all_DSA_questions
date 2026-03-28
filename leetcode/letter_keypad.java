package leetcode;

import java.util.ArrayList;

public class letter_keypad {
	public static void main(String[] args) {
			String str="23";
			
//			if(str.isEmpty()){
//	            
//	           System.out.println(new ArrayList<>());
//	        }
	         
	        ArrayList<String>words=getcom(str);
	        System.out.println(words);
	            
//			char a='a';
//			System.out.println(""+a);
	}
	static String[] code={"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

public static ArrayList<String> getcom(String str){
		
	if(str.length()==0) {
		ArrayList<String> bres=new ArrayList<>();
		bres.add("");
		return bres ;
	}
	char ch=str.charAt(0);
	String s=str.substring(1);
	
	ArrayList<String> rres= getcom(s);
	ArrayList<String> mres=new ArrayList<>();
	
	String chcode=code[ch-'2'];
	
	for(int i=0;i<chcode.length();i++) {
		char c=chcode.charAt(i);
		for(String ss: rres) {
			mres.add(c+ss);
		}
	}
	return mres;
}


}
