package polymorphismSession;
//Method Overloading
public class OLSession {
  void bookMeetingRoom() {
	  System.out.println("Booked a meeting room");
  }
  void bookMeetingRoom(String roomName) {
	  System.out.println("Booked a meeting room : "+roomName);
  }
  void bookMeetingRoom(String roomName , int time) {
	  System.out.println("Booked a meeting room : "+roomName+" "+time);
  }
  void printNumber(int a) {
	  System.out.println("int");
  }
  
void printNumber(long a) {
	  System.out.println("long");
  }
void printNumber(short a) {
	  System.out.println("short");
}
void printNumber(float a) {
	  System.out.println("float");
}
void printNumber(double a) {
	  System.out.println("double");
}
  	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OLSession ol= new OLSession();
		/*
		 * ol.bookMeetingRoom(); ol.bookMeetingRoom("warzone1");
		 * ol.bookMeetingRoom("warzone2", 1);
		 */
	ol.printNumber(9595276172l);
    ol.printNumber(-20);
	}

}
