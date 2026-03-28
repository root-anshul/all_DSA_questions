package test_2;

public class min_len {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="this is test string";
		 String[] split = str.split(" ");
	        for(int i=0;i<split.length;i++) {
	        	System.out.print(split[i]+" ");
	        }
	        StringBuffer ans = new StringBuffer("");
	        
	        int len = Integer.MAX_VALUE;
	        
	        for(int i = 0; i < split.length; i++){
	            if(split[i].length() < len){
	                ans = new StringBuffer("");
	                ans.append(split[i]);
	                len = split[i].length();
	            }
	        }
	        
//	        return ans.toString();


		
		
	}

}
