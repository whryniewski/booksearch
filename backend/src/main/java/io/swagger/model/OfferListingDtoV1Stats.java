package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OfferListingDtoV1Stats
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class OfferListingDtoV1Stats   {
  @JsonProperty("watchersCount")
  private Integer watchersCount = null;

  @JsonProperty("visitsCount")
  private Integer visitsCount = null;

  public OfferListingDtoV1Stats watchersCount(Integer watchersCount) {
    this.watchersCount = watchersCount;
    return this;
  }

  /**
   * Number of users that added this offer to watching offers list
   * @return watchersCount
  **/
  @ApiModelProperty(value = "Number of users that added this offer to watching offers list")

  public Integer getWatchersCount() {
    return watchersCount;
  }

  public void setWatchersCount(Integer watchersCount) {
    this.watchersCount = watchersCount;
  }

  public OfferListingDtoV1Stats visitsCount(Integer visitsCount) {
    this.visitsCount = visitsCount;
    return this;
  }

  /**
   * Number of users visits from past 30 days. Any number of offer shows during the same day by the same user is one visit.
   * @return visitsCount
  **/
  @ApiModelProperty(value = "Number of users visits from past 30 days. Any number of offer shows during the same day by the same user is one visit.")

  public Integer getVisitsCount() {
    return visitsCount;
  }

  public void setVisitsCount(Integer visitsCount) {
    this.visitsCount = visitsCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferListingDtoV1Stats offerListingDtoV1Stats = (OfferListingDtoV1Stats) o;
    return Objects.equals(this.watchersCount, offerListingDtoV1Stats.watchersCount) &&
        Objects.equals(this.visitsCount, offerListingDtoV1Stats.visitsCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(watchersCount, visitsCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferListingDtoV1Stats {\n");
    
    sb.append("    watchersCount: ").append(toIndentedString(watchersCount)).append("\n");
    sb.append("    visitsCount: ").append(toIndentedString(visitsCount)).append("\n");
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
