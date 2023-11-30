package loops;

import java.util.Scanner;

public class Factor {

	public static void main(String[] args) {
		// WAP to print the factors of given number?

//          input:5
//          o/p:1,5
//          input:6
//          o/p:1,2,3,6
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter any number");
		int num=scanner.nextInt();
		scanner.close();
		
		int i=1;
		System.out.println("The factors of " + num + " are:");
		while(i<=num) {
			if(num%i==0) {
				 System.out.print(i+ " ");
			}
			i++;
		}
	}

}
