package pl.whr.booksearch.service.allegro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

/**
 * Rate for every other item, after the first, in the same parcel for the given delivery method
 */
@ApiModel(description = "Rate for every other item, after the first, in the same parcel for the given delivery method")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class ShippingRatesSetRatesNextItemRate   {
  @JsonProperty("amount")
  private String amount = null;

  @JsonProperty("currency")
  private String currency = null;

  public ShippingRatesSetRatesNextItemRate amount(String amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Amount
   * @return amount
  **/
  @ApiModelProperty(value = "Amount")

  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public ShippingRatesSetRatesNextItemRate currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * ISO 4217 currency code
   * @return currency
  **/
  @ApiModelProperty(value = "ISO 4217 currency code")

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
    ShippingRatesSetRatesNextItemRate shippingRatesSetRatesNextItemRate = (ShippingRatesSetRatesNextItemRate) o;
    return Objects.equals(this.amount, shippingRatesSetRatesNextItemRate.amount) &&
        Objects.equals(this.currency, shippingRatesSetRatesNextItemRate.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShippingRatesSetRatesNextItemRate {\n");
    
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
