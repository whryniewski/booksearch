package pl.whr.booksearch.service.itbook;

import pl.whr.booksearch.model.Offer;
import pl.whr.booksearch.model.SearchMethod;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Currency;
import java.util.Locale;

public class BooksResponse {
    private String url;
    private String price;
    private String error;

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }



    public BooksResponse() { }

    public BooksResponse(String url, String price, String title, String error) {
        this.url = url;
        this.price = price;
        this.title = title;
        this.error = error;
    }


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    String title;

    public Offer asOffer(SearchMethod searchMethod) {
        try {
            Number parsedPrice = NumberFormat.getCurrencyInstance(Locale.US).parse(this.price);
            return new Offer(new BigDecimal(parsedPrice.toString()), Currency.getInstance("USD"), this.url, this.title, searchMethod);
        } catch (ParseException ex) {
            throw new RuntimeException("Couldn't parse what seems to be correct price: " + this.price);
        }

    }
}
