package tasks;

import java.util.ArrayList;

import java.util.List;


public class MovieMain {

	public static void main(String[] args) {
		Movie movie1=new Movie("The Wailing","Fang Lui",2,7.8f);
		Movie movie2=new Movie("Sita Raman","Hanu",2,8.6f);
		Movie movie3=new Movie("Pathan","Siddharth Anand",5,6);
		Movie movie4=new Movie("RRR","xyz",4,10);
	
		ArrayList<Movie> list= new ArrayList<Movie>();
		list.add(movie1);
		list.add(movie2);
		list.add(movie3);
		list.add(movie4);
		list.add(movie4);
//		System.out.println(list);
		
		ratingDuration(list);
		
	}
	public static void ratingDuration(List<Movie> m) {
		for(Movie list: m) {
			if(list.getDuration()>3 && list.getRating()>4.5) {
				System.out.println("Movie name is: " + list.getMovieName());
			}
		}
	}

}
