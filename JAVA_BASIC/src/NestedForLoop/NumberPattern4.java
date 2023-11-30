package NestedForLoop;

public class NumberPattern4 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)//1 2 3 4
		{
			for(int j=1;j<=i;j++) //or for(int j=i;j>=1;j--)
			{
				System.out.print(i);
			}
			System.out.println(); //Next line
		}

	}

}
