package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Price;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OfferListingDtoV1SaleInfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class OfferListingDtoV1SaleInfo   {
  @JsonProperty("currentPrice")
  private Price currentPrice = null;

  @JsonProperty("biddersCount")
  private Integer biddersCount = null;

  public OfferListingDtoV1SaleInfo currentPrice(Price currentPrice) {
    this.currentPrice = currentPrice;
    return this;
  }

  /**
   * Get currentPrice
   * @return currentPrice
  **/
  @ApiModelProperty(value = "")

  @Valid
  public Price getCurrentPrice() {
    return currentPrice;
  }

  public void setCurrentPrice(Price currentPrice) {
    this.currentPrice = currentPrice;
  }

  public OfferListingDtoV1SaleInfo biddersCount(Integer biddersCount) {
    this.biddersCount = biddersCount;
    return this;
  }

  /**
   * Get biddersCount
   * @return biddersCount
  **/
  @ApiModelProperty(value = "")

  public Integer getBiddersCount() {
    return biddersCount;
  }

  public void setBiddersCount(Integer biddersCount) {
    this.biddersCount = biddersCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferListingDtoV1SaleInfo offerListingDtoV1SaleInfo = (OfferListingDtoV1SaleInfo) o;
    return Objects.equals(this.currentPrice, offerListingDtoV1SaleInfo.currentPrice) &&
        Objects.equals(this.biddersCount, offerListingDtoV1SaleInfo.biddersCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentPrice, biddersCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferListingDtoV1SaleInfo {\n");
    
    sb.append("    currentPrice: ").append(toIndentedString(currentPrice)).append("\n");
    sb.append("    biddersCount: ").append(toIndentedString(biddersCount)).append("\n");
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
