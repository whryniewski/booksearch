package pl.whr.booksearch.service.allegro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * OfferListingDtoV1SellingMode
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class OfferListingDtoV1SellingMode   {
  @JsonProperty("format")
  private OfferListingDtoV1OfferType format = null;

  @JsonProperty("price")
  private Price price = null;

  @JsonProperty("minimalPrice")
  private Price minimalPrice = null;

  @JsonProperty("startingPrice")
  private Price startingPrice = null;

  public OfferListingDtoV1SellingMode format(OfferListingDtoV1OfferType format) {
    this.format = format;
    return this;
  }

  /**
   * Get format
   * @return format
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OfferListingDtoV1OfferType getFormat() {
    return format;
  }

  public void setFormat(OfferListingDtoV1OfferType format) {
    this.format = format;
  }

  public OfferListingDtoV1SellingMode price(Price price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
  **/
  @ApiModelProperty(value = "")

  @Valid
  public Price getPrice() {
    return price;
  }

  public void setPrice(Price price) {
    this.price = price;
  }

  public OfferListingDtoV1SellingMode minimalPrice(Price minimalPrice) {
    this.minimalPrice = minimalPrice;
    return this;
  }

  /**
   * Get minimalPrice
   * @return minimalPrice
  **/
  @ApiModelProperty(value = "")

  @Valid
  public Price getMinimalPrice() {
    return minimalPrice;
  }

  public void setMinimalPrice(Price minimalPrice) {
    this.minimalPrice = minimalPrice;
  }

  public OfferListingDtoV1SellingMode startingPrice(Price startingPrice) {
    this.startingPrice = startingPrice;
    return this;
  }

  /**
   * Get startingPrice
   * @return startingPrice
  **/
  @ApiModelProperty(value = "")

  @Valid
  public Price getStartingPrice() {
    return startingPrice;
  }

  public void setStartingPrice(Price startingPrice) {
    this.startingPrice = startingPrice;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferListingDtoV1SellingMode offerListingDtoV1SellingMode = (OfferListingDtoV1SellingMode) o;
    return Objects.equals(this.format, offerListingDtoV1SellingMode.format) &&
        Objects.equals(this.price, offerListingDtoV1SellingMode.price) &&
        Objects.equals(this.minimalPrice, offerListingDtoV1SellingMode.minimalPrice) &&
        Objects.equals(this.startingPrice, offerListingDtoV1SellingMode.startingPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(format, price, minimalPrice, startingPrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferListingDtoV1SellingMode {\n");
    
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    minimalPrice: ").append(toIndentedString(minimalPrice)).append("\n");
    sb.append("    startingPrice: ").append(toIndentedString(startingPrice)).append("\n");
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
