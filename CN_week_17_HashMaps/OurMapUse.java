package CN_week_17_HashMaps;

public class OurMapUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map=new Map<>();
		
		for(int i=0;i<20;i++) {
			map.insert("abc"+i, 1+i);
			System.out.println("i = " +i+" loadFactor = "+ map.loadFactor());
		}
		map.removeValue("abc2");
		map.removeValue("abc3");
		map.removeValue("abc9");
		
		for(int i=0;i<20;i++) {
			System.out.println("abc"+i+ ":" +map.getvalue("abc"+i));
		}
	}

}
