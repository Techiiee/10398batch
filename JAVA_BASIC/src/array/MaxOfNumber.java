package array;

import java.util.Scanner;

public class MaxOfNumber {

	public static void main(String[] args) {
		// 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		int a[]=new int[size];
		
		int max=a[0];
		System.out.println("Enter the elements");
		for(int i=0;i<a.length;i++)//0<3 1<3 2<3
		{
			a[i]=sc.nextInt();
			if(max<a[i]) {
				max=a[i];
			}
			
		}
		System.out.println("The maximum number is = " + max);
	}

}
