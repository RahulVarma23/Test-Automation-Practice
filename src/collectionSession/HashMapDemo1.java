package collectionSession;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<String, Integer> hm= new HashMap<>();
hm.put("Pooja",22 );
hm.put("Anjuli", 21);// null
System.out.println(hm.get("Anjuli"));
System.out.println(hm.put("Ankita", 23));
System.out.println(hm.put("Anjuli",24)); //21
System.out.println(hm.get("Anjuli"));
/*
 * //System.out.println(hm.get("Anjuli")); System.out.println(hm.get("Rahul"));
 * System.out.println(hm.keySet()); System.out.println(hm.containsKey("Anjli"));
 * System.out.println(hm.containsValue(22));
 * //System.out.println(hm.getOrDefault("Rahul", 1)); System.out.println(hm);
 */



	}

}
