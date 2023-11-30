package decoratorDesignPattern;

public class FoodDecorator implements Food
{
	Food newfood;
	public FoodDecorator(Food newfood)
	{
		this.newfood=newfood;
	}
	@Override
	public String prepareFood() {
		// TODO Auto-generated method stub
		return newfood.prepareFood();
	}

	@Override
	public double foodPrice() {
		// TODO Auto-generated method stub
		return newfood.foodPrice();
	}

}
