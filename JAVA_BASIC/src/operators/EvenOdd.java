package operators;

import java.util.Scanner;
//even odd program using relational operator
public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the inputs");
		int n=sc.nextInt();
		boolean even = n%2==0;
        System.out.println("The number is even = " + even);
	}

}

