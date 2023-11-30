package NestedForLoop;

public class Pattern2 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)//1 2 3 4
		{
			for(int j=i;j>=1;j--) //or for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println(); //Next line
		}

	}

}
