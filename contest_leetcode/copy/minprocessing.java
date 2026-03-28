package contest_leetcode.copy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class minprocessing {
	public static void main(String []args) {
		List<Integer> p=new ArrayList<>();
		List<Integer> t=new ArrayList<>();
		Collections.sort(p);
		int n=t.size();
        Collections.sort(p);
        Collections.sort(t);
        int j=n-1;
        int m=p.size();
        
        int ans=0;
        for(int i=0;i<m;i++){
            int num=0;
            while(num<4){
                ans=Math.max(ans, p.get(i)-t.get(j));
                num++;
                j--;
            }
        }
	}

}
