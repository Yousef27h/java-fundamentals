package inheritance;

import org.apache.commons.math3.analysis.function.Add;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Restaurant extends Review {

    private String name;
    private int price;
    private HashMap<String, List> reviews = new HashMap<>();
    private int restRating = 0;
    private int reviewNum = 0;

    public Restaurant(String name, int price) {
        super();
        if (price > 3 || price < 1) {
            throw new IllegalArgumentException("Price should in the range of [1-3].");
        }
        this.name = name;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public int getRating() {
        return restRating;
    }

    public int getPrice() {
        return price;
    }


    public void addReview(String body, String author, int ratingInput) {
        if (!reviews.containsKey(author)) {
            reviewNum++;
            restRating = (restRating + ratingInput) / reviewNum;
            Review revTest = new Review(body, author, ratingInput);
            List<Object> reviewArr = new ArrayList<Object>();
            reviewArr.add(name);
            reviewArr.add(price);
            reviewArr.add(body);
            reviewArr.add(ratingInput);
            reviews.put(revTest.getAuthor(), reviewArr);
        }
    }

    public HashMap<String, List> getReviews() {
        return reviews;
    }


}