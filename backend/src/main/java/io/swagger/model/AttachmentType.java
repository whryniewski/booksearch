package io.swagger.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * offer attachment type
 */
public enum AttachmentType {
  MANUAL("MANUAL"),
    SPECIAL_OFFER_RULES("SPECIAL_OFFER_RULES"),
    COMPETITION_RULES("COMPETITION_RULES"),
    BOOK_EXCERPT("BOOK_EXCERPT"),
    USER_MANUAL("USER_MANUAL"),
    INSTALLATION_INSTRUCTIONS("INSTALLATION_INSTRUCTIONS"),
    GAME_INSTRUCTIONS("GAME_INSTRUCTIONS");

  private String value;

  AttachmentType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AttachmentType fromValue(String text) {
    for (AttachmentType b : AttachmentType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
