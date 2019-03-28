package pl.whr.booksearch.service;

import pl.whr.booksearch.model.Book;
import pl.whr.booksearch.model.Offer;

import java.util.List;

public interface ShopOffersRetriever {
    List<Offer> findOffers(Book book);
}
