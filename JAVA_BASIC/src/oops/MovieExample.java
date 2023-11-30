package oops;

public class MovieExample {
//	WAP to create Movie Example:
//	id
//	moviename
//	duration
//	rating
//	director
//	//no arg constructor
//	//para constructor
//	//getter setter
//	//toString 
//	//this keyword
//
//	Movie Main:
//	3 objects

	private int id,duration;
	private float rating;
	private String movieName, director;
	private static int idgen=1001;

	public MovieExample() {
		id=idgen++;
	}

	public MovieExample(String movieName, String director,int duration,float rating) {
		this();//invoking no arg constructor
		this.rating = rating;
		this.duration = duration;
		this.movieName = movieName;
		this.director = director;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String toString() {
		return "id=" + id + "\nmovieName=" + movieName
				+ "\ndirector=" + director + "\nduration=" + duration +"\nrating=" + rating;
	}

}