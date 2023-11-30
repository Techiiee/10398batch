package NestedForLoop;

public class NumberPattern5 {

	public static void main(String[] args) {
		//1
		//23
		//456
		int num=1;
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=i;j++) //or for(int j=i;j>=1;j--)
			{
				System.out.print(num++);
			}
			System.out.println(); //Next line
		}

	}

}
