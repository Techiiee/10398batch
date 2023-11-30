package encapsulation;

public class Demo {
	private int a;
	private int b;

	public Demo() {

	}

	public Demo(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int addition() {
		return a + b;
	}

}
