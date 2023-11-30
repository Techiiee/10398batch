package strings;

public class Demo {

	public static void main(String[] args) {
		String s="Hello";//literal
		String s1=new String("Hello");//object
		//String s1="HELLO";
		System.out.println(s);
		System.out.println(s1);
		
		//methods in string
		System.out.println(s.charAt(0));//H
		System.out.println(s.indexOf('H'));//0
		System.out.println(s.concat("hii"));//hellohii
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.contains("H"));

		System.out.println(s.equals(s1));//boolean
		System.out.println(s.startsWith("H"));
		System.out.println(s.endsWith("o"));
	     System.out.println(s.trim());
	     System.out.println(s.length());
	     System.out.println(s.equalsIgnoreCase(s1));
	     
	     System.out.println(s.compareTo(s1));
		    //s1 eqaul to s2==>0
		    //s1 higher than s2 ==>positive
		     //s1 lessthan s2==>negative
		    
		    System.out.println(s==s1);//check the memory
	}

}
