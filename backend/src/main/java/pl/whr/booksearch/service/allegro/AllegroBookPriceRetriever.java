package pl.whr.booksearch.service.allegro;


import pl.whr.booksearch.model.Book;
import pl.whr.booksearch.model.Offer;
import pl.whr.booksearch.model.SearchMethods;
import pl.whr.booksearch.service.ShopOffersRetriever;
import pl.whr.booksearch.service.allegro.model.ListingOffer;
import pl.whr.booksearch.service.allegro.model.ListingResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AllegroBookPriceRetriever implements ShopOffersRetriever {
    private static final Logger LOG = LoggerFactory.getLogger(AllegroBookPriceRetriever.class);

    @Autowired
    RestTemplate restTemplate;

    final String ALLEGRO_API_URL = "https://api.allegro.pl";

    public List<Offer> findOffers(Book book) {
        LOG.info("Looking for offers for book: " + book);
        String endpoint = "/offers/listing";
        String queryString = UriComponentsBuilder.fromHttpUrl(ALLEGRO_API_URL + endpoint)
                .queryParam("phrase", book.getIsbn())
                .queryParam("sort", "+price")
                .queryParam("sellingMode.format", "BUY_NOW")
                .queryParam("category.id", "7") // KSIĄŻKI I KOMIKSY
                .queryParam("include", "-filters")
                .queryParam("searchMode", "DESCRIPTIONS")
                .queryParam("limit", "20")
                .toUriString();
        LOG.info("Calling: " + queryString);
        try {
            ResponseEntity<ListingResponse> response = restTemplate.getForEntity(queryString, ListingResponse.class);
            ListingResponse listingResponse = response.getBody();
            LOG.info("RESPONSE: " + listingResponse);
            return listingResponse.getItems().getRegular().stream().map(this::listingOfferToOffer).collect(Collectors.toList());
        } catch (Exception ex) {
            LOG.error("Exception occured", ex);
            return List.of();
        }
    }

    private Offer listingOfferToOffer(ListingOffer listingOffer) {
        BigDecimal amount = listingOffer.getSellingMode().getPrice().getAmount();
        Currency currency = Currency.getInstance(listingOffer.getSellingMode().getPrice().getCurrency());
        return new Offer(amount, currency, allegroOfferIdToUrl(listingOffer.getId()), listingOffer.getName(), SearchMethods.byIsbn);
    }

    private String allegroOfferIdToUrl(String offerId) {
        return String.format("https://allegro.pl/oferta/%s", offerId);
    }
}
