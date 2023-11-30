package variablesanddatatypes;

import java.util.Scanner;

public class CalculateCircleArea {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the radius of circle");
		int radius=sc.nextInt();
		
		float area=3.14f*radius*radius;
		System.out.println("Area of circle is= " + area + " squaremeter");
	}

}
