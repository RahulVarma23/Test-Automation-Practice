package blocks;

public class Child  {
	
	Child(){
		System.out.println("child constructor");
	}

	static {
		System.out.println("child static block");
	}
	
	{
		System.out.println("child non static block");
	}
	
	void print() {
		System.out.println("print anything");
	}

	public static void main(String[] args) {
		Child c =new Child();
		c.print();
	}

}
