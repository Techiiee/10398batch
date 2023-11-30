package collections;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		//it prints output in natural order without duplicates
		LinkedHashSet <String> set=new LinkedHashSet<String>();
		set.add("java");
		set.add("c");
		set.add("python");
		set.add("java");
		set.add("cloud");
		set.add("html");
		System.out.println(set);
	}

}
