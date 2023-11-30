package exceptionhandling;

public class ArrayIndexOutOfBoundExample {

	public static void main(String[] args) 
	{
		try
		{
		int a[]= {1,2,3};
		System.out.println(a[7]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}

	}

}