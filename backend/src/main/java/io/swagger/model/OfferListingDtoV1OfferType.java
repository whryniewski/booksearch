package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets OfferListingDtoV1.OfferType
 */
public enum OfferListingDtoV1OfferType {
  BUY_NOW("BUY_NOW"),
    AUCTION("AUCTION"),
    ADVERTISEMENT("ADVERTISEMENT");

  private String value;

  OfferListingDtoV1OfferType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OfferListingDtoV1OfferType fromValue(String text) {
    for (OfferListingDtoV1OfferType b : OfferListingDtoV1OfferType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
