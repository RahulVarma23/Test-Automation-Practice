package operatorsInjava;

public class operatorsInJava {
	 //while loop
	//while(condition){statement}
	public static void test() {
		int num=0;
		while (num <=5) { 
			System.out.println("learning while loop "+ num);
			num++;
		}
	}
	//airthematic operator +,-,*,/,%
	//unary operator -,!,++,--
	//assignment opeartor = , += (a +=10 >> a= a+10) , -= , *= . /= , %=
	//relational operator == ,!=
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         //test();
		int a =100;
		System.out.println(a);
		a +=100; //a= //a+100 //200
		System.out.println(a);
		float f=99.99f;
		int num =10;
//System.out.println(-num);
boolean flag=false;
int num1=12;
while(num != 12) { //true
    	 
	num++;
	System.out.println("xyz");
     }
int age=19;
//System.out.println(age);
//age--;
//System.out.println(age);
//--age;
//System.out.println(age);
	

	//logical operator && and ||
	if(age >=8 || age <= 12) {
		System.out.println("allowed");
	}
	else System.out.println("deny");
	
	if (age ==19) {
		System.out.println("accept");
	}
	}
}
