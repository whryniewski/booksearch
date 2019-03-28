package io.swagger.model;

import java.time.OffsetDateTime;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.OfferListingDtoV1OfferStatus;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OfferListingDtoV1Publication
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class OfferListingDtoV1Publication   {
  @JsonProperty("status")
  private OfferListingDtoV1OfferStatus status = null;

  @JsonProperty("startingAt")
  private OffsetDateTime startingAt = null;

  @JsonProperty("startedAt")
  private OffsetDateTime startedAt = null;

  @JsonProperty("endingAt")
  private OffsetDateTime endingAt = null;

  @JsonProperty("endedAt")
  private OffsetDateTime endedAt = null;

  public OfferListingDtoV1Publication status(OfferListingDtoV1OfferStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OfferListingDtoV1OfferStatus getStatus() {
    return status;
  }

  public void setStatus(OfferListingDtoV1OfferStatus status) {
    this.status = status;
  }

  public OfferListingDtoV1Publication startingAt(OffsetDateTime startingAt) {
    this.startingAt = startingAt;
    return this;
  }

  /**
   * Get startingAt
   * @return startingAt
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OffsetDateTime getStartingAt() {
    return startingAt;
  }

  public void setStartingAt(OffsetDateTime startingAt) {
    this.startingAt = startingAt;
  }

  public OfferListingDtoV1Publication startedAt(OffsetDateTime startedAt) {
    this.startedAt = startedAt;
    return this;
  }

  /**
   * Get startedAt
   * @return startedAt
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OffsetDateTime getStartedAt() {
    return startedAt;
  }

  public void setStartedAt(OffsetDateTime startedAt) {
    this.startedAt = startedAt;
  }

  public OfferListingDtoV1Publication endingAt(OffsetDateTime endingAt) {
    this.endingAt = endingAt;
    return this;
  }

  /**
   * Get endingAt
   * @return endingAt
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OffsetDateTime getEndingAt() {
    return endingAt;
  }

  public void setEndingAt(OffsetDateTime endingAt) {
    this.endingAt = endingAt;
  }

  public OfferListingDtoV1Publication endedAt(OffsetDateTime endedAt) {
    this.endedAt = endedAt;
    return this;
  }

  /**
   * Get endedAt
   * @return endedAt
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OffsetDateTime getEndedAt() {
    return endedAt;
  }

  public void setEndedAt(OffsetDateTime endedAt) {
    this.endedAt = endedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferListingDtoV1Publication offerListingDtoV1Publication = (OfferListingDtoV1Publication) o;
    return Objects.equals(this.status, offerListingDtoV1Publication.status) &&
        Objects.equals(this.startingAt, offerListingDtoV1Publication.startingAt) &&
        Objects.equals(this.startedAt, offerListingDtoV1Publication.startedAt) &&
        Objects.equals(this.endingAt, offerListingDtoV1Publication.endingAt) &&
        Objects.equals(this.endedAt, offerListingDtoV1Publication.endedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, startingAt, startedAt, endingAt, endedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferListingDtoV1Publication {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    startingAt: ").append(toIndentedString(startingAt)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
    sb.append("    endingAt: ").append(toIndentedString(endingAt)).append("\n");
    sb.append("    endedAt: ").append(toIndentedString(endedAt)).append("\n");
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
