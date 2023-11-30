package exceptionhandling;

public class NullPointerExceptionExample {

	public static void main(String[] args) {
		try {
			String s = "Hello";
			String s1 = null;
			if (s1.equals(s)) {
				System.out.println("true");
			} else {
				System.out.println("false");
			}
		} catch (NullPointerException e) {
			System.out.println(e);
		}

	}

}
