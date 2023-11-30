package abstraction;

public class Rectangle extends Shape{
       private int length;
       private int breadth;
        
       public Rectangle() {}

       
       
	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}


	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}



	@Override
	public double getArea() {
		return length*breadth;
	}



	@Override
	public double getPerimeter() {
		return 2*(length+breadth);
	}



	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", breadth=" + breadth +
				", getArea()=" + getArea() + ", getPerimeter()=" + getPerimeter()
				+ "]";
	}
       
	
       
	
}
