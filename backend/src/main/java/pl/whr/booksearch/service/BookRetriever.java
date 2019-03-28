package pl.whr.booksearch.service;

import pl.whr.booksearch.model.Book;

import java.util.Collection;

public interface BookRetriever {
    Collection<Book> findByTitle(String title);
}
