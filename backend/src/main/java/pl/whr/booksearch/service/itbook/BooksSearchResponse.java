package pl.whr.booksearch.service.itbook;

import pl.whr.booksearch.service.BookRetriever;

import java.util.List;

public class BooksSearchResponse {
    private String error;
    private String total;
    private String page;
    private List<BooksResponse> books;

    public BooksSearchResponse() {}

    public BooksSearchResponse(String error, String total, String page, List<BooksResponse> books) {
        this.error = error;
        this.total = total;
        this.page = page;
        this.books = books;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public List<BooksResponse> getBooks() {
        return books;
    }

    public void setBooks(List<BooksResponse> books) {
        this.books = books;
    }
}
