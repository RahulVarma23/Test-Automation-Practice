package polymorphismSession;

public class Child extends ORSessionParent {
	//A extends B
	int y=30;
	  int z=40;
	  public void m2(int a , int b) {
		 // System.out.println("m2 method of child class");
		  int price=a*b;
		  System.out.println(price);
	  }
	  public void m3() {
		  System.out.println("m3 method of child class");
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ORSessionParent p= new Child();
		System.out.println(p.x); //10
		System.out.println(p.y); //20 
		//System.out.println(p.z);
		p.m1();  //m1 method of parent class
		p.m2(10,20);  //m2 method of child class
		
		
	}

}
