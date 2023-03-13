package collectionSession;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class InterviewQuestion2 {
//find a string which is repeated max time
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="My name is Anthony Anthony name Gonsalvez in Anthony";
 Map<String , Integer> hm= new HashMap<>();
 String[] st=str.split(" "); 
 for(int i=0;i<st.length;i++) {
	 if(hm.containsKey(st[i])) {
	 hm.put(st[i],hm.get(st[i])+1);
	 }
	 else hm.put(st[i], 1);
 }
 System.out.println(hm);
 Iterator it=hm.keySet().iterator();
 
	}

}
