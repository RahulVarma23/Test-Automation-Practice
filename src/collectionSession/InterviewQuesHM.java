package collectionSession;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class InterviewQuesHM {
//frequency of each character in string
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String str="AnjuliAnkita";
  Map<Character,Integer> hm= new HashMap<>();
  System.out.println(hm);
  for(int i=0;i<str.length();i++) {
	  Character ch=str.charAt(i); //n
	  if(hm.containsKey(ch)) { //false
		 int freq= hm.get(ch); //n=1
		 hm.put(ch, freq+1);  //n=2
	  }
	  
	  else hm.put(ch, 1); //n=1
  }
  System.out.println(hm);
  //o/p = frequency of o is 3
  
  Set<Character> st= new HashSet<>(hm.keySet());
  //System.out.println(st);
  Iterator it=st.iterator();
  while(it.hasNext()) {
	  Character key=(Character) it.next(); //A /a /o
	  System.out.println("Frequency of character "+key+" is "+hm.get(key));
  }
  
  
	}

}
