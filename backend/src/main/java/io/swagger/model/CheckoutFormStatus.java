package io.swagger.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Describes status of the form delivery and purchase options based on payment and purchase status. * `BOUGHT` - purchase without checkout form filled in * `FILLED_IN` - checkout form filled in but payment is not completed yet so data could still change * `READY_FOR_PROCESSING` - payment completed. Purchase is ready for processing. 
 */
public enum CheckoutFormStatus {
  BOUGHT("BOUGHT"),
    FILLED_IN("FILLED_IN"),
    READY_FOR_PROCESSING("READY_FOR_PROCESSING");

  private String value;

  CheckoutFormStatus(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static CheckoutFormStatus fromValue(String text) {
    for (CheckoutFormStatus b : CheckoutFormStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
