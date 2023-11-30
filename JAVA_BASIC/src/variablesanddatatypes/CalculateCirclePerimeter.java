package variablesanddatatypes;

import java.util.Scanner;

public class CalculateCirclePerimeter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the radius of circle");
		int radius=sc.nextInt();
		
		float perimeter=2*3.14f*radius;
		System.out.println("Perimeter of circle is= " + perimeter + " meter");
	}

}
