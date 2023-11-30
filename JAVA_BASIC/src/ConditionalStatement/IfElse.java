package ConditionalStatement;

public class IfElse {

	public static void main(String[] args) {
			int x=8,y=9;
			if(x<y && x==y)
			{
			System.out.println("x value is lessthan and equal to y");	
			}
			else if(x<y || x==y)
			{
				System.out.println("x value is lessthan but not equal to y");
			}
			else
			{
				System.out.println("all condition false");

	        }
	}
}