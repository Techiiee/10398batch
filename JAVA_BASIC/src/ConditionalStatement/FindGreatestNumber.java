package ConditionalStatement;

public class FindGreatestNumber {

	public static void main(String[] args) {
		// 1.WAP to get three number and print the greatest number?
		
		int x=8,y=11,z=10;
		if(x>y && x>z)
		{
		    System.out.println("The greatest value is x = " + x);	
		}
		else if(y>x && y>z)
		{
			System.out.println("The greatest value is y = " + y);
		}
		else
		{
			System.out.println("The greatest value is z = " + z);

        }

	}

}

//Scanner sc=new Scanner(System.in);
//System.out.println("enter the inputs");
//int x=sc.nextInt();//5
//int y=sc.nextInt();//3
//int z=sc.nextInt();//8
//int max=x;//max=5
//if(max<y)//5<3
//{
//	max=y;
//}
//if(max<z)//5<8
//{
//	max=z;//max=8
//}
//System.out.println("The Max =:"+max);//max=8
