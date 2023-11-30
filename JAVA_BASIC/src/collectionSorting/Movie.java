package collectionSorting;

public class Movie {
     
	private int mId;
    private String mName;
    private String director;
    private float duration;
    private float rating;
    private static int idgen=1001;
    public Movie()
    {
        mId=idgen++;//mId=1001 1002
    }
    public Movie(String mName, String director, float duration, float rating) {
        
       this();//no arg
        this.mName = mName;
        this.director = director;
        this.duration = duration;
        this.rating = rating;
    }
    public int getmId() {
        return mId;
    }
    public void setmId(int mId) {
        this.mId = mId;
    }
    public String getmName() {
        return mName;
    }
    public void setmName(String mName) {
        this.mName = mName;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public float getDuration() {
        return duration;
    }
    public void setDuration(float duration) {
        this.duration = duration;
    }
    public float getRating() {
        return rating;
    }
    public void setRating(float rating) {
        this.rating = rating;
    }
    @Override
    public String toString() {
        return "Movie [mId=" + mId + ", mName=" + mName + ", director=" + director + ", duration=" + duration
                + ", rating=" + rating + "]";
    }
    
}
