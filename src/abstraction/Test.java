package abstraction;

class One{
	
	public One(int x){
		System.out.print("int constructor");
	}

	public One(char c){
		System.out.print("char constructor");
	}
	
	void One(String str){
		System.out.print("String constructor");
	}
}

public class Test{
	
	public static void main(String[] args){
		int ch = 1;
		One one = new One(ch);		
	}		
}