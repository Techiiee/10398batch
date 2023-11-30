package loops;

import java.util.Scanner;

public class EvenOddNaturalNum {

	public static void main(String[] args) {
		// WAP to print the even natural number and odd natural numbers
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
	    int n=sc.nextInt();
		sc.close();
		
		int start=1;
		int evencount=0;
		int oddcount=0;
		
		while(start<=n) //1<=5 2<=5 3<=5 4<=5 5<=5
		{
			if(start%2==0)//2%2==0 3%2==0 4%2==0 5%2==0
			{
				System.out.println("even natural number: " + start);
				evencount++;//2
			}
			else {
				System.out.println("odd natural number: "+ start);
				oddcount++;//2
			}
			start++;//2,3,4,5
		}
		System.out.println("The even count="+evencount);
		System.out.println("The odd count="+oddcount);
	}

}
