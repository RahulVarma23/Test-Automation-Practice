package StringSession;

public class AppendeUnderscore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "HelloHowareYouWelcome";
		// H_
		String newstr = "";
		for (int i = 0; i < str.length(); i++) { // i=5
			if (str.charAt(i) >= 65 && str.charAt(i) <= 90) { // H
				newstr =newstr+  str.charAt(i) + "_"; // H_elloH_

			} else
				newstr = newstr + str.charAt(i); // H_ello
		}
		System.out.println(newstr);
	}

}
