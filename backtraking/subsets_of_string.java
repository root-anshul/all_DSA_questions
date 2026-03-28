package backtraking;

public class subsets_of_string {
	public static void main(String []args) {
		String str="abc";
		//System.out.println(str.length());
		findsubset(str,"",0);
	}
	public static void findsubset(String str,String ans,int idx) 
	{
		//base case
		if(idx==str.length()) {
			System.out.println(ans);
			return; 
		}
		
		
		
	    findsubset(str,ans+str.charAt(idx),idx+1);
		
		 
		findsubset(str,ans,idx+1);
	}
}
 