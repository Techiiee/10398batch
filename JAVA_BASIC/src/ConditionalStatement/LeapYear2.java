package ConditionalStatement;

import java.util.Scanner;

public class LeapYear2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	       System.out.println("enter the year");
	       int year=sc.nextInt();
		if((year%4==0) || (year%400==0) && (year%100!=0)) {
			System.out.println("Year is a leap year");
		}
		else {
			System.out.println("Not a leap year");
		}

	}

}
