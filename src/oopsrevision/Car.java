package oopsrevision;

public class Car extends Vehicle{
	
	int b =10;
	
	Car(){
		super();
		System.out.println("Car constructor");

	}

	@Override
	public void run() {
		System.out.println("Car is running");
	}
	

	
	public static void main(String[] args) {
		Car c = new Car();
		c.run();
	
	}


	

	

}
