package pl.whr.booksearch.service.allegro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * Contains shipping rates to change
 */
@ApiModel(description = "Contains shipping rates to change")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class ModificationDelivery   {
  @JsonProperty("shippingRates")
  private ShippingRates shippingRates = null;

  public ModificationDelivery shippingRates(ShippingRates shippingRates) {
    this.shippingRates = shippingRates;
    return this;
  }

  /**
   * Get shippingRates
   * @return shippingRates
  **/
  @ApiModelProperty(value = "")

  @Valid
  public ShippingRates getShippingRates() {
    return shippingRates;
  }

  public void setShippingRates(ShippingRates shippingRates) {
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
    ModificationDelivery modificationDelivery = (ModificationDelivery) o;
    return Objects.equals(this.shippingRates, modificationDelivery.shippingRates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shippingRates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModificationDelivery {\n");
    
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
