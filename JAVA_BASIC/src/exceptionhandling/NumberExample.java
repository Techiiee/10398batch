package exceptionhandling;

public class NumberExample {

	public static void main(String[] args) {
		String s = "Hello";
		try {
			int i = Integer.parseInt(s);
			System.out.println(i);
		} catch (NumberFormatException e) {
			System.out.println(e);
		}

	}

}
