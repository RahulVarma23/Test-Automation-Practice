package collectionDemo;

import java.util.HashMap;
import java.util.Map;


public class Revision {
	
	//1 -> Rahul , Ankita
	//2-> Pooja , Anjuli
	
	public static void main(String[] args) {
		Integer [] arr = {1,111,111,11,11,1123,2,2,2};
		Map<String, Integer> map = new HashMap<String, Integer>();
		
	   map.put("Rahul", 1);
	   map.put("Rohit", 2);
	   
		
		System.out.println(map);
	}
}
