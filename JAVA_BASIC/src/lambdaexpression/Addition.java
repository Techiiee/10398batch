package lambdaexpression;

@FunctionalInterface
public interface Addition 
{
	public int add(int x,int y);
	default void display()
	{
		System.out.println("hello");
	}
}
