package p1.com;

public class demo111 {
//package  >> class >> constructor/Instance variable/methods
	// /methods(local variables) 
	static int number=12;  //instance variable
	static  int number1=15;
	
	public static void main(String[] args) {
		int number =12; //local variable
		System.out.println(number1);
		//return number;
		printsome();
		//return "Pooja";
	}
	
	static void printsome() {
	System.out.println("Hello world");
	int age=12;  //local variable
	System.out.println(age);
	System.out.println(number);
	}
	
	
	void checkeven() {  //void /int boolean String
		boolean flag=false;
			int num=12;
		if(num%2==0) {
			flag=true;
		}
		//return num;
	}
	
	
	
	 int printmyname(){
		 String name ="Ankita";
		 int experience=6;
		 return experience;
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
