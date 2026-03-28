package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class keypad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String n="23";
		int i=getNumber(n);  
		List<String>ans=new ArrayList<>();
		System.out.println(ans);
		
//		String key[]=keypad(n);
//		List<String>ans= Arrays.asList(key);
//		System.out.println(ans);
	}
	public static int getNumber(String number) {
		
	    int result = 0;
	    for (int i = 0; i < number.length(); i++) {
	        result = result * 10 + number.charAt(i) - '0';
	    }
	    return result;
	}
	private static String[] helper(int n) {
		if(n==1 || n>=10) {
			System.exit(1);
		}
		if(n==2) {
			return new String[]{"a","b","c"};
		}else if(n==3) {
			return new String[]{"d","e","f"};
		}else if(n==4) {
			return new String[]{"g","h","i"};
		}else if(n==5) {
			return new String[]{"j","k","l"};
		}else if(n==6) {
			return new String[]{"m","n","o"};
		}else if(n==7) {
			return new String[]{"p","q","r","s"};
		}else if(n==8) {
			return new String[]{"t","u","v"};
		}else  {
			return new String[]{"w","x","y","z"};
		}
			
	}
	private static String[] keypad(int n) {
		if(n==0) {
			String []ans= {""};
			return ans;
		}
		
		String key[]=keypad(n/10);
		String smallans[]=helper(n%10);
		
		String ans[]=new String[key.length*smallans.length];
		int k=0;
		for(int i=0;i<key.length;i++) {
			for(int j=0;j<smallans.length;j++) {
				ans[k]=key[i]+smallans[j];
						k++;
			}
		}
		return ans;
		
	}

}
