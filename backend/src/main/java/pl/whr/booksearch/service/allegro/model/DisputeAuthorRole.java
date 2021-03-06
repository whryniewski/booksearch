package pl.whr.booksearch.service.allegro.model;

import com.fasterxml.jackson.annotation.JsonValue;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets DisputeAuthorRole
 */
public enum DisputeAuthorRole {
  BUYER("BUYER"),
    ADMIN("ADMIN");

  private String value;

  DisputeAuthorRole(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static DisputeAuthorRole fromValue(String text) {
    for (DisputeAuthorRole b : DisputeAuthorRole.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
