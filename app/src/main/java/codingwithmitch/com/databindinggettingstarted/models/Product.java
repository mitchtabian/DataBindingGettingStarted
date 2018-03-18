package codingwithmitch.com.databindinggettingstarted.models;

import android.os.Parcel;

import java.math.BigDecimal;


public class Product {

    private static final String TAG = "Product";

    private String title;
    private String description;
    private int image;
    private BigDecimal price;
    private BigDecimal sale_price;
    private int num_ratings;
    private BigDecimal rating;
    private int serial_number;


    public Product(String title, String description, int image, BigDecimal price, BigDecimal sale_price, int num_ratings, BigDecimal rating, int serial_number) {
        this.title = title;
        this.description = description;
        this.image = image;
        this.price = price;
        this.sale_price = sale_price;
        this.num_ratings = num_ratings;
        this.rating = rating;
        this.serial_number = serial_number;
    }

    public Product() {

    }

    protected Product(Parcel in) {
        title = in.readString();
        description = in.readString();
        image = in.readInt();
        num_ratings = in.readInt();
        serial_number = in.readInt();
    }


    public boolean hasSalePrice(){
        double salePrice = sale_price.doubleValue();
        if(salePrice > 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public String getNumberRatingsString(){
        return ("(" + getNum_ratings() + ")");
    }

    public static String getTAG() {
        return TAG;
    }

    public int getSerial_number() {
        return serial_number;
    }

    public void setSerial_number(int serial_number) {
        this.serial_number = serial_number;
    }

    public int getNum_ratings() {
        return num_ratings;
    }

    public void setNum_ratings(int num_ratings) {
        this.num_ratings = num_ratings;
    }

    public BigDecimal getRating() {
        return rating;
    }

    public void setRating(BigDecimal rating) {
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getSale_price() {
        return sale_price;
    }

    public void setSale_price(BigDecimal sale_price) {
        this.sale_price = sale_price;
    }



}
