package exceptionSession;

public class Child extends Parent {
	
	Child(){
		System.out.println("child constructor");
	}
	
	void print() {
		System.out.println("child print");

	}
	
	void print1(){
		super.print();
		this.print();
		
	}

	public static void main(String[] args) {
		Child c = new Child();
        c.print1();
	}

}
