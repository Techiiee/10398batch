package collections;

import java.util.HashSet;

public class HashSetExample {
   //it prints output in unordered way without duplicates
	public static void main(String[] args) {
		HashSet <String> set=new HashSet<String>();
		set.add("java");
		set.add("c");
		set.add("python");
		set.add("java");
		set.add("cloud");
		set.add("html");
		System.out.println(set);
	}

}
