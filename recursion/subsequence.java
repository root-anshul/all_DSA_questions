package recursion;

public class subsequence {
	public static void main(String[] args) {
		String str = "bcaapplebcbbapp"; 
	
		System.out.println(recc(str));
//		System.out.println(Apple(str));
//		System.out.println(skipAppnotApple(str));
	}

	public static String recc(String str) {
		if (str.isEmpty()) {
			return "";
		}

		char ch = str.charAt(0);
		if (ch == 'a') { 
			return recc(str.substring(1));
		} else {
			return ch + recc(str.substring(1));
		}
	}

	public static String Apple(String str) {
		if (str.isEmpty()) {
			return "";
		}

		if (str.startsWith("apple")) {
			return Apple(str.substring(5));
		} else {
			return str.charAt(0) + Apple(str.substring(1));
		}
	}

	public static String skipAppnotApple(String str) {
		if (str.isEmpty()) {
			return "";
		}

		if (str.startsWith("app") && !str.startsWith("apple")) {
			return skipAppnotApple(str.substring(3));
		} else {
			return str.charAt(0) + skipAppnotApple(str.substring(1));
		}
	}

}
