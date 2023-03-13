package rev;

public class accessmodifierrev {
  private static int num=12;
  {
	  System.out.println();
	  }
  
  //public static int num3=12;
 // protected static int num4=12;
     // static int num2=26;
 static String name="Ankita";
  String name1="Pooja";
      
      static void mymethod() {
    	  //private int num=78;
      }
      void printnum() {
    	  System.out.println("ankita");
      }
      void printnum1() {
    	  printnum();
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(accessmodifierrev.name);
		accessmodifierrev am= new accessmodifierrev();
		System.out.println(am.name1);
		am.printnum1();
	}

}
