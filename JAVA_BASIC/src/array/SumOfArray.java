package array;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();//3
		int sum=0;
		
		int a[]=new int[size];//0 1 2
		for(int i=0;i<a.length;i++)//0<3 1<3 2<3
		{
		    a[i]=sc.nextInt();//a[0]=1 a[1]=2 a[2]=99
		    sum=sum+a[i];
		}
		
			System.out.println(sum);//a[0]=11 a[1]=12
		
	}

}
