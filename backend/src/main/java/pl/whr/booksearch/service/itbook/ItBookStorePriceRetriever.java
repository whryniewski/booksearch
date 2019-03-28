package pl.whr.booksearch.service.itbook;

import pl.whr.booksearch.model.Book;
import pl.whr.booksearch.model.Offer;
import pl.whr.booksearch.model.SearchMethod;
import pl.whr.booksearch.model.SearchMethods;
import pl.whr.booksearch.service.ShopOffersRetriever;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

public class ItBookStorePriceRetriever implements ShopOffersRetriever {

    private static final Logger LOG = LoggerFactory.getLogger(ItBookStorePriceRetriever.class);

    final String API = "https://api.itbook.store/1.0";

    @Autowired
    @Qualifier("generic")
    RestTemplate restTemplate;

    @Override
    public List<Offer> findOffers(Book book) {
        LOG.info("Looking for ISBN: " + book.getIsbn());
        String queryString = makeQueryString(book);

        try {
            ResponseEntity<BooksResponse> result = restTemplate.getForEntity(queryString, BooksResponse.class);

            if (result.getStatusCode() == HttpStatus.OK) {
                LOG.info("Received from ItBook: " + result.toString());
                BooksResponse response = result.getBody();
                if (response.getError().equals("0")) {
                    return List.of(response.asOffer(SearchMethods.byIsbn));
                } else {
                    throw new Exception("Couldn't find book: " + book.getIsbn() + " " + response.getError());
                }
            } else {
                throw new Exception("Couldn't find book: " + book.getIsbn() + " status: " + result.getStatusCode());
            }
        } catch (Exception ex) {
            LOG.error("Count't find book: " + book.getIsbn() + ": " + ex.getMessage());
            return List.of();
        }
    }

    protected String makeQueryString(Book book) {
        final String resource = "/books/" + book.getIsbn();
        return UriComponentsBuilder.fromHttpUrl(API + resource)
                .toUriString();
    }
}



