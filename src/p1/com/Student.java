package p1.com;

public class Student {
	int rollno;
	String name;
	int marks;
	
	public Student() {
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}

	public Student(int rn, String name, int marks) {
		// super();
		this.rollno = rn;
		this.name = name;
		this.marks = marks;
	}
      
    	  
      	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(1, "Anjuli", 70);
		System.out.println(s1.name + s1.marks + s1.rollno);
		Student s = new Student();
		System.out.println(s.rollno);
		System.out.println(s.name);
		System.out.println(s.marks);
	}

}
