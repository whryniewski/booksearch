package io.swagger.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Payment type
 */
public enum CheckoutFormPaymentType {
  CASH_ON_DELIVERY("CASH_ON_DELIVERY"),
    WIRE_TRANSFER("WIRE_TRANSFER"),
    ONLINE("ONLINE");

  private String value;

  CheckoutFormPaymentType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static CheckoutFormPaymentType fromValue(String text) {
    for (CheckoutFormPaymentType b : CheckoutFormPaymentType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
