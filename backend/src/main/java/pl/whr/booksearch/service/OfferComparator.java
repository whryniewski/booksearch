package pl.whr.booksearch.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.whr.booksearch.model.Offer;

import java.util.Comparator;

@Service
public class OfferComparator implements Comparator<Offer> {

    @Autowired
    PriceNormalizer priceNormalizer;

    @Override
    public int compare(Offer o1, Offer o2) {
        if (o1.getSearchMethod() == (o2.getSearchMethod())) {
            return comparePrices(o1, o2);
        } else return o1.getSearchMethod().compareTo(o2.getSearchMethod());
    }

    private int comparePrices(Offer o1, Offer o2) {
        return priceNormalizer.normalizePrice(o1).compareTo(priceNormalizer.normalizePrice(o2));
    }

}
