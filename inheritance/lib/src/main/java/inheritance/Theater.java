package inheritance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Theater extends Review {
    private String theaterName;
    private ArrayList<String> movies;
    private HashMap<String, List> reviews = new HashMap<>();
    private int theaterRating = 0;
    private int reviewNum = 0;

    public Theater(String theaterName, ArrayList<String> movies) {
        super();
        this.theaterName = theaterName;
        this.movies = movies;
    }


    public String getTheaterName() {
        return theaterName;
    }

    public ArrayList<String> getMovies() {
        return movies;
    }

    public HashMap<String, List> getReviews() {
        return reviews;
    }

    public int getTheaterRating() {
        return theaterRating;
    }
    public void addMovie(String movie){
        movies.add(movie);
    }
    public void removeMovie(String movie){
        movies.remove(movie);
    }
    public void addReview(String movieName, String author, int ratingInput) {
        if (!reviews.containsKey(author)) {
            reviewNum++;
            theaterRating = (theaterRating + ratingInput) / reviewNum;
            Review revTest = new Review(movieName, author, ratingInput);
            List<Object> reviewArr = new ArrayList<Object>();
            reviewArr.add(theaterName);
            reviewArr.add(movieName);
            reviewArr.add(ratingInput);
            reviews.put(revTest.getAuthor(), reviewArr);
        }
    }
}
