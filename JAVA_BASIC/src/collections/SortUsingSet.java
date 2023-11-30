package collections;

import java.util.TreeSet;

public class SortUsingSet {

	public static void main(String[] args) {
		//treeset sort data in ascending order by default
		TreeSet <String>set=new TreeSet<String>();
		set.add("java");
		set.add("c");
		set.add("python");
		set.add("java");
		set.add("cloud");
		set.add("html");
		System.out.println(set);
	}

}
