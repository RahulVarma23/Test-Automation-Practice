package filereading;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ReadFile {

	public static String getContentFromTxtFile(String fileLocation) throws IOException {
		FileReader fileReader = new FileReader(fileLocation);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		StringBuffer sb = new StringBuffer();
		String line;

		while ((line = bufferedReader.readLine()) != null) {
			sb.append(line).append(" ");
		}
		return sb.toString();
	}
	
	public static int calculateFrequencyOfWord(String input, String word) {
		String[] s = input.split(" ");
		Map<String, Integer> map = new HashMap<String, Integer>();

		for (String str : s) {
			if (map.containsKey(str)) {
				map.put(str, map.get(str) + 1);
			} else {
				map.put(str, 1);
			}
		}
		return map.get(word);
	}

	public static void main(String[] args) throws IOException {
		String ans = getContentFromTxtFile("E:\\OrionTechAutomation\\testing.txt");
		System.out.println(ans);
		//hi Rahul hello Rahul . how are you Rahul?
		
		System.out.println(calculateFrequencyOfWord(ans ,"are"));
		
		
		
		
	}
}
