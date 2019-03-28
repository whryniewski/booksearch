package pl.whr.booksearch.service.allegro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * InlineResponse200
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class InlineResponse200   {
  @JsonProperty("shippingRates")
  @Valid
  private List<InlineResponse200ShippingRates> shippingRates = null;

  public InlineResponse200 shippingRates(List<InlineResponse200ShippingRates> shippingRates) {
    this.shippingRates = shippingRates;
    return this;
  }

  public InlineResponse200 addShippingRatesItem(InlineResponse200ShippingRates shippingRatesItem) {
    if (this.shippingRates == null) {
      this.shippingRates = new ArrayList<InlineResponse200ShippingRates>();
    }
    this.shippingRates.add(shippingRatesItem);
    return this;
  }

  /**
   * Get shippingRates
   * @return shippingRates
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<InlineResponse200ShippingRates> getShippingRates() {
    return shippingRates;
  }

  public void setShippingRates(List<InlineResponse200ShippingRates> shippingRates) {
    this.shippingRates = shippingRates;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200 inlineResponse200 = (InlineResponse200) o;
    return Objects.equals(this.shippingRates, inlineResponse200.shippingRates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shippingRates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200 {\n");
    
    sb.append("    shippingRates: ").append(toIndentedString(shippingRates)).append("\n");
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
