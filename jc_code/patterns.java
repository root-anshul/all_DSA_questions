package jc_code;

public class patterns {
public static void main(String []args) {
	int n=5;
//	pat1(n);
//	pat2(n);
//	pat3(n);
//	pat4(n);
//	pat5(n);
	//pat6(n);
//	pat7(n);
	//pat8(n);
}
public static void pat9(int n) {
	
	
}







/*
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
 */
public static void pat1(int n) {
	int i=1;
	while(i<=n) {
		int j=1;
		while(j<=i) {
			System.out.print(j+" ");
			j++;
		}

		System.out.println();
		i++;
	}
	System.out.println();
}
/*
* 
* * 
* * * 
* * * * 
* * * * * 
* * * * 
* * * 
* * 
* 
 */
public static void pat2(int n) {
	int i=0;
	while(i<n) {
		int j=0;
		while(j<=i){
			System.out.print("* ");
			j++;
		}
	System.out.println();
		i++;
	
	}
	 i=0;
	while(i<n) {
		int j=n-1;
				while(j>i) {
					System.out.print("* ");
					j--;
				}
	System.out.println();
	i++;
	}
}

/*
54321
54321
54321
54321
54321
 */
public static void pat3(int n) {

	int i=1;
	while(i<=n) {
		
		int j=n;
		while(j>=1) {
			System.out.print(j);
			j--;
		}
		System.out.println( );
		i++;
		
	}
}
/*
1
22
333
4444
55555
 */
public static void pat4(int n) {
	int i=1;
	while(i<=n) {
		int j=1;
		while(j<=i) {
			System.out.print(i);
			j++;
		}
	System.out.println();
	i++;
	
	}
}

/*
* * * * * 
* * * * 
* * * 
* * 
* 
 */

public static void pat5(int n) {
	
	int i=n;
	while(i>0) {
		int j=0;
		while(j<i) {
			System.out.print("* ");
			j++;
		}
		System.out.println();
		i--;
	}
}

/*
12345
1234
123
12
1
 
 
 */

public static void pat6(int n) {
	int i=n;
	while(i>=0) {
		int j=1;
		while(j<=i) {
			System.out.print(j);
			j++;
		}
		System.out.println();
		i--;
	}
}

/*
    *    
   ***   
  *****  
 ******* 
*********
 */
public static void pat7(int n) {

int i=0;

while(i<n) {
	int j=0;
	while(j<n-i-1) {
		System.out.print(" ");
		j++;
	}
	j=0;
	while(j<2*i+1) {
		System.out.print("*");
		j++;
	}
	j=0;
	while(j<n-i-1) {
		System.out.print(" ");
		j++;
	}
	System.out.println();
	i++;
}
}
/*
*********
 ******* 
  *****  
   ***   
    *   
 */
public static void pat8(int n) {
	int i=0;

	while(i<n) {
		int j=0;
		while(j<i) {
			System.out.print(" ");
			j++;
		}
		j=0;
		while(j<2*n-(2*i+1)) {
			System.out.print("*");
			j++;
		}
		j=0;
		while(j<i) {
			System.out.print(" ");
			j++;
		}
		System.out.println();
		i++;
	}
}
}
