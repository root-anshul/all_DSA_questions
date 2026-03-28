package strings.copy;

public class palindromic_substring {
	public static void main(String[] args) {
			String str="babad";
			int count =0;
			for(int i=0;i<str.length();i++) {
				for(int j=i+1;j<=str.length();j++){
					String ss=str.substring(i,j);
					if(ispalindrome(str)) {
						count++;
					}
				}
			}
	
	System.out.println(count);
	}

	private static boolean ispalindrome(String str) {
		int start=0;
		int end=str.length()-1;
		while(start<=end) {
			char ch1=str.charAt(start);
			char ch2=str.charAt(end);
			if(ch1!=ch2) {
				return false;
			}else {
				start++;
				end--;
			}
			
		}
		
		
		return true;
	}
}
