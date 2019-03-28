package pl.whr.booksearch.model;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.Objects;

public class Offer {
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Offer(BigDecimal amount, Currency currency, String url, String title, SearchMethod searchMethod) {
        this.price = amount;
        this.currency = currency;
        this.url = url;
        this.title = title;
        this.searchMethod = searchMethod;
    }

    @Override
    public String toString() {
        return "Offer{" +
                "price=" + price +
                ", currency=" + currency +
                ", url='" + url + '\'' +
                ", searchMethod='" + searchMethod + '\'' +
                ", title='" + title + '\'' +
                '}';
    }

    BigDecimal price;

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    Currency currency;
    String url;

    public SearchMethod getSearchMethod() {
        return searchMethod;
    }

    public void setSearchMethod(SearchMethod searchMethod) {
        this.searchMethod = searchMethod;
    }

    SearchMethod searchMethod;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    String title;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Offer offer = (Offer) o;
        return Objects.equals(price, offer.price) &&
                Objects.equals(currency, offer.currency) &&
                Objects.equals(url, offer.url) &&
                Objects.equals(title, offer.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, currency, url, title);
    }
}
