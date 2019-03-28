package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.CheckoutFormAddWaybillCreated;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * null
 */
@ApiModel(description = "null")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class CheckoutFormOrderWaybillResponse   {
  @JsonProperty("shipments")
  @Valid
  private List<CheckoutFormAddWaybillCreated> shipments = null;

  public CheckoutFormOrderWaybillResponse shipments(List<CheckoutFormAddWaybillCreated> shipments) {
    this.shipments = shipments;
    return this;
  }

  public CheckoutFormOrderWaybillResponse addShipmentsItem(CheckoutFormAddWaybillCreated shipmentsItem) {
    if (this.shipments == null) {
      this.shipments = new ArrayList<CheckoutFormAddWaybillCreated>();
    }
    this.shipments.add(shipmentsItem);
    return this;
  }

  /**
   * List of parcel tracking numbers currently assigned to the order.
   * @return shipments
  **/
  @ApiModelProperty(value = "List of parcel tracking numbers currently assigned to the order.")
  @Valid
  public List<CheckoutFormAddWaybillCreated> getShipments() {
    return shipments;
  }

  public void setShipments(List<CheckoutFormAddWaybillCreated> shipments) {
    this.shipments = shipments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckoutFormOrderWaybillResponse checkoutFormOrderWaybillResponse = (CheckoutFormOrderWaybillResponse) o;
    return Objects.equals(this.shipments, checkoutFormOrderWaybillResponse.shipments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shipments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckoutFormOrderWaybillResponse {\n");
    
    sb.append("    shipments: ").append(toIndentedString(shipments)).append("\n");
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
