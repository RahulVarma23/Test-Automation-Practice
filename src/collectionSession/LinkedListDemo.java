package collectionSession;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   LinkedList<String> ll= new LinkedList();
   //List<String> ll1= new LinkedList();
   ll.add("Ankita");
   ll.add("Rahul");
   
   System.out.println(ll);
   ll.addFirst("Pooja");
   System.out.println(ll);
   ll.addLast("Rahul");
   ll.add(2,"Anjuli");
   System.out.println(ll);
   System.out.println(ll.indexOf("Rahul"));
  System.out.println(ll.lastIndexOf("Rahul"));
  System.out.println(ll.removeLastOccurrence("Rahul"));
  System.out.println(ll);
System.out.println(ll.contains("Ankita"));
System.out.println(ll.size());
Collections.sort(ll);
System.out.println(ll);
System.out.println(ll.get(2));
System.out.println(ll.getLast());

  
	}

}
