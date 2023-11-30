package interfaces;

public class Dog implements Animal {

	@Override
	public void sleep() {
		System.out.println("Dog can sleep more than 10 hrs a day");
	}

	@Override
	public void eat() {
		System.out.println("Dogs eat every kind of food");
	}
     
}
