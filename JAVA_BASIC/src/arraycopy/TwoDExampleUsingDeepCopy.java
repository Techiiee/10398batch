package arraycopy;

public class TwoDExampleUsingDeepCopy {
//2d array does not support deep copy
	public static void main(String[] args) {
		int a[][]= {{1,2},{2,3},{4,5},{6,7}};
		int a1[][]=a.clone();
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("=====================");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(a1[i][j]);
			}
			System.out.println();
		}
a[0][0]++;
System.out.println("after increment=====================");


for(int i=0;i<a.length;i++)
{
	for(int j=0;j<2;j++)
	{
		System.out.print(a1[i][j]);
	}
	System.out.println();
}
	}

}
