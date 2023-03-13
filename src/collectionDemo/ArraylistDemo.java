package collectionDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraylistDemo {
//1.add
	//2.add(index, object)
	//3.size
	//4.get
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int[] myarray= new int[200];
		ArrayList<Object> al = new ArrayList();
		
		System.out.println(al.size());
		al.add("Ankita");//0
		al.add("Ankita");//1
		System.out.println(al);
		al.add(1,'k');  //1
		al.add(2,'C');
		//System.out.println(al.add('n'));
	    System.out.println(al);
	    System.out.println(al.size());
	    //al.clear();
	  // System.out.println( al.get(1));
	   System.out.println(al.size());
	 System.out.println(al.contains('a'));
		//default size of arraylist =10
	System.out.println( al.indexOf('C'));
	ArrayList<Integer> al2= new ArrayList();
	//al2.addAll(al);
	//al.add(null);
	al2.add(null);
	al2.add(null);
	System.out.println(al2);
	//al2.add
	//al.remove(3);
	//System.out.println(al);
	//al.remove(al2);
	//System.out.println(al2);
		Integer[] ar= {1,2,3};
		System.out.println(Arrays.toString(ar));
		//List<Integer> al3= Arrays.asList(ar);
		List<Integer> al3= new ArrayList();
		//List al4=Arrays.asList(al3);
		Collections.addAll(al3, ar);
		System.out.println(al3);
		ArrayList<Object> al4= new ArrayList() ;
		//int[] myarray= {1,2,3,4,5};
		 ArrayList<Integer> ali= new ArrayList(Arrays.asList(1,2,3,4,5));
		 ali.addAll(Arrays.asList(1,2,3,4,5));
		
		
		
	}
}
