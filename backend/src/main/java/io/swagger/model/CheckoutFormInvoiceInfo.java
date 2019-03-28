package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.CheckoutFormInvoiceAddress;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CheckoutFormInvoiceInfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class CheckoutFormInvoiceInfo   {
  @JsonProperty("required")
  private Boolean required = null;

  @JsonProperty("address")
  private CheckoutFormInvoiceAddress address = null;

  public CheckoutFormInvoiceInfo required(Boolean required) {
    this.required = required;
    return this;
  }

  /**
   * Is invoice required by buyer?
   * @return required
  **/
  @ApiModelProperty(example = "true", required = true, value = "Is invoice required by buyer?")
  @NotNull

  public Boolean isRequired() {
    return required;
  }

  public void setRequired(Boolean required) {
    this.required = required;
  }

  public CheckoutFormInvoiceInfo address(CheckoutFormInvoiceAddress address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")

  @Valid
  public CheckoutFormInvoiceAddress getAddress() {
    return address;
  }

  public void setAddress(CheckoutFormInvoiceAddress address) {
    this.address = address;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckoutFormInvoiceInfo checkoutFormInvoiceInfo = (CheckoutFormInvoiceInfo) o;
    return Objects.equals(this.required, checkoutFormInvoiceInfo.required) &&
        Objects.equals(this.address, checkoutFormInvoiceInfo.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(required, address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckoutFormInvoiceInfo {\n");
    
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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
