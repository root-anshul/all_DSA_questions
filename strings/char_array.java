package strings;

public class char_array {
	public static void main(String []args) {
		char[]arr= {'a','a','b','b','c','c','c'};
		String str="";
		int count=1;
		for(int i=0;i<arr.length-1;i++) {
			while(i<arr.length-1 && arr[i]==arr[i+1]) {
				count++;
				i++;
			}
			str=str+arr[i];
			if(count>1) {
				str=str+count;
				count=1;
			}
		}
		System.out.println(str.length());
		char[]ch=str.toCharArray();
//		for(int i=0;i<ch.length;i++) {
//		System.out.println(ch[i]);
//			}
		System.out.println(ch.length);
		}
}
