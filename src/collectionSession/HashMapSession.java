package collectionSession;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapSession {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<Character,Integer> hm= new HashMap<>();
//hm.put("Rahul",100);
String str="OrionTechAutomation";
for(int i=0;i<str.length();i++) {
	Character ch=str.charAt(i);
	if(hm.containsKey(ch)) {
		hm.put(ch,hm.get(ch)+1);
	}
	else hm.put(ch,1);
}
Set<Character> st=new HashSet<>(hm.keySet());

Iterator

it= st.iterator();
while(it.hasNext()) {
	Character Key=(Character) it.next();
	System.out.print(Key+" "+hm.get(Key)+" ");
}



}

}
