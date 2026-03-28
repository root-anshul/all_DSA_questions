package jc_code;
import java.util.Scanner;
import java.util.ArrayList;

public class listtt {
public static void main(String []args) {
	Scanner in =new Scanner(System.in);
	ArrayList<ArrayList<Integer>> list=new ArrayList<>();
	
	for(int i=0;i<3;i++) {
		list.add(new ArrayList<>());
	}


	for(int i=0;i<3;i++) {
		list.get(i).add(in.nextInt());
	}


	

}



}
