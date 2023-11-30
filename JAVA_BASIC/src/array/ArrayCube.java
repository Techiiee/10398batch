package array;

import java.util.Scanner;

public class ArrayCube {

	public static void main(String[] args) {
		
		//WAP to get inputs  using array and calculate cube of array?
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();//3
		int cube=0;
		
		int a[]=new int[size];//0 1 2
		for(int i=0;i<a.length;i++)//0<3 1<3 2<3
		{
			System.out.println("Enter the number");
		    a[i]=sc.nextInt();//a[0]=1 a[1]=2 a[2]=99
		    cube=cube+a[i]*a[i]*a[i];
		}
		System.out.println(cube);
		sc.close();
	}

}
