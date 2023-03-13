package collectionSession;

import java.util.HashMap;
import java.util.Map;

public class CompareHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> hm= new HashMap<>();
		hm.put("Pooja",22 );
		hm.put("Anjuli", 21);
		hm.put("Ankita", 23);
		hm.put("Anjuli",24);
		
		
		Map<String, Integer> hm1= new HashMap<>();
		
		hm1.put("Anjuli", 21);
		hm1.put("Pooja",22 );	
		hm1.put("Anjuli",24);
		hm1.put("Ankit", 23);
		
		//System.out.println(hm.equals(hm1));
		
		//comparison based on key 
		System.out.println(hm.keySet().equals(hm1.keySet()));
		
	}

}
