package oopsConcept;

public class Student {
  String name;
  
 private int rollno;
 
 
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	if(rollno > 0)
	this.rollno = rollno;
	//System.out.println(this.rollno);
}
 
	

}
