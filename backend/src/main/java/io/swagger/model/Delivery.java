package io.swagger.model;

import java.time.OffsetDateTime;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.JustId;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Delivery
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class Delivery   {
  @JsonProperty("additionalInfo")
  private String additionalInfo = null;

  @JsonProperty("handlingTime")
  private String handlingTime = null;

  @JsonProperty("shipmentDate")
  private OffsetDateTime shipmentDate = null;

  @JsonProperty("shippingRates")
  private JustId shippingRates = null;

  public Delivery additionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  /**
   * Get additionalInfo
   * @return additionalInfo
  **/
  @ApiModelProperty(value = "")

@Size(max=650)   public String getAdditionalInfo() {
    return additionalInfo;
  }

  public void setAdditionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
  }

  public Delivery handlingTime(String handlingTime) {
    this.handlingTime = handlingTime;
    return this;
  }

  /**
   * Handling time, ISO 8601 duration format
   * @return handlingTime
  **/
  @ApiModelProperty(example = "PDT12H30M5S", value = "Handling time, ISO 8601 duration format")

  public String getHandlingTime() {
    return handlingTime;
  }

  public void setHandlingTime(String handlingTime) {
    this.handlingTime = handlingTime;
  }

  public Delivery shipmentDate(OffsetDateTime shipmentDate) {
    this.shipmentDate = shipmentDate;
    return this;
  }

  /**
   * Shipment date, Format (ISO 8601) - yyyy-MM-dd'T'HH:mm:ss.SSSZ
   * @return shipmentDate
  **/
  @ApiModelProperty(value = "Shipment date, Format (ISO 8601) - yyyy-MM-dd'T'HH:mm:ss.SSSZ")

  @Valid
  public OffsetDateTime getShipmentDate() {
    return shipmentDate;
  }

  public void setShipmentDate(OffsetDateTime shipmentDate) {
    this.shipmentDate = shipmentDate;
  }

  public Delivery shippingRates(JustId shippingRates) {
    this.shippingRates = shippingRates;
    return this;
  }

  /**
   * Get shippingRates
   * @return shippingRates
  **/
  @ApiModelProperty(value = "")

  @Valid
  public JustId getShippingRates() {
    return shippingRates;
  }

  public void setShippingRates(JustId shippingRates) {
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
    Delivery delivery = (Delivery) o;
    return Objects.equals(this.additionalInfo, delivery.additionalInfo) &&
        Objects.equals(this.handlingTime, delivery.handlingTime) &&
        Objects.equals(this.shipmentDate, delivery.shipmentDate) &&
        Objects.equals(this.shippingRates, delivery.shippingRates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalInfo, handlingTime, shipmentDate, shippingRates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Delivery {\n");
    
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    handlingTime: ").append(toIndentedString(handlingTime)).append("\n");
    sb.append("    shipmentDate: ").append(toIndentedString(shipmentDate)).append("\n");
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
