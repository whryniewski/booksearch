package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.OfferLowestPrice;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Information about available shipping options for the item.
 */
@ApiModel(description = "Information about available shipping options for the item.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class OfferDelivery   {
  @JsonProperty("availableForFree")
  private Boolean availableForFree = null;

  @JsonProperty("lowestPrice")
  private OfferLowestPrice lowestPrice = null;

  public OfferDelivery availableForFree(Boolean availableForFree) {
    this.availableForFree = availableForFree;
    return this;
  }

  /**
   * Indicates whether the item has free shipping option.
   * @return availableForFree
  **/
  @ApiModelProperty(value = "Indicates whether the item has free shipping option.")

  public Boolean isAvailableForFree() {
    return availableForFree;
  }

  public void setAvailableForFree(Boolean availableForFree) {
    this.availableForFree = availableForFree;
  }

  public OfferDelivery lowestPrice(OfferLowestPrice lowestPrice) {
    this.lowestPrice = lowestPrice;
    return this;
  }

  /**
   * Get lowestPrice
   * @return lowestPrice
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OfferLowestPrice getLowestPrice() {
    return lowestPrice;
  }

  public void setLowestPrice(OfferLowestPrice lowestPrice) {
    this.lowestPrice = lowestPrice;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferDelivery offerDelivery = (OfferDelivery) o;
    return Objects.equals(this.availableForFree, offerDelivery.availableForFree) &&
        Objects.equals(this.lowestPrice, offerDelivery.lowestPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableForFree, lowestPrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferDelivery {\n");
    
    sb.append("    availableForFree: ").append(toIndentedString(availableForFree)).append("\n");
    sb.append("    lowestPrice: ").append(toIndentedString(lowestPrice)).append("\n");
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
