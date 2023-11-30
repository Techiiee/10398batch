package NestedForLoop;

public class NumberPattern1 {

	public static void main(String[] args) {
		for(int i=1;i<=3;i++)//1 2 3 4
		{
			for(int j=1;j<=3;j++)//1 2 3 4
			{
				System.out.print(j);//123
				                    //123
				                    //123
			}
			System.out.println(); //Next line
		}

	}

}
