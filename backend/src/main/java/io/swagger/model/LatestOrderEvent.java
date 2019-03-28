package io.swagger.model;


import java.time.OffsetDateTime;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
//import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Basic information about the latest order event.
 */
@ApiModel(description = "Basic information about the latest order event.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class LatestOrderEvent   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("occurredAt")
  private OffsetDateTime occurredAt = null;

  public LatestOrderEvent id(String id) {
    this.id = id;
    return this;
  }

  /**
   * event id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "event id")
  @NotNull

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public LatestOrderEvent occurredAt(OffsetDateTime occurredAt) {
    this.occurredAt = occurredAt;
    return this;
  }

  /**
   * Date when the event occurred
   * @return occurredAt
  **/
  @ApiModelProperty(required = true, value = "Date when the event occurred")
  @NotNull

  @Valid
  public OffsetDateTime getOccurredAt() {
    return occurredAt;
  }

  public void setOccurredAt(OffsetDateTime occurredAt) {
    this.occurredAt = occurredAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LatestOrderEvent latestOrderEvent = (LatestOrderEvent) o;
    return Objects.equals(this.id, latestOrderEvent.id) &&
        Objects.equals(this.occurredAt, latestOrderEvent.occurredAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, occurredAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LatestOrderEvent {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    occurredAt: ").append(toIndentedString(occurredAt)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
