package exceptionhandling;

import java.util.Scanner;

public class Student {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student id");
		int id=sc.nextInt();
		System.out.println("Enter student name");
		String name=sc.next();
		System.out.println("Enter marks of 5 subjects");
		int m1,m2,m3,m4,m5;
		m1=sc.nextInt();
		m2=sc.nextInt();
		m3=sc.nextInt();
		m4=sc.nextInt();
		m5=sc.nextInt();
		double percentage=(m1+m2+m3+m4+m5)/500.0*100;
		System.out.println(percentage);
		if(percentage==100) {
			System.out.println("Student id=" + id + "\nStudent name=" + name  + "\ntopper");
		}
		else if(percentage>50) {
			System.out.println("Student id=" + id + "\nStudent name=" + name  + "\nEligible For Interview");
		}
		else {
			try {
				throw new Exception("Not Eligible For Interview");
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}

}
