package loops;

import java.util.Scanner;

public class MultipleOfNaturalNumber {

	public static void main(String[] args) {
		//WAP to print the multiple of 3 in natural number
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		sc.close();
		
		int i=1;
		
		System.out.println("Multiple of 3 between 1 to " + num + " are: ");
		while(i<=num)
		{
			if(i%3==0) 
			{
				 System.out.println(i);
			}
			i++;
		}

	}

}
