package recursion;
import java.util.ArrayList;
public class subset {
	public static void main(String []args) {
		int []arr= {3,1,2};
		int len=3;
		ArrayList<Integer> list=new ArrayList<Integer>();
		int idx=0;
		recu(idx,arr,list,len);
		
		 
	}
	public static void recu(int idx,int []arr
			,ArrayList<Integer> list,int len) {
		if(idx==len) {
			
			System.out.println(list);
			return ;
		}
		
		list.add(arr[idx]); 
		recu(idx+1,arr ,list, len);
		list.remove(list.get(idx-1));
		
		recu(idx+1,arr ,list, len);
		
	}
}
