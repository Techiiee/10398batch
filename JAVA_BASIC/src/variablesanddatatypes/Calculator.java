package variablesanddatatypes;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int sum=num1+num2;
		int sub=num1-num2;
		float multi=num1*num2;
		float division=num1/num2;
		
		System.out.println("The sum of two number is: " + sum);
		System.out.println("The subtraction of two number is: " + sub);
		System.out.println("The product of two number is: " + multi);
		System.out.println("The division of two number is: " + division);
	}

}
