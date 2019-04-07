package pl.whr.booksearch.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pl.whr.booksearch.model.Book;
import pl.whr.booksearch.model.Offer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookOfferSearcher {

    private static final Logger LOG = LoggerFactory.getLogger(BookOfferSearcher.class);

    @Autowired
    BookRetriever isbnRetriever;

    @Autowired
    ApplicationContext context;

    @Autowired
    OfferComparator offerComparator;

    private Collection<ShopOffersRetriever> findAllShopRetrievers() {
        return context.getBeansOfType(ShopOffersRetriever.class).values();
    }

    public List<Offer> findOffers(String title) {
        Collection<Book> books = isbnRetriever.findByTitle(title);
        LOG.info("Using " + findAllShopRetrievers());
        List<Offer> offers = books.stream().flatMap(book ->
                findAllShopRetrievers().stream().flatMap(retriever ->
                        retriever.findOffers(book).stream())).distinct().collect(Collectors.toList());
        
        offers.sort(offerComparator);
        return offers;
    }
}
