package collectionSession;

import java.util.HashSet;
import java.util.Iterator;

public class SetSession {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<Integer> hs= new HashSet<>();
//add
hs.add(1);
hs.add(5);
hs.add(2);
System.out.println(hs);
HashSet<Character> hs1= new HashSet();
hs1.add('e');
hs1.add('a');
hs1.add('f');
System.out.println(hs1);
HashSet<String> hs2= new HashSet();
hs2.add("Ankita");
hs2.add("Rahul");
hs2.add("Anjuli");
hs2.add("Ankita");
String str="Ankita";
String str1="Rahul";
String str2="Anjuli";
/*
 * System.out.println(str.hashCode()); System.out.println(str1.hashCode());
 * System.out.println(str2.hashCode());
 */
System.out.println(hs2);
 hs2.remove("Rahul");
 System.out.println(hs2);
 System.out.println(hs2.size());
 System.out.println(hs2.contains("Ankita"));


/*
 * Iterator<Integer> it=hs.iterator(); while(it.hasNext()) {
 * //System.out.println(it.next()); }
 */
	}

}
