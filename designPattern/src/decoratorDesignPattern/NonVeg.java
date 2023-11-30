package decoratorDesignPattern;

public class NonVeg extends FoodDecorator {

	public NonVeg(Food newFood) {
		super(newFood);
	}

	public String prepareFood() {
		return super.prepareFood() + " With Roasted Chicken and Chicken Curry  ";
	}

	public double foodPrice() {
		return super.foodPrice() + 150.0;
	}
}
