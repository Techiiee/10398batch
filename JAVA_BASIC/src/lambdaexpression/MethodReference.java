package lambdaexpression;

public class MethodReference {
	static void display()
	{
		System.out.println("hello");
	}
	void display1()
	{
		System.out.println("hey");
	}
	
	   MethodReference() {
			System.out.println("hi");
		}

	public static void main(String[] args) {
		//to call the normal interface method we will create class object
		MethodReference m=new MethodReference();
		Demo d=m::display1;
		d.demo();
		
		//to call static interface method we will use call name for method reference
		Demo d1=MethodReference::display;
		d1.demo();
		
		//we can call the constructor using new keyword
		Demo d2=MethodReference::new;
		d2.demo();
    }
}

