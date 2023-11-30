package oops;

public class MovieMain {

	public static void main(String[] args) {

		MovieExample movie1=new MovieExample("The Wailing","Fang Lui",2,7.8f);
		MovieExample movie2=new MovieExample();
		MovieExample movie3=new MovieExample("Pathan","Siddharth Anand",3,9);
		MovieExample movie4=new MovieExample("RRR","xyz",3,10);
		
		movie2.setId(102);
		movie2.setMovieName("Jab we met");
        movie2.setDirector("Anurag kashyap");
        
        System.out.println(movie1);
        System.out.println("---------------------------------------");
        System.out.println("movie id=" + movie2.getId() + "\nmovie name=" + movie2.getMovieName() + "\ndirector=" + movie2.getDirector());
        System.out.println("---------------------------------------");
        System.out.println(movie3);
        System.out.println("---------------------------------------");
        System.out.println(movie4);
	}

}
