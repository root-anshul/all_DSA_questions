package recursion.copy;

public class reverse_palindrome {
public static void main(String []args) {
		String str="abccba";
		int i=0;
		int len=str.length();
		System.out.println(recu(i,len,str)); 
	}
	public static boolean recu(int i,int len,String str) {
		
		if(str.charAt(i) != str.charAt(len-1-i)) {
			return false;
		}
		recu(i+1,len-1-i,str);
		return true;
	}
}
