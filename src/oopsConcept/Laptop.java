package oopsConcept;

public class Laptop {
  String brandName;
  int RAM;
  int ROM;
  int displaysize;
  String processor;
   void watchMovie() {
	   System.out.println("movies");
   }
  final void printBrandName() {
	 
   }
   void printBrandName(String str) {
		 
   }

	
	  Laptop(Laptop lap){
		  System.out.println(this.brandName=lap.brandName); }
	 
	  Laptop(String brand){
		  this.brandName=brand;
	  }
    Laptop(){
	 
   }
   public static void main(String[] args) {
	   Laptop lap= new Laptop();
	   lap.brandName="Lenovo";
	  //System.out.println( lap.brandName="Lenovo");
	  
	  Laptop lap1= new Laptop(lap);
	  
	   
	System.out.println();
}
}
