package jc_code;

public class buy_sell_stock {
public static void main(String []args) {
	int arr[]= {7,6,4,3,1};
	int ele=arr[0];
	int max=0;
	int min=0;
	for(int i=0;i<arr.length;i++) {
		ele=Math.min(ele, arr[i]);
		int price=arr[i]-ele;
		max=Math.max(price, max);
	}
	System.out.println(max);
	
}
}
