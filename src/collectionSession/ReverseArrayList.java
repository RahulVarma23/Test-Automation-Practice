package collectionSession;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> al= new ArrayList<>();
		al.add("Ankita");
		al.add("Rahul");
		al.add("Anjuli");
		
				
 Collections.reverse(al);
 System.out.println(al);
	}

}
