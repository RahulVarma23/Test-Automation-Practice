package ankitapractise;

import java.util.ArrayList;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> al= new ArrayList<>();
		al.add(new Employee(1,"Ankita","Tech"));
		al.add(new Employee(2,"Ankit","Techno"));
		al.add(new Employee(0,"Ankita","Technology"));
		Collections.sort(al, new NameCompare());
		System.out.println(al);
		for(Employee e :al) {
			System.out.println(e.empid+" : "+e.name+" : "+e.dept);
		}
		
	}

}
