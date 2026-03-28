package recursion;

public class friends_pairing {
	public static int numberOfWays(int n) {
        if(n<=2) return n;
     return numberOfWays(n-1)+ (n-1)*numberOfWays(n-2);
 }
}
