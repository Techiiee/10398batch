package strings;

public class StringBufferExample {

	public static void main(String[] args) {
	      StringBuffer s=new StringBuffer("Hello");
	      System.out.println(s);
	      s.append("hai");
	      System.out.println(s);
	      s.insert(3, "java");
	      System.out.println(s);
	      s.replace(2, 5, "world");
	      System.out.println(s);
	      s.delete(2, 4);
	      System.out.println(s);
	      s.reverse();
	      System.out.println(s);
	}

}
