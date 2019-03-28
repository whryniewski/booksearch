package pl.whr.booksearch.service.itbook;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriComponentsBuilder;
import pl.whr.booksearch.model.Book;
import pl.whr.booksearch.model.Offer;
import pl.whr.booksearch.model.SearchMethods;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ItBookStoreSearchRetriever extends ItBookStorePriceRetriever {

    private static final Logger LOG = LoggerFactory.getLogger(ItBookStoreSearchRetriever.class);

    @Override
    protected String makeQueryString(Book book) {
        final String resource = "/search/";
        return UriComponentsBuilder.fromHttpUrl(API + resource)
                .path(book.getTitle())
                .toUriString();
    }

    @Override
    public List<Offer> findOffers(Book book) {
        LOG.info("Looking for Book: " + book);
        String queryString = makeQueryString(book);
        LOG.info("Query string: " + queryString);

        try {
            ResponseEntity<BooksSearchResponse> result = restTemplate.getForEntity(queryString, BooksSearchResponse.class);

            if (result.getStatusCode() == HttpStatus.OK) {
                LOG.info("Received from ItBook: " + result.toString());
                BooksSearchResponse response = result.getBody();
                if (response.getError().equals("0")) {
                    return response.getBooks().stream()
                            .map(b -> b.asOffer(SearchMethods.byName))
                            .collect(Collectors.toList());
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
}
