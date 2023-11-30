package polymorphism;

public class MethodOverloadExample {
 
	public int add(int x,int y)
	{
		int z=x+y;
		return z;
		
	}
	public float add(float a)
	{
		float c=a+2;
		return c;
		
	}
	public double add(double p,double q,double r)
	{
		double s=p+q+r;
		return s;
		
	}
}
