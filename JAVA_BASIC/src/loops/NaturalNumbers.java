package loops;

import java.util.Scanner;

public class NaturalNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		while(num<=5) {
			System.out.println("Value: " +num);
			num++;
		}
	}

}
