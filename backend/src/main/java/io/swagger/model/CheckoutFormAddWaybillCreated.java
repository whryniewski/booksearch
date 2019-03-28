package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CheckoutFormAddWaybillCreated
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class CheckoutFormAddWaybillCreated   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("waybill")
  private String waybill = null;

  /**
   * Carrier identifier taken from the dictionary below. It’s highly recommended to use an identifier different from OTHER, because its parcel status may be updated automatically. Carrier identifier OTHER is reserved for cases when seller uses a custom carrier or not yet integrated with Allegro.
   */
  public enum CarrierIdEnum {
    UPS("UPS"),
    
    INPOST("INPOST"),
    
    DHL("DHL"),
    
    GLS("GLS"),
    
    RUCH("RUCH"),
    
    POCZTA_POLSKA("POCZTA_POLSKA"),
    
    POCZTEX("POCZTEX"),
    
    FEDEX("FEDEX"),
    
    DPD("DPD"),
    
    TNT_EXPRESS("TNT_EXPRESS"),
    
    DB_SCHENKER("DB_SCHENKER"),
    
    RABEN("RABEN"),
    
    GEIS("GEIS"),
    
    DTS("DTS"),
    
    PEKAES("PEKAES"),
    
    PATRON("PATRON"),
    
    X_PRESS_COURIERS("X_PRESS_COURIERS"),
    
    RHENUS_LOGISTICS("RHENUS_LOGISTICS"),
    
    OTHER("OTHER");

    private String value;

    CarrierIdEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CarrierIdEnum fromValue(String text) {
      for (CarrierIdEnum b : CarrierIdEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("carrierId")
  private CarrierIdEnum carrierId = null;

  @JsonProperty("carrierName")
  private String carrierName = null;

  @JsonProperty("lineItems")
  @Valid
  private List<Object> lineItems = null;

  @JsonProperty("createdAt")
  private String createdAt = null;

  public CheckoutFormAddWaybillCreated id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Identifier of a shipment.
   * @return id
  **/
  @ApiModelProperty(value = "Identifier of a shipment.")

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CheckoutFormAddWaybillCreated waybill(String waybill) {
    this.waybill = waybill;
    return this;
  }

  /**
   * Waybill number (parcel tracking number). Cannot be empty and must be no longer than 64 characters. It can contain any word character (equal to [a-zA-Z0-9_]) and special characters: parentheses and hyphen-minus.
   * @return waybill
  **/
  @ApiModelProperty(value = "Waybill number (parcel tracking number). Cannot be empty and must be no longer than 64 characters. It can contain any word character (equal to [a-zA-Z0-9_]) and special characters: parentheses and hyphen-minus.")

  public String getWaybill() {
    return waybill;
  }

  public void setWaybill(String waybill) {
    this.waybill = waybill;
  }

  public CheckoutFormAddWaybillCreated carrierId(CarrierIdEnum carrierId) {
    this.carrierId = carrierId;
    return this;
  }

  /**
   * Carrier identifier taken from the dictionary below. It’s highly recommended to use an identifier different from OTHER, because its parcel status may be updated automatically. Carrier identifier OTHER is reserved for cases when seller uses a custom carrier or not yet integrated with Allegro.
   * @return carrierId
  **/
  @ApiModelProperty(value = "Carrier identifier taken from the dictionary below. It’s highly recommended to use an identifier different from OTHER, because its parcel status may be updated automatically. Carrier identifier OTHER is reserved for cases when seller uses a custom carrier or not yet integrated with Allegro.")

  public CarrierIdEnum getCarrierId() {
    return carrierId;
  }

  public void setCarrierId(CarrierIdEnum carrierId) {
    this.carrierId = carrierId;
  }

  public CheckoutFormAddWaybillCreated carrierName(String carrierName) {
    this.carrierName = carrierName;
    return this;
  }

  /**
   * Carrier name to be provided only if carrierId is OTHER, otherwise it’s ignored. Must be no longer than 30 characters.
   * @return carrierName
  **/
  @ApiModelProperty(value = "Carrier name to be provided only if carrierId is OTHER, otherwise it’s ignored. Must be no longer than 30 characters.")

  public String getCarrierName() {
    return carrierName;
  }

  public void setCarrierName(String carrierName) {
    this.carrierName = carrierName;
  }

  public CheckoutFormAddWaybillCreated lineItems(List<Object> lineItems) {
    this.lineItems = lineItems;
    return this;
  }

  public CheckoutFormAddWaybillCreated addLineItemsItem(Object lineItemsItem) {
    if (this.lineItems == null) {
      this.lineItems = new ArrayList<Object>();
    }
    this.lineItems.add(lineItemsItem);
    return this;
  }

  /**
   * List of order line items. They must be from the order specified in the path parameter. List cannot be empty.
   * @return lineItems
  **/
  @ApiModelProperty(value = "List of order line items. They must be from the order specified in the path parameter. List cannot be empty.")

  public List<Object> getLineItems() {
    return lineItems;
  }

  public void setLineItems(List<Object> lineItems) {
    this.lineItems = lineItems;
  }

  public CheckoutFormAddWaybillCreated createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Date and time of the parcel tracking number registration in UTC (ISO8601 format).
   * @return createdAt
  **/
  @ApiModelProperty(value = "Date and time of the parcel tracking number registration in UTC (ISO8601 format).")

  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckoutFormAddWaybillCreated checkoutFormAddWaybillCreated = (CheckoutFormAddWaybillCreated) o;
    return Objects.equals(this.id, checkoutFormAddWaybillCreated.id) &&
        Objects.equals(this.waybill, checkoutFormAddWaybillCreated.waybill) &&
        Objects.equals(this.carrierId, checkoutFormAddWaybillCreated.carrierId) &&
        Objects.equals(this.carrierName, checkoutFormAddWaybillCreated.carrierName) &&
        Objects.equals(this.lineItems, checkoutFormAddWaybillCreated.lineItems) &&
        Objects.equals(this.createdAt, checkoutFormAddWaybillCreated.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, waybill, carrierId, carrierName, lineItems, createdAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckoutFormAddWaybillCreated {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    waybill: ").append(toIndentedString(waybill)).append("\n");
    sb.append("    carrierId: ").append(toIndentedString(carrierId)).append("\n");
    sb.append("    carrierName: ").append(toIndentedString(carrierName)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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
