package NestedForLoop;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int start=1;
		int fact=0;
		while(start<=n)//1<=5 2<=5 3<=5 4<=5 5<=5
		{
			if(n%start==0)//5%1==0 5%2==0 5%3==0 5%4==0 5%5==0
			{
				fact++;//2
			}
			start++;//2,3,4,5
		}
if(fact==2)
{
	System.out.println("prime number");
}
else
{
	System.out.println("composite number");
}
	}

}
