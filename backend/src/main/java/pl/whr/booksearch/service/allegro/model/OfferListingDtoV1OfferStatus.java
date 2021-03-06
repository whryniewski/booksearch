package pl.whr.booksearch.service.allegro.model;

import com.fasterxml.jackson.annotation.JsonValue;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets OfferListingDtoV1.OfferStatus
 */
public enum OfferListingDtoV1OfferStatus {
  INACTIVE("INACTIVE"),
    ACTIVATING("ACTIVATING"),
    ACTIVE("ACTIVE"),
    ENDED("ENDED");

  private String value;

  OfferListingDtoV1OfferStatus(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OfferListingDtoV1OfferStatus fromValue(String text) {
    for (OfferListingDtoV1OfferStatus b : OfferListingDtoV1OfferStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
