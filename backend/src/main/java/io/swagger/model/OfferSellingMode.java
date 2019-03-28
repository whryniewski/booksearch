package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.OfferFixedPrice;
import io.swagger.model.OfferPrice;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * This section indicates selling format and prices.
 */
@ApiModel(description = "This section indicates selling format and prices.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class OfferSellingMode   {
  @JsonProperty("format")
  private String format = null;

  @JsonProperty("price")
  private OfferPrice price = null;

  @JsonProperty("fixedPrice")
  private OfferFixedPrice fixedPrice = null;

  @JsonProperty("popularity")
  private Integer popularity = null;

  @JsonProperty("bidCount")
  private Integer bidCount = null;

  public OfferSellingMode format(String format) {
    this.format = format;
    return this;
  }

  /**
   * *BUY_NOW*, *AUCTION* or *ADVERTISEMENT*
   * @return format
  **/
  @ApiModelProperty(value = "*BUY_NOW*, *AUCTION* or *ADVERTISEMENT*")

  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  public OfferSellingMode price(OfferPrice price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OfferPrice getPrice() {
    return price;
  }

  public void setPrice(OfferPrice price) {
    this.price = price;
  }

  public OfferSellingMode fixedPrice(OfferFixedPrice fixedPrice) {
    this.fixedPrice = fixedPrice;
    return this;
  }

  /**
   * Get fixedPrice
   * @return fixedPrice
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OfferFixedPrice getFixedPrice() {
    return fixedPrice;
  }

  public void setFixedPrice(OfferFixedPrice fixedPrice) {
    this.fixedPrice = fixedPrice;
  }

  public OfferSellingMode popularity(Integer popularity) {
    this.popularity = popularity;
    return this;
  }

  /**
   * Popularity of item for *BUY_NOW* selling format.
   * @return popularity
  **/
  @ApiModelProperty(value = "Popularity of item for *BUY_NOW* selling format.")

  public Integer getPopularity() {
    return popularity;
  }

  public void setPopularity(Integer popularity) {
    this.popularity = popularity;
  }

  public OfferSellingMode bidCount(Integer bidCount) {
    this.bidCount = bidCount;
    return this;
  }

  /**
   * Number of bidders for *AUCTION* selling format.
   * @return bidCount
  **/
  @ApiModelProperty(value = "Number of bidders for *AUCTION* selling format.")

  public Integer getBidCount() {
    return bidCount;
  }

  public void setBidCount(Integer bidCount) {
    this.bidCount = bidCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferSellingMode offerSellingMode = (OfferSellingMode) o;
    return Objects.equals(this.format, offerSellingMode.format) &&
        Objects.equals(this.price, offerSellingMode.price) &&
        Objects.equals(this.fixedPrice, offerSellingMode.fixedPrice) &&
        Objects.equals(this.popularity, offerSellingMode.popularity) &&
        Objects.equals(this.bidCount, offerSellingMode.bidCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(format, price, fixedPrice, popularity, bidCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferSellingMode {\n");
    
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    fixedPrice: ").append(toIndentedString(fixedPrice)).append("\n");
    sb.append("    popularity: ").append(toIndentedString(popularity)).append("\n");
    sb.append("    bidCount: ").append(toIndentedString(bidCount)).append("\n");
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
