package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.MonetaryAmount;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Change price command&#x27;s input data
 */
@ApiModel(description = "Change price command's input data")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class ChangePriceInput   {
  @JsonProperty("buyNowPrice")
  private MonetaryAmount buyNowPrice = null;

  public ChangePriceInput buyNowPrice(MonetaryAmount buyNowPrice) {
    this.buyNowPrice = buyNowPrice;
    return this;
  }

  /**
   * Get buyNowPrice
   * @return buyNowPrice
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
  public MonetaryAmount getBuyNowPrice() {
    return buyNowPrice;
  }

  public void setBuyNowPrice(MonetaryAmount buyNowPrice) {
    this.buyNowPrice = buyNowPrice;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChangePriceInput changePriceInput = (ChangePriceInput) o;
    return Objects.equals(this.buyNowPrice, changePriceInput.buyNowPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buyNowPrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangePriceInput {\n");
    
    sb.append("    buyNowPrice: ").append(toIndentedString(buyNowPrice)).append("\n");
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
