package interfaces;

public class C implements A,B{

	@Override
	public void b() {
		System.out.println("b");
	}

	@Override
	public void a() {
		System.out.println("a");
	}  
}
