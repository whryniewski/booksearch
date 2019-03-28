package pl.whr.booksearch.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import pl.whr.booksearch.model.Offer;
import pl.whr.booksearch.model.SearchMethods;

import java.math.BigDecimal;
import java.util.Currency;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class OfferComparatorTest {

    @Mock
    PriceNormalizer priceNormalizer;

    @InjectMocks
    OfferComparator offerComparator;

    @Test
    public void whenSearchMethodAreTheSame_priceNormalizerShouldBeUsed() {
        Offer o1 = new Offer(BigDecimal.valueOf(5), Currency.getInstance("USD"), "", "", SearchMethods.byIsbn);
        Offer o2 = new Offer(BigDecimal.valueOf(5), Currency.getInstance("PLN"), "", "", SearchMethods.byIsbn);

        when(priceNormalizer.normalizePrice(o1)).thenReturn(BigDecimal.valueOf(10));
        when(priceNormalizer.normalizePrice(o2)).thenReturn(BigDecimal.valueOf(5));

        int result = offerComparator.compare(o1, o2);

        verify(priceNormalizer).normalizePrice(o1);
        verify(priceNormalizer).normalizePrice(o2);
        assertEquals(1, result);
    }


    @Test
    public void whenSearchMethodDiffer_useSearchMethodPriority() {
        Offer o1 = new Offer(BigDecimal.valueOf(5), Currency.getInstance("USD"), "", "", SearchMethods.byIsbn);
        Offer o2 = new Offer(BigDecimal.valueOf(5), Currency.getInstance("PLN"), "", "", SearchMethods.byName);

        int result = offerComparator.compare(o1, o2);

        verify(priceNormalizer, never()).normalizePrice(any());
        assertEquals(-1, result);
    }
}