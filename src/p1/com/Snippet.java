package p1.com;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Snippet {
	/*
	 * public static long countAdjacentProductCombinations(List<Integer> capcity,
	 * long desiredCapacity) { int count = 0; int n = capcity.size(); for (int i =
	 * 0; i < n; i++) { int a = capcity.get(i); for (int j = i + 1; j < n; j++) {
	 * int b = capcity.get(j); for (int k = j + 1; k < n; k++) { int c =
	 * capcity.get(k); int product = a * b * c; if (product == desiredCapacity) {
	 * if(j==i+1 || k==j+1) count++; } } } } return count; }
	 */
	public static long countAdjacentProductCombinations(List<Integer> capacity, long desiredCapacity) {
	    Collections.sort(capacity);
	    int n = capacity.size();
	    int count = 0;
	    for (int i = 0; i < n - 2; i++) {
	        int left = i + 1;
	        int right = n - 1;
	        while (left < right) {
	            long product = (long) capacity.get(i) * capacity.get(left) * capacity.get(right);
	            if (product == desiredCapacity) {
	                if (left == i + 1 || right == n - 2) {
	                    count++;
	                }
	                left++;
	                right--;
	            } else if (product < desiredCapacity) {
	                left++;
	            } else {
	                right--;
	            }
	        }
	    }
	    return count;
	}

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 2, 2, 4);
		long desiredCapacity = 8;
		long count = countAdjacentProductCombinations(list, desiredCapacity);
		System.out.println("Count of adjacent product combinations: " + count);
		//System.out.println(countAdjacentProductCombinations(list, 8));
	}
}