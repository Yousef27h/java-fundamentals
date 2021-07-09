package inheritance;

public class Review implements ToString {
    private String body;
    private String author;
    private String ratingInput;


    public Review(String body, String author, int ratingInput) {
        if (ratingInput > 5 || ratingInput < 0) {
            throw new IllegalArgumentException("Rating should in the range of [0-5].");
        }
        this.body = body;
        this.author = author;
        this.ratingInput = "*".repeat(ratingInput);
    }

    public Review() {

    }

    public String getBody() {
        return body;
    }

    public String getAuthor() {
        return author;
    }

    public String getStarNum() {
        return ratingInput;
    }

    @Override
    public String toStringMethod() {
        return "Author's name is " + author + ", He review this place with (" + ratingInput + ") star rating, and he said \" " + body + " \"";
    }

}