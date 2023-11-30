package abstraction;

public class Circle extends Shape{

//	@Override
//	void draw() {
//		System.out.println("I can draw a circle");
//	}

	private int radius;
	public Circle(){}
	public Circle(int radius) {
		super();
		this.radius = radius;
	}
	
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}


	@Override
	public double getArea() {
		return Math.PI*radius*radius;
		
	}
	@Override
	public double getPerimeter() {
		return 2*Math.PI*radius;
		
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", getArea()=" + getArea() + ", getPerimeter()=" + getPerimeter() + "]";
	}
}
