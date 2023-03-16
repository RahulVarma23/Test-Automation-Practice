package blocks;

public class DemoBlocks {
	
	 int a;
	
	DemoBlocks(){
		System.out.println("parent constructor");
		a=40;
	}

	static {
		System.out.println("parent static block");
	}
	
	{
		System.out.println("parent non static block");
		a=30;
	}
	
	public static void main(String[] args) {
		DemoBlocks d = new DemoBlocks();
		System.out.println(d.a);
	}
}
