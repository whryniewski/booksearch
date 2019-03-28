package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.CheckoutFormDeliveryAddress;
import io.swagger.model.CheckoutFormDeliveryMethod;
import io.swagger.model.CheckoutFormDeliveryPickupPoint;
import io.swagger.model.Price;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CheckoutFormDeliveryReference
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class CheckoutFormDeliveryReference   {
  @JsonProperty("address")
  private CheckoutFormDeliveryAddress address = null;

  @JsonProperty("method")
  private CheckoutFormDeliveryMethod method = null;

  @JsonProperty("pickupPoint")
  private CheckoutFormDeliveryPickupPoint pickupPoint = null;

  @JsonProperty("cost")
  private Price cost = null;

  @JsonProperty("smart")
  private Boolean smart = null;

  public CheckoutFormDeliveryReference address(CheckoutFormDeliveryAddress address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")

  @Valid
  public CheckoutFormDeliveryAddress getAddress() {
    return address;
  }

  public void setAddress(CheckoutFormDeliveryAddress address) {
    this.address = address;
  }

  public CheckoutFormDeliveryReference method(CheckoutFormDeliveryMethod method) {
    this.method = method;
    return this;
  }

  /**
   * Get method
   * @return method
  **/
  @ApiModelProperty(value = "")

  @Valid
  public CheckoutFormDeliveryMethod getMethod() {
    return method;
  }

  public void setMethod(CheckoutFormDeliveryMethod method) {
    this.method = method;
  }

  public CheckoutFormDeliveryReference pickupPoint(CheckoutFormDeliveryPickupPoint pickupPoint) {
    this.pickupPoint = pickupPoint;
    return this;
  }

  /**
   * Get pickupPoint
   * @return pickupPoint
  **/
  @ApiModelProperty(value = "")

  @Valid
  public CheckoutFormDeliveryPickupPoint getPickupPoint() {
    return pickupPoint;
  }

  public void setPickupPoint(CheckoutFormDeliveryPickupPoint pickupPoint) {
    this.pickupPoint = pickupPoint;
  }

  public CheckoutFormDeliveryReference cost(Price cost) {
    this.cost = cost;
    return this;
  }

  /**
   * Get cost
   * @return cost
  **/
  @ApiModelProperty(value = "")

  @Valid
  public Price getCost() {
    return cost;
  }

  public void setCost(Price cost) {
    this.cost = cost;
  }

  public CheckoutFormDeliveryReference smart(Boolean smart) {
    this.smart = smart;
    return this;
  }

  /**
   * Buyer used a SMART option
   * @return smart
  **/
  @ApiModelProperty(example = "true", value = "Buyer used a SMART option")

  public Boolean isSmart() {
    return smart;
  }

  public void setSmart(Boolean smart) {
    this.smart = smart;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckoutFormDeliveryReference checkoutFormDeliveryReference = (CheckoutFormDeliveryReference) o;
    return Objects.equals(this.address, checkoutFormDeliveryReference.address) &&
        Objects.equals(this.method, checkoutFormDeliveryReference.method) &&
        Objects.equals(this.pickupPoint, checkoutFormDeliveryReference.pickupPoint) &&
        Objects.equals(this.cost, checkoutFormDeliveryReference.cost) &&
        Objects.equals(this.smart, checkoutFormDeliveryReference.smart);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, method, pickupPoint, cost, smart);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckoutFormDeliveryReference {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    pickupPoint: ").append(toIndentedString(pickupPoint)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    smart: ").append(toIndentedString(smart)).append("\n");
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
