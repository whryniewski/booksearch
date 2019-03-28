package io.swagger.model;

import java.time.OffsetDateTime;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Publication
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class Publication   {
  @JsonProperty("duration")
  private String duration = null;

  @JsonProperty("endingAt")
  private OffsetDateTime endingAt = null;

  @JsonProperty("startingAt")
  private OffsetDateTime startingAt = null;

  @JsonProperty("status")
  private String status = null;

  /**
   * The types of ended by can be as follows:</br> - `USER` - offer ended by user.</br> - `ADMIN` - offer ended by admin.</br> - `EXPIRATION` - offer ended due to available items had sold out or offer duration had expired (valid for offers with specified duration).</br> - `ERROR` - offer ended due to internal problem with offer publication. The publication command responded with success status, but further processing failed. 
   */
  public enum EndedByEnum {
    USER("USER"),
    
    ADMIN("ADMIN"),
    
    EXPIRATION("EXPIRATION"),
    
    ERROR("ERROR");

    private String value;

    EndedByEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static EndedByEnum fromValue(String text) {
      for (EndedByEnum b : EndedByEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("endedBy")
  private EndedByEnum endedBy = null;

  public Publication duration(String duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Publication duration, ISO 8601 duration format
   * @return duration
  **/
  @ApiModelProperty(example = "PDT12H30M5S", value = "Publication duration, ISO 8601 duration format")

  public String getDuration() {
    return duration;
  }

  public void setDuration(String duration) {
    this.duration = duration;
  }

  public Publication endingAt(OffsetDateTime endingAt) {
    this.endingAt = endingAt;
    return this;
  }

  /**
   * Publication ending date: Format (ISO 8601) - yyyy-MM-dd'T'HH:mm:ss.SSSZ. Cannot be modified
   * @return endingAt
  **/
  @ApiModelProperty(value = "Publication ending date: Format (ISO 8601) - yyyy-MM-dd'T'HH:mm:ss.SSSZ. Cannot be modified")

  @Valid
  public OffsetDateTime getEndingAt() {
    return endingAt;
  }

  public void setEndingAt(OffsetDateTime endingAt) {
    this.endingAt = endingAt;
  }

  public Publication startingAt(OffsetDateTime startingAt) {
    this.startingAt = startingAt;
    return this;
  }

  /**
   * Publication starting date: Format (ISO 8601) - yyyy-MM-dd'T'HH:mm:ss.SSSZ. Cannot be modified
   * @return startingAt
  **/
  @ApiModelProperty(value = "Publication starting date: Format (ISO 8601) - yyyy-MM-dd'T'HH:mm:ss.SSSZ. Cannot be modified")

  @Valid
  public OffsetDateTime getStartingAt() {
    return startingAt;
  }

  public void setStartingAt(OffsetDateTime startingAt) {
    this.startingAt = startingAt;
  }

  public Publication status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Publication status, one of: INACTIVE, ACTIVATING, ACTIVE, ENDED
   * @return status
  **/
  @ApiModelProperty(value = "Publication status, one of: INACTIVE, ACTIVATING, ACTIVE, ENDED")

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Publication endedBy(EndedByEnum endedBy) {
    this.endedBy = endedBy;
    return this;
  }

  /**
   * The types of ended by can be as follows:</br> - `USER` - offer ended by user.</br> - `ADMIN` - offer ended by admin.</br> - `EXPIRATION` - offer ended due to available items had sold out or offer duration had expired (valid for offers with specified duration).</br> - `ERROR` - offer ended due to internal problem with offer publication. The publication command responded with success status, but further processing failed. 
   * @return endedBy
  **/
  @ApiModelProperty(value = "The types of ended by can be as follows:</br> - `USER` - offer ended by user.</br> - `ADMIN` - offer ended by admin.</br> - `EXPIRATION` - offer ended due to available items had sold out or offer duration had expired (valid for offers with specified duration).</br> - `ERROR` - offer ended due to internal problem with offer publication. The publication command responded with success status, but further processing failed. ")

  public EndedByEnum getEndedBy() {
    return endedBy;
  }

  public void setEndedBy(EndedByEnum endedBy) {
    this.endedBy = endedBy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Publication publication = (Publication) o;
    return Objects.equals(this.duration, publication.duration) &&
        Objects.equals(this.endingAt, publication.endingAt) &&
        Objects.equals(this.startingAt, publication.startingAt) &&
        Objects.equals(this.status, publication.status) &&
        Objects.equals(this.endedBy, publication.endedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(duration, endingAt, startingAt, status, endedBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Publication {\n");
    
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    endingAt: ").append(toIndentedString(endingAt)).append("\n");
    sb.append("    startingAt: ").append(toIndentedString(startingAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    endedBy: ").append(toIndentedString(endedBy)).append("\n");
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
