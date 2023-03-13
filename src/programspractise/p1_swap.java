//WAP to enter two number from user and swap those number
package programspractise;

import java.util.Scanner;

public class p1_swap {
//instance variable
	int num;
	//class variable
	static int num1;
	//int num=12;
	
	
	
	 void swapnumber() {
		//local variable
	 int num;
	//System.out.println(num);
	}
	 
	 
	 
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 1st number");
		int num1=sc.nextInt(); //20
		System.out.println("Enter 2nd number");
		int num2=sc.nextInt(); //40
		int num3=num2; //40
		num2=num1; //20
		num1=num3;
		System.out.println("After swap : number are "+ num1 +" "+num2);
		p1_swap p=new p1_swap();
		System.out.println(num1);
		
	}
}
