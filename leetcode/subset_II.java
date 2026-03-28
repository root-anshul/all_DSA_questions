package leetcode;
import java.util.*;
public class subset_II {
	public static void main(String []args) {
//	public List<List<Integer>> subsetsWithDup(int[] arr) {
		int []arr= {1,2,2};
       List<List<Integer>> res= new ArrayList();
     List<List<Integer>> ans=subsetDuplicate(arr);
      res.addAll(ans);
      //return res;
 // }
	}
public static List<List<Integer>> subsetDuplicate(int[] arr) {
Arrays.sort (arr);
List<List<Integer>> outer = new ArrayList<> () ;
outer.add (new ArrayList<> ()) ;
int start = 0;
int end = 0;
for (int i = 0; i < 3; i++) {
start = 0;

if (i > 0 && arr[i]== arr[i-1]){
start = end + 1;
System.out.println("start=== " + end);
}
end = outer.size() - 1;
System.out.println("end=== " + end);

int n = outer.size();
System.out.println("n=== "+ n);
for (int j = start; j< n; j++) {
List<Integer> internal = new ArrayList<>(outer. get (j)) ;
System.out.println("internal=== "+internal);
internal.add (arr [i]);
System.out.println("internal=== "+internal);
outer. add (internal);
System.out.println("outer=== "+outer);
System.out.println("===============");
}

}
return outer;
}
}
