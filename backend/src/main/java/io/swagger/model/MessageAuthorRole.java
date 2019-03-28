package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets MessageAuthorRole
 */
public enum MessageAuthorRole {
  BUYER("BUYER"),
    SELLER("SELLER"),
    ADMIN("ADMIN"),
    SYSTEM("SYSTEM");

  private String value;

  MessageAuthorRole(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static MessageAuthorRole fromValue(String text) {
    for (MessageAuthorRole b : MessageAuthorRole.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
