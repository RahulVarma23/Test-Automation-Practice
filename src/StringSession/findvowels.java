package StringSession;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class findvowels {

	public static void findVowels() {

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "POoja";
		char[] ch = name.toCharArray(); // {P ,o ,o ,j,a}
		for (int index = 0; index < ch.length; index++) {
			if (ch[index] == 'a' || ch[index] == 'e' || ch[index] == 'i' || ch[index] == 'o' || ch[index] == 'u') {
				// System.out.println(ch[index]);
			}
		}

		/*
		 * Pattern pattern = Pattern.compile("[aeiouAEIOU]"); Matcher matcher =
		 * pattern.matcher(name); System.out.println( matcher.find());
		 */
		String regex = ".*[aeiou].*";
		int count = 0;

		/*
		 * for (int index = 0; index < name.length(); index++) { //
		 * System.out.println(String.valueOf(name.charAt(index))); if
		 * (String.valueOf(name.toLowerCase().charAt(index)).matches(regex)) { count++;
		 * } }
		 */
		// String.valueOf(c).matches(regex);
		// System.out.println(name.toLowerCase().matches(regex));
		//System.out.println(count);

	}
}
