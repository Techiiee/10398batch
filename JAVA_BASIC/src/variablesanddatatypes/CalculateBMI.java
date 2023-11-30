package variablesanddatatypes;

import java.util.Scanner;

public class CalculateBMI {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your weight in kg");
		int weight=scanner.nextInt();
        System.out.println("Enter your height in meter");
        float height=scanner.nextFloat();
        
        float BMI=weight/(height*height);
        
        System.out.println("Your BMI is = " + BMI);
	}

}
//
//package variablesanddatatypes;
//
//import java.util.Scanner;
//
//public class CalculateBMI {
//
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the weight");
//		int weight=sc.nextInt();
//		System.out.println("enter the height");
//		int height=sc.nextInt();
//		double BMI=(double)weight/(height*height);
//		System.out.println("The Bmi is=:"+BMI);
//
//	}
//
//}
