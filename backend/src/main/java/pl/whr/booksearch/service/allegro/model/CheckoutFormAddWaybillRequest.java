package pl.whr.booksearch.service.allegro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CheckoutFormAddWaybillRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class CheckoutFormAddWaybillRequest   {
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
    
    DPD("DPD"),
    
    POCZTEX("POCZTEX"),
    
    FEDEX("FEDEX"),
    
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

  @JsonProperty("waybill")
  private String waybill = null;

  @JsonProperty("carrierName")
  private String carrierName = null;

  @JsonProperty("lineItems")
  @Valid
  private List<Object> lineItems = new ArrayList<Object>();

  public CheckoutFormAddWaybillRequest carrierId(CarrierIdEnum carrierId) {
    this.carrierId = carrierId;
    return this;
  }

  /**
   * Carrier identifier taken from the dictionary below. It’s highly recommended to use an identifier different from OTHER, because its parcel status may be updated automatically. Carrier identifier OTHER is reserved for cases when seller uses a custom carrier or not yet integrated with Allegro.
   * @return carrierId
  **/
  @ApiModelProperty(required = true, value = "Carrier identifier taken from the dictionary below. It’s highly recommended to use an identifier different from OTHER, because its parcel status may be updated automatically. Carrier identifier OTHER is reserved for cases when seller uses a custom carrier or not yet integrated with Allegro.")
  @NotNull

  public CarrierIdEnum getCarrierId() {
    return carrierId;
  }

  public void setCarrierId(CarrierIdEnum carrierId) {
    this.carrierId = carrierId;
  }

  public CheckoutFormAddWaybillRequest waybill(String waybill) {
    this.waybill = waybill;
    return this;
  }

  /**
   * Waybill number (parcel tracking number). Cannot be empty and must be no longer than 64 characters. It can contain any word character (equal to [a-zA-Z0-9_]) and special characters: parentheses and hyphen-minus.
   * @return waybill
  **/
  @ApiModelProperty(required = true, value = "Waybill number (parcel tracking number). Cannot be empty and must be no longer than 64 characters. It can contain any word character (equal to [a-zA-Z0-9_]) and special characters: parentheses and hyphen-minus.")
  @NotNull

@Size(max=64)   public String getWaybill() {
    return waybill;
  }

  public void setWaybill(String waybill) {
    this.waybill = waybill;
  }

  public CheckoutFormAddWaybillRequest carrierName(String carrierName) {
    this.carrierName = carrierName;
    return this;
  }

  /**
   * Carrier name to be provided only if carrierId is OTHER, otherwise it’s ignored. Must be no longer than 30 characters.
   * @return carrierName
  **/
  @ApiModelProperty(value = "Carrier name to be provided only if carrierId is OTHER, otherwise it’s ignored. Must be no longer than 30 characters.")

@Size(max=30)   public String getCarrierName() {
    return carrierName;
  }

  public void setCarrierName(String carrierName) {
    this.carrierName = carrierName;
  }

  public CheckoutFormAddWaybillRequest lineItems(List<Object> lineItems) {
    this.lineItems = lineItems;
    return this;
  }

  public CheckoutFormAddWaybillRequest addLineItemsItem(Object lineItemsItem) {
    this.lineItems.add(lineItemsItem);
    return this;
  }

  /**
   * List of order line items. They must be from the order specified in the path parameter. List cannot be empty.
   * @return lineItems
  **/
  @ApiModelProperty(required = true, value = "List of order line items. They must be from the order specified in the path parameter. List cannot be empty.")
  @NotNull

  public List<Object> getLineItems() {
    return lineItems;
  }

  public void setLineItems(List<Object> lineItems) {
    this.lineItems = lineItems;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckoutFormAddWaybillRequest checkoutFormAddWaybillRequest = (CheckoutFormAddWaybillRequest) o;
    return Objects.equals(this.carrierId, checkoutFormAddWaybillRequest.carrierId) &&
        Objects.equals(this.waybill, checkoutFormAddWaybillRequest.waybill) &&
        Objects.equals(this.carrierName, checkoutFormAddWaybillRequest.carrierName) &&
        Objects.equals(this.lineItems, checkoutFormAddWaybillRequest.lineItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(carrierId, waybill, carrierName, lineItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckoutFormAddWaybillRequest {\n");
    
    sb.append("    carrierId: ").append(toIndentedString(carrierId)).append("\n");
    sb.append("    waybill: ").append(toIndentedString(waybill)).append("\n");
    sb.append("    carrierName: ").append(toIndentedString(carrierName)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
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
