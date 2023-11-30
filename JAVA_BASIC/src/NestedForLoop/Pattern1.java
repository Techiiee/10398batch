package NestedForLoop;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=3;i++)//1<=3 2<=3 3<=3
		{
			for(int j=1;j<=3;j++)//1<=3 2<=3 3<=3 4<=3
				                //1<=3 2<=3 3<=3 4<=3
				                  //1<=3 2<=3 3<=3 4<=3
			{
				System.out.print("*");//***
				                        //***
				                        //***
			}
			System.out.println(); //next line
		}


	}

}
