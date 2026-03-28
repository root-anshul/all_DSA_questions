package Strings_leetcode.copy;

public class multiply_strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String num1="123";
		String num2="456";
		
		String str="";
		int count=0;
		int l1=num1.length();
		int l2=num2.length();
		
		int[]res=new int[l1+l2];
	
		
		int pf=0;
		int i=l2-1;
		
		while(i>=0) {
			int ival=num2.charAt(i)-'0';
			i--;
			int j=l1-1;
			int k=res.length-1-pf;
			
			int carry=0;
			
			while(j>=0||carry!=0) {
				int jval= j >=0 ? num1.charAt(j)-'0':0;
				
				j--;
				
				int pro=ival*jval+carry+res[k];
				
				res[k]=pro%10;
				carry=pro/10;
				k--;
			}
			pf++;
			
		}
		for(int l=0;l<res.length;l++) {
			if(res[l]==0 && count==0) {
				continue;
			}else {
				count=1;
				str=str+res[l];
			}
		}
		System.out.println(str);
	
	}

}
