package FactoryDesignPattern;

public abstract class Plane {
	protected double rate;

	abstract void getRate();

	public void calculateBill(int units) {
		System.out.println(units * rate);
	}
}
