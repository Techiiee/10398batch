package collections;

import java.util.LinkedHashSet;

public class MovieMain {

	public static void main(String[] args) {
		MovieDemoUsingSets movie1=new MovieDemoUsingSets("The Wailing","Fang Lui",2,7.8f);
		MovieDemoUsingSets movie2=new MovieDemoUsingSets("Sita Raman","Hanu",2,8.6f);
		MovieDemoUsingSets movie3=new MovieDemoUsingSets("Pathan","Siddharth Anand",3,9);
		MovieDemoUsingSets movie4=new MovieDemoUsingSets("RRR","xyz",3,10);
	
		LinkedHashSet<MovieDemoUsingSets> set=new LinkedHashSet<MovieDemoUsingSets>();
		set.add(movie1);
		set.add(movie2);
		set.add(movie3);
		set.add(movie4);
		set.add(movie4);
		System.out.println(set);
	}

}
