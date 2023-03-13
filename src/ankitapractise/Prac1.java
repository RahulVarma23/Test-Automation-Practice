package ankitapractise;

import java.util.ArrayList;
import java.util.Collections;

public class Prac1  {
	public static void main(String[] args) {
		ArrayList<Student> al= new ArrayList<>();
		
		al.add(new Student(1,"Ankita",100));
		al.add(new Student(2,"Ankit",20));
		al.add(new Student(3,"Anki",30));
		
		Collections.sort(al);
		System.out.println(al);
		for(Student st:al){  
			System.out.println(st.rollno+" "+st.name+" "+st.marks);  
			}  
		
	}

}
