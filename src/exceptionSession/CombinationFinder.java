package exceptionSession;
import java.util.ArrayList;
import java.util.List;

public class CombinationFinder {
    public static int countCombinations(List<Integer> input, int target) {
        int count = 0;

        // Check for invalid inputs
        if (input == null || input.size() < 3) {
            return count;
        }

        // Find combinations using a loop
        for (int i = 0; i < input.size() - 2; i++) {
            int j = i + 1;
            int k = j + 1;

            while (k < input.size()) {
                int product = input.get(i) * input.get(j) * input.get(k);
                if (product == target && (j == i+1 || k == j+1)) {
                    count++;
                    j++;
                    k++;
                } else if (product < target) {
                    k++;
                } else {
                    j++;
                    if (j == k) {
                        k++;
                    }
                }
            }
        }

        return count;
    }
    public static void main(String[] args) {
    	List<Integer> al= new ArrayList<Integer>();
    	al.add(1);
    	al.add(2);
    	al.add(2);
    	al.add(2);
    	al.add(4);
    	System.out.println(countCombinations(al,8));
	}
}
