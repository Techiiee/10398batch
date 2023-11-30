package FactoryDesignPattern;

import java.util.Scanner;

public class FactoryDesignMain {

	public static void main(String[] args) {
		GetPlaneFactory g = new GetPlaneFactory();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the plane name");
		String planeName = sc.next();//
		System.out.print("Enter the number of units for bill will be calculated: ");
		int units = sc.nextInt();

		Plane p = g.getPlane(planeName);
		// call getRate() method and calculateBill()method of DomesticPaln.

		System.out.print("Bill amount for " + planeName + " of  " + units + " units is: ");
		p.getRate();
		p.calculateBill(units);

	}

}
