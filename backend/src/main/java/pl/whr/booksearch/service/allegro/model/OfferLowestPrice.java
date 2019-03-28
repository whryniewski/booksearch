package pl.whr.booksearch.service.allegro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * Lowest shipping cost. Lack of this entity means that the item has no shipping options (ie. advertisement or an item with electronic delivery only).
 */
@ApiModel(description = "Lowest shipping cost. Lack of this entity means that the item has no shipping options (ie. advertisement or an item with electronic delivery only).")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class OfferLowestPrice   {
  @JsonProperty("amount")
  private BigDecimal amount = null;

  @JsonProperty("currency")
  private String currency = null;

  public OfferLowestPrice amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Currency amount.
   * @return amount
  **/
  @ApiModelProperty(value = "Currency amount.")

  @Valid
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public OfferLowestPrice currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Currency code.
   * @return currency
  **/
  @ApiModelProperty(value = "Currency code.")

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferLowestPrice offerLowestPrice = (OfferLowestPrice) o;
    return Objects.equals(this.amount, offerLowestPrice.amount) &&
        Objects.equals(this.currency, offerLowestPrice.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferLowestPrice {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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
