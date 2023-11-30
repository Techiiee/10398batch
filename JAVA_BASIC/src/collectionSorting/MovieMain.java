package collectionSorting;
import java.util.HashSet;
import java.util.TreeSet;

public class MovieMain {

    public static void main(String[] args) {
        Movie m1=new Movie("bahubali","raj",3.4f,4.3f);
        Movie m2=new Movie("Leo","logesh",3.3f,4.4f);
        Movie m3=new Movie("Santhramugi","vasu",3.3f,4.2f);
    
        HashSet<Movie> set=new HashSet<Movie>();
        set.add(m3);
        set.add(m2);
        set.add(m1);
        for(Movie m:set)
        {
            System.out.println(m);
        }
       System.out.println("=============sorting");
       RatingSort r=new RatingSort();
       
       TreeSet<Movie> set1=new TreeSet<Movie>(r);
       set1.add(m3);
        set1.add(m2);
        set1.add(m1);
        for(Movie m:set1)
        {
            System.out.println(m);
        }

	}

}
