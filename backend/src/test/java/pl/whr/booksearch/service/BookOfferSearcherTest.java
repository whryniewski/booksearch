package pl.whr.booksearch.service;

import org.hamcrest.CoreMatchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Incubating;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.context.ApplicationContext;
import pl.whr.booksearch.model.Book;
import pl.whr.booksearch.model.Offer;
import pl.whr.booksearch.model.SearchMethod;
import pl.whr.booksearch.model.SearchMethods;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.List;
import java.util.Map;

import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.*;


import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class BookOfferSearcherTest {

    @Mock
    ApplicationContext context;

    @Mock
    BookRetriever bookRetriever;

    @Mock
    OfferComparator offerComparator;

    @Mock
    ShopOffersRetriever shopOffersRetriever;

    @InjectMocks
    BookOfferSearcher bookOfferSearcher;

    @Test
    public void findOffers_whenBookIsAvailable_shouldBeFound() {
        String title = "some title";
        Book book = new Book("title", "isbn");
        Offer offer = new Offer(BigDecimal.valueOf(10), Currency.getInstance("USD"), "custom title", "url", SearchMethods.byName);

        when(bookRetriever.findByTitle(title)).thenReturn(List.of(book));
        when(shopOffersRetriever.findOffers(book)).thenReturn(List.of(offer));
        when(context.getBeansOfType(ShopOffersRetriever.class)).thenReturn(Map.of("shopOffersRetriever", shopOffersRetriever));

        List<Offer> result = bookOfferSearcher.findOffers(title);

        assertThat(result, CoreMatchers.hasItem(offer));
    }

    @Test
    public void findOffers_whenSameBookHappensTwice_onlyOneShouldBeReturned() {
        String title = "some title";
        Book book = new Book("title", "isbn");
        Offer offer = new Offer(BigDecimal.valueOf(10), Currency.getInstance("USD"), "custom title", "url", SearchMethods.byName);
        Offer anotherOffer = new Offer(BigDecimal.valueOf(10), Currency.getInstance("USD"), "custom title", "url", SearchMethods.byName);

        when(bookRetriever.findByTitle(title)).thenReturn(List.of(book));
        when(shopOffersRetriever.findOffers(book)).thenReturn(List.of(offer, anotherOffer));
        when(context.getBeansOfType(ShopOffersRetriever.class)).thenReturn(Map.of("shopOffersRetriever", shopOffersRetriever));

        List<Offer> result = bookOfferSearcher.findOffers(title);

        assertThat(result, hasSize(1));
    }
}