package inheritance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Shop extends Review {
    private String shopName;
    private String shopDescription;
    private String shopPrice;
    private HashMap<String, List> reviews = new HashMap<>();
    private int shopRating = 0;
    private int reviewNum = 0;

    public Shop(String shopName, String shopDescription, int shopPrice) {
        super();

        this.shopName = shopName;
        this.shopDescription = shopDescription;
        this.shopPrice = "$".repeat(shopPrice);
    }


    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopDescription() {
        return shopDescription;
    }

    public void setShopDescription(String shopDescription) {
        this.shopDescription = shopDescription;
    }

    public String getShopPrice() {
        return shopPrice;
    }

    public void setShopPrice(String shopPrice) {
        this.shopPrice = shopPrice;
    }

    public int getShopRating() {
        return shopRating;
    }

    public HashMap<String, List> getReviews() {
        return reviews;
    }

    public void addReview(String body, String author, int ratingInput) {
        if (!reviews.containsKey(author)) {
            reviewNum++;
            shopRating = (shopRating + ratingInput) / reviewNum;
            Review revTest = new Review(body, author, ratingInput);
            List<Object> reviewArr = new ArrayList<Object>();
            reviewArr.add(shopName);
            reviewArr.add(shopPrice);
            reviewArr.add(body);
            reviewArr.add(ratingInput);
            reviews.put(revTest.getAuthor(), reviewArr);
        }
    }

}
