package collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
	//it prints output in ordered way in ascending order without duplicates
	public static void main(String[] args) {
		TreeSet <String>set=new TreeSet<String>();
		set.add("java");
		set.add("c");
		set.add("python");
		set.add("java");
		set.add("cloud");
		set.add("html");
		System.out.println(set);
		
		System.out.println("============for -each");
		for(String temp:set)
		{
			System.out.println(temp);
		}
		System.out.println("============Iterator");
		Iterator<String>it=set.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
