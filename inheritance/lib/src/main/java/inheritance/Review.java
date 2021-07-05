package inheritance;

public class Review extends Restaurant{
    private String body;
    private String author;
    private int starNum;

    public Review(String body, String author, int starNum) {
        super(author, starNum);
        if (starNum > 5 || starNum < 0) {
            throw new IllegalArgumentException("Rating should in the range of [0-5].");
        }
        this.body = body;
        this.author = author;
        this.starNum = starNum;
    }

    public String getBody() {
        return body;
    }

    public String getAuthor() {
        return author;
    }

    public int getStarNum() {
        return starNum;
    }

    public String toString(){
        return "Author's name is "+ author +", He has reviewed this restaurant with  "+starNum+ " star rating, and he said \" " +body+" \"";
    }
}
