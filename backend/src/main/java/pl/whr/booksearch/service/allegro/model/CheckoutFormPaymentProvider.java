package pl.whr.booksearch.service.allegro.model;

import com.fasterxml.jackson.annotation.JsonValue;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Payment provider
 */
public enum CheckoutFormPaymentProvider {
  P24("P24"),
    PAYU("PAYU");

  private String value;

  CheckoutFormPaymentProvider(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static CheckoutFormPaymentProvider fromValue(String text) {
    for (CheckoutFormPaymentProvider b : CheckoutFormPaymentProvider.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
