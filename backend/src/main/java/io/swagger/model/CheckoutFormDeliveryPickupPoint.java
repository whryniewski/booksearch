package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.CheckoutFormDeliveryPickupPointAddress;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CheckoutFormDeliveryPickupPoint
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class CheckoutFormDeliveryPickupPoint   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("address")
  private CheckoutFormDeliveryPickupPointAddress address = null;

  public CheckoutFormDeliveryPickupPoint id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Delivery point id
   * @return id
  **/
  @ApiModelProperty(example = "POZ08A", value = "Delivery point id")

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CheckoutFormDeliveryPickupPoint name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Delivery point name
   * @return name
  **/
  @ApiModelProperty(example = "Paczkomat POZ08A", value = "Delivery point name")

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CheckoutFormDeliveryPickupPoint description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Delivery point description
   * @return description
  **/
  @ApiModelProperty(example = "Stacja paliw BP", value = "Delivery point description")

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CheckoutFormDeliveryPickupPoint address(CheckoutFormDeliveryPickupPointAddress address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")

  @Valid
  public CheckoutFormDeliveryPickupPointAddress getAddress() {
    return address;
  }

  public void setAddress(CheckoutFormDeliveryPickupPointAddress address) {
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
    CheckoutFormDeliveryPickupPoint checkoutFormDeliveryPickupPoint = (CheckoutFormDeliveryPickupPoint) o;
    return Objects.equals(this.id, checkoutFormDeliveryPickupPoint.id) &&
        Objects.equals(this.name, checkoutFormDeliveryPickupPoint.name) &&
        Objects.equals(this.description, checkoutFormDeliveryPickupPoint.description) &&
        Objects.equals(this.address, checkoutFormDeliveryPickupPoint.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckoutFormDeliveryPickupPoint {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
