package ses;

public class CC implements interA , interB{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    CC c=new CC();
    c.m1();
    System.out.println(interA.a);
  // System.out.println(c.a); 
	}

	@Override
	public void m1() {
		System.out.println("print");
		
	}
	public void m1(String s) {
		System.out.println("print");
		
	}

}
