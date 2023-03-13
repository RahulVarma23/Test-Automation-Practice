package compareSession;

import java.util.ArrayList;
import java.util.Collections;

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 //0,ankita,100
		//1,anki,90
		ArrayList<Student> al = new ArrayList<>();
		Student s1= new Student(1,"Ankita",90);
		Student s2= new Student(10,"Ankit",100);
		Student s3= new Student(7,"Ankit",70);
		al.add(s1);
		al.add(s2);
		al.add(s3);
		/*
		 * for(Student st : al) {
		 * System.out.println(st.rollno+" : "+st.name+" : "+st.marks); }
		 */
		
		  Collections.sort(al);
		  for(Student st : al) {
		  System.out.println(st.rollno+" : "+st.name+" : "+st.marks); }
		 
		
		
	}

}
