package StringSession;

public class Methodsofstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String ss1="pTOojAr";
   //String ss=ss1.toLowerCase();
  // Integer.valueOf(ss1);
  
   int count=0;
   String regularExp=".*[rt].*";
   //System.out.println(ss.matches(regularExp));
   for(int i=0;i<ss1.length();i++) {
	   if(String.valueOf(ss1.toLowerCase().charAt(i)).matches(regularExp)) {
		   count++;
	   }
   }
	/*
	 * char[] ch=ss.toCharArray(); for(int i=0;i<ss.length();i++) { if(
	 * String.valueOf(ch[i]).matches(regularExp)) { count++; }
	 * 
	 * }
	 */
   System.out.println("count : "+count);
		
	}

}
