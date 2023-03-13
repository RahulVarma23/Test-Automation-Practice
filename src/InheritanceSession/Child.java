package InheritanceSession;

public class Child extends Parent {
	//class A extends B
	int y=30;
	  int z=40;
	  public void m2() {
		  System.out.println("m2 method of child class");
	  }
	  public void m3() {
		  System.out.println("m3 method of child class");
	  }
	  public static void main(String[] args) {
			/*
			 * Parent p= new Parent(); System.out.println(p.x); System.out.println(p.y);
			 * p.m1(); p.m2();
			 */
			/*
			 * Child c =new Child(); System.out.println(c.x); System.out.println(c.y);
			 * System.out.println(c.z); c.m1(); c.m2(); c.m3();
			 */
			/*
			 * Parent p= new Child(); System.out.println(p.x); //10 System.out.println(p.y);
			 * //20 // System.out.println(p.z); p.m1(); p.m2(); // p.m3();
			 */	
		 // Child c= new Parent();
		  
			/*
			 * Parent p= new Parent(); //case1 Parent p1= new Child(); //case3 p=p1;
			 * //<Parent p= new Child();>
			 * 
			 * p1=p; //<Parent p1= new Parent();> System.out.println(p1.y);
			 */
		  Child c= (Child) new Parent();
		  //c.m1();
		  
		  
		  
	}
}
