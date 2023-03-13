package StringSession;

import java.util.Arrays;

public class Stringmethodsprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1.toLowercase()
//2.toUppercase()
//3.charAt(int index) --
//4.length()  --method to give length of string
//5.substring()
//6.toCharArray()	
//7.trim()
//split()
//== and .equals
 		
		//String s = "Asdc14#B7C8$"; //ABaaC1478#$
		
		
	     

		String s="AnkitaSinha";
		System.out.println(s.charAt(2));
		System.out.println(s.substring(2));
		System.out.println(s.substring(2, 4));
		char[] ch=s.toCharArray();
		System.out.println(Arrays.toString(ch));
		//System.out.println(s.trim());
		String[] ss=(s.split("S"));
		//System.out.println(ss);
		//System.out.println(Arrays.toString(ss));
		String s1="Anjuli";
		String s2="Anjuli";
		String s11= new String ("PoOja");
		String s22=new String("pooja");
		/*
		 * System.out.println(s1==s2); System.out.println(s11==s22);
		 */
		System.out.println(s11.equalsIgnoreCase(s22));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	    
		
		
	

		
	}

}
