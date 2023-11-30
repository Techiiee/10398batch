package polymorphism;

public class MethodOverloadMain {

	public static void main(String[] args) {
		MethodOverloadExample moe=new MethodOverloadExample();
		System.out.println(moe.add(3,4));
		System.out.println(moe.add(3.4,5.6,7.8));
		System.out.println(moe.add(4.5f));
	}

}
