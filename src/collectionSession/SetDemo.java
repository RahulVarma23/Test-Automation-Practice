package collectionSession;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * HashSet<String> hs= new HashSet(); hs.add("Ankita"); hs.add("Rahul");
		 * hs.add("Anjuli"); hs.add("Ankita");
		 * 
		 * System.out.println(hs); //hs.remove("Ankita"); System.out.println(hs);
		 * System.out.println(hs.size()); System.out.println(hs.contains("Rahul"));
		 * 
		 * 
		 * 
		 * Integer[] myarray= {2,3,1,4,2,3,5}; HashSet<Integer> hs1= new
		 * HashSet(Arrays.asList(myarray)); System.out.println(hs1);
		 */
//list into set
		/*
		 * ArrayList<Integer> all= new ArrayList();
		 * 
		 * all.add(1); all.add(1); all.add(2); all.add(null); all.add(null);
		 * 
		 * System.out.println(all); Set<Integer> hs2= new HashSet(all);
		 * System.out.println(hs2);
		 */

	Set<Integer> lhs= new LinkedHashSet();
	//insertion order maintained and duplicate values are not allowed
	String[] city= {"pune", "Mumbai", "Nagpur","pune"};
	//Treeset
	Set<String> ts= new TreeSet(Arrays.asList(city));
	//duplicate values not allowed and natural/ascending order is followed
	System.out.println(ts);
	
}
}