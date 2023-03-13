package scannerclassdemo;

import java.util.Scanner;
public class scannerdemo {
	
public static boolean checkevennumber() {
	Scanner s=new Scanner(System.in);
	boolean flag=false;
	System.out.println("Please enter your number");
	int num=s.nextInt();
	if(num % 2 == 0) {
		//System.out.println("This is even number");
		flag=true;
	}
	
	return flag;
}
//InputMismatchExpection -when user enters incorrect datatype
	/*
	 * if(condition){ statement } else {statement}
	 */

public static int learningloop()
{
	Scanner s = new Scanner(System.in);
	int arr[]= {1,2,3,4,5};
	int newarray[]= new int[6];
	newarray[0]=11;
	newarray[1]=12;
	//newarray[2]=13;
	newarray[3]=14;
	//newarray[4]=15;
	//newarray[1]=
	for(int index=0;index<newarray.length;index++) { //index=5 5<=5
		System.out.println(newarray[index]); //5
	}
	//array index starts from 0
	//System.out.println(array);
	/*
	 * for(startpt,condition,end) { statement }
	 */
	/*
	 * System.out.println("length of array"+" "+arr.length); //5 for(int
	 * index=0;index<=arr.length;index++) { //index=5 5<=5
	 * //System.out.println(arr[index]); //5 }
	 */
	return 12;
}
//ArrayIndexOutOfBoundException
public static void main(String[] args) {
		
		// TODO Auto-generated method stub
//Scanner s= new Scanner(System.in);
//System.out.println("Enter your name");
//String name= s.next();
//System.out.println("My name is"+ " "+name);
//int number=s.nextInt();
//float fl=s.nextFloat();
//float pi=s.nextFloat();
//System.out.println(checkevennumber());
	//boolean f=checkevennumber();  //true/false
	//System.out.println(f);
	learningloop();

	}

}
