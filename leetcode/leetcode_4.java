package leetcode;
//leetcode 4
public class leetcode_4 {
	public static void main (String []args) {
		
		String s="cbbd";
		String res="";
        for(int ax=0;ax<s.length();ax++){
            int orb=1;
            int len=1;
            while(ax-orb>=0 && ax+orb<s.length()){
                if(s.charAt(ax-orb) ==s.charAt(ax+orb)){
                    orb=orb+1;
                    len=len+2;
                }else{
                    break;
                }
            }
            if(len>res.length()){
                int si=ax-len/2;
                res=s.substring(si,si+len);
            }
        }
        for(int ax=1;ax<s.length();ax++){
        	// System.out.println("ax="+ax);  
            int orb=1;
            int len=0;
            while(ax+orb-1>=0 && ax+orb<s.length()){
                if(s.charAt(ax-orb+1)==s.charAt(ax+orb)){
                    orb++;
                    len=len+2;
                    //System.out.println("length="+len); 
                }else{
                    break;
                }
            }
        
        if(len>res.length()){
            int si=ax-len/2+1;
            //System.out.println(si); 
            res=s.substring(si,si+len);
            //System.out.println(res);  
        }
        
        }
     System.out.println(res);   
	}
}
