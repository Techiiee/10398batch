package loops;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// WAP to print factorial of a number
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter any factorial number");
		int num=scanner.nextInt();
		scanner.close();
		
		int i=1;
		int fact=1;
		while(i<=num) {
			fact=fact*i;
			i++;
		}
		System.out.println("The factorial of " + num + " is " + fact);
	}

}
