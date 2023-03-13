package designpattern;


public class Singleton {
	
	//make constructor private
	//declare one variable of instance of class
	//declare one static method which returns instance of class
	
	private static Singleton singleton;
	
	private Singleton() {
			
	}
	
	public static Singleton getInstance() {
		
		  if(singleton==null) { 
			  singleton = new Singleton(); }
		 	
		return singleton;	
	}
	
	public void print() {
		System.out.println("print anything");
	}
	
	public void display() {
		System.out.println("display anything");
	}

}
