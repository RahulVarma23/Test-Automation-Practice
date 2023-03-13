package ankitapractise;

public class Student implements Comparable<Student>{

	int rollno;
	String name;
	int marks;
	public Student(int rollno, String name, int marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		
		  if(marks==o.marks) 
			  return 0; 
		  else if(marks > o.marks) return 1;
		  else
			  return -1;
		 
	}
	
	
}
