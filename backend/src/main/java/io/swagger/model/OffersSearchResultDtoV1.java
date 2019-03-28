package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.OfferListingDtoV1;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OffersSearchResultDtoV1
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class OffersSearchResultDtoV1   {
  @JsonProperty("offers")
  @Valid
  private List<OfferListingDtoV1> offers = null;

  @JsonProperty("count")
  private Integer count = null;

  @JsonProperty("totalCount")
  private Integer totalCount = null;

  public OffersSearchResultDtoV1 offers(List<OfferListingDtoV1> offers) {
    this.offers = offers;
    return this;
  }

  public OffersSearchResultDtoV1 addOffersItem(OfferListingDtoV1 offersItem) {
    if (this.offers == null) {
      this.offers = new ArrayList<OfferListingDtoV1>();
    }
    this.offers.add(offersItem);
    return this;
  }

  /**
   * Get offers
   * @return offers
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<OfferListingDtoV1> getOffers() {
    return offers;
  }

  public void setOffers(List<OfferListingDtoV1> offers) {
    this.offers = offers;
  }

  public OffersSearchResultDtoV1 count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Number of offers in search result for given parameters
   * @return count
  **/
  @ApiModelProperty(value = "Number of offers in search result for given parameters")

  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public OffersSearchResultDtoV1 totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

  /**
   * Total number of offers for given parameters
   * @return totalCount
  **/
  @ApiModelProperty(value = "Total number of offers for given parameters")

  public Integer getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OffersSearchResultDtoV1 offersSearchResultDtoV1 = (OffersSearchResultDtoV1) o;
    return Objects.equals(this.offers, offersSearchResultDtoV1.offers) &&
        Objects.equals(this.count, offersSearchResultDtoV1.count) &&
        Objects.equals(this.totalCount, offersSearchResultDtoV1.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offers, count, totalCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OffersSearchResultDtoV1 {\n");
    
    sb.append("    offers: ").append(toIndentedString(offers)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
