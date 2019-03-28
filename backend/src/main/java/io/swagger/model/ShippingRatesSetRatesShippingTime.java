package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Custom shipping time for the given delivery method. If not set the default shipping time for the method is used.
 */
@ApiModel(description = "Custom shipping time for the given delivery method. If not set the default shipping time for the method is used.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class ShippingRatesSetRatesShippingTime   {
  @JsonProperty("from")
  private String from = null;

  @JsonProperty("to")
  private String to = null;

  public ShippingRatesSetRatesShippingTime from(String from) {
    this.from = from;
    return this;
  }

  /**
   * ISO 8601 duration format, e.g. P3D for 3 days
   * @return from
  **/
  @ApiModelProperty(value = "ISO 8601 duration format, e.g. P3D for 3 days")

  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public ShippingRatesSetRatesShippingTime to(String to) {
    this.to = to;
    return this;
  }

  /**
   * ISO 8601 duration format, e.g. P3D for 3 days
   * @return to
  **/
  @ApiModelProperty(value = "ISO 8601 duration format, e.g. P3D for 3 days")

  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShippingRatesSetRatesShippingTime shippingRatesSetRatesShippingTime = (ShippingRatesSetRatesShippingTime) o;
    return Objects.equals(this.from, shippingRatesSetRatesShippingTime.from) &&
        Objects.equals(this.to, shippingRatesSetRatesShippingTime.to);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, to);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShippingRatesSetRatesShippingTime {\n");
    
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
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
