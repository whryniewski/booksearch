package pl.whr.booksearch.service.allegro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

/**
 * OfferListingDtoV1Stock
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class OfferListingDtoV1Stock   {
  @JsonProperty("available")
  private Integer available = null;

  @JsonProperty("sold")
  private Integer sold = null;

  public OfferListingDtoV1Stock available(Integer available) {
    this.available = available;
    return this;
  }

  /**
   * Get available
   * @return available
  **/
  @ApiModelProperty(value = "")

  public Integer getAvailable() {
    return available;
  }

  public void setAvailable(Integer available) {
    this.available = available;
  }

  public OfferListingDtoV1Stock sold(Integer sold) {
    this.sold = sold;
    return this;
  }

  /**
   * Get sold
   * @return sold
  **/
  @ApiModelProperty(value = "")

  public Integer getSold() {
    return sold;
  }

  public void setSold(Integer sold) {
    this.sold = sold;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferListingDtoV1Stock offerListingDtoV1Stock = (OfferListingDtoV1Stock) o;
    return Objects.equals(this.available, offerListingDtoV1Stock.available) &&
        Objects.equals(this.sold, offerListingDtoV1Stock.sold);
  }

  @Override
  public int hashCode() {
    return Objects.hash(available, sold);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferListingDtoV1Stock {\n");
    
    sb.append("    available: ").append(toIndentedString(available)).append("\n");
    sb.append("    sold: ").append(toIndentedString(sold)).append("\n");
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
