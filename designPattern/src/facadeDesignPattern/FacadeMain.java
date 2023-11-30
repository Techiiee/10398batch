package facadeDesignPattern;

import java.util.Scanner;

public class FacadeMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the choice");
		int choice = sc.nextInt();
		Shopkeeper s = new Shopkeeper();
		sc.close();
		switch (choice) {
		case 1:
			System.out.println("Iphone");
			s.iphoneSal();
			break;

		case 2:
			System.out.println("Samsung");
			s.samsungSal();
			break;

		case 3:
			System.out.println("BlakBerry");
			s.blackBerrySal();
			break;
		}

	}

}
