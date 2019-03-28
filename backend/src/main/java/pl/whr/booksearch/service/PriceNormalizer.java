package pl.whr.booksearch.service;

import pl.whr.booksearch.model.Offer;

import java.math.BigDecimal;

public interface PriceNormalizer {
    BigDecimal normalizePrice(Offer offer);
}
