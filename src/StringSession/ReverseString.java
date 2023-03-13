package StringSession;

public class ReverseString {
  public String reverseName(String name) {
	  String rev="";
	  for(int i=name.length()-1;i>=0;i--) {
		  rev=rev+name.charAt(i);
	  }
	  return rev;
	  
  }
  
  public StringBuilder reverseName() {
	  String name="Ankita";
	  StringBuilder sb= new StringBuilder(name);
	  
	  return sb.reverse();
  }
  
  public String revName() {
	  String name="Ankita";
	  StringBuffer sb= new StringBuffer(name);
	  
	  return sb.reverse().toString();
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseString rs= new ReverseString();
		System.out.println(rs.reverseName("Ankita"));
		System.out.println(rs.reverseName());
	}

}
