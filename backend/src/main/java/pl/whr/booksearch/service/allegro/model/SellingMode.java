package pl.whr.booksearch.service.allegro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * Offer&#x27;s selling mode
 */
@ApiModel(description = "Offer's selling mode")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class SellingMode   {
  @JsonProperty("format")
  private String format = null;

  @JsonProperty("minimalPrice")
  private Price minimalPrice = null;

  @JsonProperty("price")
  private Price price = null;

  @JsonProperty("startingPrice")
  private Price startingPrice = null;

  public SellingMode format(String format) {
    this.format = format;
    return this;
  }

  /**
   * Selling mode format, one of: BUY_NOW, AUCTION, ADVERTISEMENT
   * @return format
  **/
  @ApiModelProperty(value = "Selling mode format, one of: BUY_NOW, AUCTION, ADVERTISEMENT")

  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  public SellingMode minimalPrice(Price minimalPrice) {
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

  public SellingMode price(Price price) {
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

  public SellingMode startingPrice(Price startingPrice) {
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
    SellingMode sellingMode = (SellingMode) o;
    return Objects.equals(this.format, sellingMode.format) &&
        Objects.equals(this.minimalPrice, sellingMode.minimalPrice) &&
        Objects.equals(this.price, sellingMode.price) &&
        Objects.equals(this.startingPrice, sellingMode.startingPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(format, minimalPrice, price, startingPrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SellingMode {\n");
    
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    minimalPrice: ").append(toIndentedString(minimalPrice)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
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
