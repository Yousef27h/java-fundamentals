package inheritance;

public class Restaurant {
    private String name;
    private int rating;
    private int price;

    public Restaurant(String name, int rating, int price) {
        if (rating > 5 || rating < 0) {
            throw new IllegalArgumentException("Rating should in the range of [0-5].");
        }
        if (price > 3 || price < 1) {
            throw new IllegalArgumentException("Price should in the range of [1-3].");
        }
        this.name = name;
        this.rating = rating;
        this.price = price;
    }

    public Restaurant(String author, int starNum) {
        if (starNum > 5 || starNum < 0) {
            throw new IllegalArgumentException("Rating should in the range of [0-5].");
        }
        this.name = author;
        this.rating = starNum;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    public int getPrice() {
        return price;
    }

    public String toString(){
      return "This restaurant's name is "+name+", it has a "+rating+" star rating, and it's prices "+"$".repeat(price);
    }
    public void addReview(String body, String author, int starNum){
        Review newRev = new Review(body,author, starNum) ;
    }
}
