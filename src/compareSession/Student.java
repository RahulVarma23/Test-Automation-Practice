package compareSession;

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
	int a=10;
	int b=20;
	//a==b;
	String c="Ankita";
	String d="Rahul";
	//c==d
		//c.equals(d)	
	/*
	 * @Override 
	 * public int compareTo(Student o) { //-1 , 0 , 1 // TODO
	 * Auto-generated method stub
	 *  if(rollno==o.rollno) return 0;
	 *   else if(rollno >o.rollno)
	 *  return 1; 
	 *  else return -1; }
	 */
	/*
	 * @Override public int compareTo(Student o) { // TODO Auto-generated method
	 * stub return name.compareTo(o.name);
	 * 
	 * }
	 */
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return marks-o.marks;
	}
	
	
}
