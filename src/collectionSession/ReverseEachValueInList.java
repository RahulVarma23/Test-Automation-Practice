package collectionSession;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseEachValueInList {
	
  public String reverseName(String name) {
	  StringBuilder sb= new StringBuilder(name);
	  return sb.reverse().toString();
	  
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//[Ankita, Rahul, Anjuli, Pooja]
		//[ajooP, ilujnA]
		List<String > al= new ArrayList<>();
		al.add("Ankita");
		al.add("Rahul");
		al.add("Pooja");
		al.add("Anjuli");
		System.out.println(al);
		List<String > reval= new ArrayList<>();
		ReverseEachValueInList rv= new ReverseEachValueInList();
		
		  for(int i=al.size()-1;i>=0;i--) {
			  reval.add(rv.reverseName(al.get(i))); }
		 
		System.out.println(reval);
		//Collections.reverse(reval);
		//System.out.println(reval);
		
		
	}

}
