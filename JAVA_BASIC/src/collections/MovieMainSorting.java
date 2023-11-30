package collections;

import java.util.HashSet;
import java.util.TreeSet;

public class MovieMainSorting {

	public static void main(String[] args) {
		MovieExampleSorting m1=new MovieExampleSorting("bahubali","raj",3.4f,4.3f);
		MovieExampleSorting m2=new MovieExampleSorting("Leo","logesh",3.3f,4.4f);
		MovieExampleSorting m3=new MovieExampleSorting("Santhramugi","vasu",3.3f,4.2f);
	
		HashSet<MovieExampleSorting> set=new HashSet<MovieExampleSorting>();
		set.add(m3);
		set.add(m2);
		set.add(m1);
		for(MovieExampleSorting m:set)
		{
			System.out.println(m);
		}
       System.out.println("=============sorting=============");
       TreeSet<MovieExampleSorting> set1=new TreeSet<MovieExampleSorting>();
       set1.add(m3);
		set1.add(m2);
		set1.add(m1);
		for(MovieExampleSorting m:set1)
		{
			System.out.println(m);
		}

   }
}
