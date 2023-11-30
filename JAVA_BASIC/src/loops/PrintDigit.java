package loops;

import java.util.Scanner;

public class PrintDigit {

	public static void main(String[] args) {
		/*
		 * WAP to print the digit of the given number? input:123, o/p:3 2 1
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		sc.close();
		int digit = 0;

		// using while
		while (num != 0) {
			digit = num % 10;// 3
			System.out.println("while " + digit);// 3 2 1
			num = num / 10;// n=12 n=1 0
		}

		// using do-while
		do {
			digit = num % 10;// 3
			System.out.println("do-while " + digit);// 3 2 1
			num = num / 10;// n=12 n=1 0
		} while (num != 0);

		// using for loop
		for (; num != 0;) {
			digit = num % 10;
			num = num / 10;
			System.out.println("for " + digit);
		}

	}

}
