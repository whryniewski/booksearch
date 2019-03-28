package pl.whr.booksearch.service;

import org.springframework.stereotype.Service;
import pl.whr.booksearch.model.Offer;

import java.math.BigDecimal;
import java.math.BigInteger;

@Service
public class DumbPriceNormalizer implements PriceNormalizer {

    @Override
    public BigDecimal normalizePrice(Offer offer) {
        switch (offer.getCurrency().getCurrencyCode()) {
            case "USD": return offer.getPrice().multiply(BigDecimal.valueOf(4));
            case "PLN": return offer.getPrice().multiply(BigDecimal.valueOf(1.1));
            default: return offer.getPrice().multiply(BigDecimal.valueOf(1));
        }
    }
}
