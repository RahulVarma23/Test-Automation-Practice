package programspractise;

import java.util.Scanner;

public class sortAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array1[] = { 5, 7, 2, 9, 1 ,0,3,8,13,78};
		/*
		 * Scanner sc= new Scanner(System.in); int array2[] = null;
		 * System.out.println("Enter array"); int num1= sc.nextInt();
		 * 
		 * array2[0]=num1;
		 */
		for (int i = 0; i < array1.length; i++) { //i=3 , j=4
			// i=0
			//brute force algo
			for (int j = i + 1; j < array1.length; j++) { // j=3  j upto 4
				int temp = 0;
				//i=1               j=3
				//array1[3]=9     array1[4]=7   9>7
				if (array1[i] > array1[j]) {  //
					temp = array1[i]; //  
					array1[i] = array1[j]; //  2
					array1[j] = temp; // 5
				}

			}			
			System.out.print(array1[i]+",");
			
		}
		System.out.println("");
		System.out.println("Smallest number is : "+array1[0]);
		System.out.println("Largest Number is : "+array1[array1.length-1]);
		/*
		 * for(int index=0; index<array1.length;index++) {
		 * System.out.print(array1[index]); }
		 */
	//	System.out.println(array1.toString());
	}

}
