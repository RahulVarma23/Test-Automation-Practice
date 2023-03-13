package StringSession;

import java.util.Arrays;

public class FrequencyOfCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ss = "PoojaPooja";
		// p-2
		// o-4
		// j=2
		// a-2
		char[] ch = ss.toLowerCase().toCharArray();
		System.out.println("Given string is : " + ss);
		for (int i = 0; i < ch.length; i++) {
			//i=1 
			int count = 1;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					//i=1, j=2
					//
					count++; //2
					ch[j] = '0';
				}
			}
			if (ch[i] != '0') {
				System.out.println("Frequency of " + ch[i] + " is " + count);
			}
			
		}
		// System.out.println(Arrays.toString(ch));
		/*
		 * System.out.println("Given string is : " + ss); for (int i = 0; i <
		 * charactercount.length; i++) { if (ch[i] != '0') {
		 * System.out.println("Frequency of " + ch[i] + " is " + charactercount[i]);
		 * 
		 * }
		 */

	}

}
