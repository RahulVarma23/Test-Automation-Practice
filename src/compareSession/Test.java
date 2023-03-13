package compareSession;

import java.util.ArrayList;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> al= new ArrayList<>();
		  Employee e1= new Employee(1,"Ankita","Tech");
	      Employee e2= new Employee(0,"Ankit","Techno");
	      Employee e3= new Employee(10,"Anki","Technology");
	      al.add(e2);
	      al.add(e1);
	      al.add(e3);
	      for(Employee e :al) {
	    	  System.out.println(e.empid+" : "+e.name+" : "+e.dept);
	      }
	      Collections.sort(al,new NameComparator());
	      System.out.println("=============================");
	      for(Employee e :al) {
	    	  System.out.println(e.empid+" : "+e.name+" : "+e.dept);
	      }
	     
	    
	}

}
