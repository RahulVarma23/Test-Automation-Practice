package p1.com;

public class demo11 {
	
	static int x=12;
	static String a="ankita";
	
	public static boolean bookmeetingroom(String roomname) {
		//String roomname="orion";
		boolean flag=true;
		System.out.println("book APJ room");
		x=13;
		System.out.println(a);
		return true;
	}
	 void calling() {
		//bookmeetingroom();
		System.out.println("calling");
		bookmeetingroom("orion");
	}
	public static void main(String[] args) {
		//bookmeetingroom("sun"); //bookAPJ room Ankita
		//calling(); 
		}
	
}
