package io.swagger.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Command processing status
 */
public enum ProcessingStatus {
  QUEUEING("QUEUEING"),
    RUNNING("RUNNING"),
    VALIDATED_AND_RUNNING("VALIDATED_AND_RUNNING"),
    RUNNING_BUT_WITH_ERRORS("RUNNING_BUT_WITH_ERRORS"),
    SUCCESSFUL("SUCCESSFUL"),
    PARTIAL_SUCCESS("PARTIAL_SUCCESS"),
    ERROR("ERROR");

  private String value;

  ProcessingStatus(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ProcessingStatus fromValue(String text) {
    for (ProcessingStatus b : ProcessingStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
