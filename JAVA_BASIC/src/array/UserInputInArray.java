package array;

import java.util.Scanner;

public class UserInputInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();//3
		
		int a[]=new int[size];//0 1 2
		for(int i=0;i<a.length;i++)//0<3 1<3 2<3
		{
		 a[i]=sc.nextInt();//a[0]=1 a[1]=2 a[2]=99
		}
		for(int i=0;i<a.length;i++)//0<5 1<5
		{
			System.out.println(a[i]);//a[0]=11 a[1]=12
		}

	}

}
