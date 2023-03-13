package operatorsInjava;
import java.util.ArrayList;
import java.util.List;

public class CombinationFinder {
	/*
	 * public static int countCombinations(List<Integer> input, int target) { //
	 * //int count = 0; // // // Check for invalid inputs // if (input == null ||
	 * input.size() < 3) { // return count; // } // // // Find combinations using a
	 * loop // for (int i = 0; i < input.size() - 2; i++) { // int j = i + 1; // int
	 * k = j + 1; // // while (k < input.size()) { // int product = input.get(i) *
	 * input.get(j) * input.get(k); // if (product == target && (j == i+1 || k ==
	 * j+1) && input.get(i) != input.get(j) && input.get(j) != input.get(k) &&
	 * input.get(i) != input.get(k)) { // count++; // j++; // k++; // } else if
	 * (product < target) { // k++; // } else { // j++; // if (j == k) { // k++; //
	 * } // } // } // } // // return count; // }
	 */
	public static int countTriplets(List<Integer> capacity, int desiredCapacity) {
	    int count = 0;

	    // Loop through the list from 0 to length-2
	    for (int i = 0; i < capacity.size() - 2; i++) {
	        for (int j = i + 1; j < capacity.size() - 1; j++) {
	            for (int k = j + 1; k < capacity.size(); k++) {
	                int product = capacity.get(i) * capacity.get(j) * capacity.get(k);
	                if (product == desiredCapacity) {
	                    count++;
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
    	
    	List<Integer> list=List.of(1,2,2,2,4);
    	System.out.println(countTriplets(list,8));
	}
}
