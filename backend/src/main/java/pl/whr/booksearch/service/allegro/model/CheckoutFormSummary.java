package pl.whr.booksearch.service.allegro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CheckoutFormSummary
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class CheckoutFormSummary   {
  @JsonProperty("totalToPay")
  private Price totalToPay = null;

  public CheckoutFormSummary totalToPay(Price totalToPay) {
    this.totalToPay = totalToPay;
    return this;
  }

  /**
   * Get totalToPay
   * @return totalToPay
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
  public Price getTotalToPay() {
    return totalToPay;
  }

  public void setTotalToPay(Price totalToPay) {
    this.totalToPay = totalToPay;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckoutFormSummary checkoutFormSummary = (CheckoutFormSummary) o;
    return Objects.equals(this.totalToPay, checkoutFormSummary.totalToPay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalToPay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckoutFormSummary {\n");
    
    sb.append("    totalToPay: ").append(toIndentedString(totalToPay)).append("\n");
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
