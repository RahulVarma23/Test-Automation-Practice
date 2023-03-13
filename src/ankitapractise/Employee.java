package ankitapractise;

import java.util.Comparator;

public class Employee implements Comparator<Employee> {

	int empid;
	String name;
	String dept;
	
	public Employee(int empid, String name, String dept) {
		this.empid=empid;
		this.name=name;
		this.dept=dept;
	}
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.dept.compareTo(o2.dept);
	}
	
	}
	

