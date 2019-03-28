package io.swagger.model;

import java.time.OffsetDateTime;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.CheckoutFormAdditionalService;
import io.swagger.model.OfferReference;
import io.swagger.model.Price;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Order item
 */
@ApiModel(description = "Order item")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class CheckoutFormLineItem   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("offer")
  private OfferReference offer = null;

  @JsonProperty("quantity")
  private BigDecimal quantity = null;

  @JsonProperty("originalPrice")
  private Price originalPrice = null;

  @JsonProperty("price")
  private Price price = null;

  @JsonProperty("selectedAdditionalServices")
  @Valid
  private List<CheckoutFormAdditionalService> selectedAdditionalServices = null;

  @JsonProperty("boughtAt")
  private OffsetDateTime boughtAt = null;

  public CheckoutFormLineItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Line item identifier
   * @return id
  **/
  @ApiModelProperty(example = "62ae358b-8f65-4fc4-9c77-bedf604a2e2b", required = true, value = "Line item identifier")
  @NotNull

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CheckoutFormLineItem offer(OfferReference offer) {
    this.offer = offer;
    return this;
  }

  /**
   * Get offer
   * @return offer
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
  public OfferReference getOffer() {
    return offer;
  }

  public void setOffer(OfferReference offer) {
    this.offer = offer;
  }

  public CheckoutFormLineItem quantity(BigDecimal quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * quantity
   * @return quantity
  **/
  @ApiModelProperty(example = "1", required = true, value = "quantity")
  @NotNull

  @Valid
  public BigDecimal getQuantity() {
    return quantity;
  }

  public void setQuantity(BigDecimal quantity) {
    this.quantity = quantity;
  }

  public CheckoutFormLineItem originalPrice(Price originalPrice) {
    this.originalPrice = originalPrice;
    return this;
  }

  /**
   * Get originalPrice
   * @return originalPrice
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
  public Price getOriginalPrice() {
    return originalPrice;
  }

  public void setOriginalPrice(Price originalPrice) {
    this.originalPrice = originalPrice;
  }

  public CheckoutFormLineItem price(Price price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
  public Price getPrice() {
    return price;
  }

  public void setPrice(Price price) {
    this.price = price;
  }

  public CheckoutFormLineItem selectedAdditionalServices(List<CheckoutFormAdditionalService> selectedAdditionalServices) {
    this.selectedAdditionalServices = selectedAdditionalServices;
    return this;
  }

  public CheckoutFormLineItem addSelectedAdditionalServicesItem(CheckoutFormAdditionalService selectedAdditionalServicesItem) {
    if (this.selectedAdditionalServices == null) {
      this.selectedAdditionalServices = new ArrayList<CheckoutFormAdditionalService>();
    }
    this.selectedAdditionalServices.add(selectedAdditionalServicesItem);
    return this;
  }

  /**
   * Get selectedAdditionalServices
   * @return selectedAdditionalServices
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<CheckoutFormAdditionalService> getSelectedAdditionalServices() {
    return selectedAdditionalServices;
  }

  public void setSelectedAdditionalServices(List<CheckoutFormAdditionalService> selectedAdditionalServices) {
    this.selectedAdditionalServices = selectedAdditionalServices;
  }

  public CheckoutFormLineItem boughtAt(OffsetDateTime boughtAt) {
    this.boughtAt = boughtAt;
    return this;
  }

  /**
   * ISO date when offer was bought
   * @return boughtAt
  **/
  @ApiModelProperty(value = "ISO date when offer was bought")

  @Valid
  public OffsetDateTime getBoughtAt() {
    return boughtAt;
  }

  public void setBoughtAt(OffsetDateTime boughtAt) {
    this.boughtAt = boughtAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckoutFormLineItem checkoutFormLineItem = (CheckoutFormLineItem) o;
    return Objects.equals(this.id, checkoutFormLineItem.id) &&
        Objects.equals(this.offer, checkoutFormLineItem.offer) &&
        Objects.equals(this.quantity, checkoutFormLineItem.quantity) &&
        Objects.equals(this.originalPrice, checkoutFormLineItem.originalPrice) &&
        Objects.equals(this.price, checkoutFormLineItem.price) &&
        Objects.equals(this.selectedAdditionalServices, checkoutFormLineItem.selectedAdditionalServices);// &&
      //  Objects.equals(this.boughtAt, checkoutFormLineItem.boughtAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, offer, quantity, originalPrice, price, selectedAdditionalServices, boughtAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckoutFormLineItem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    offer: ").append(toIndentedString(offer)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    originalPrice: ").append(toIndentedString(originalPrice)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    selectedAdditionalServices: ").append(toIndentedString(selectedAdditionalServices)).append("\n");
    sb.append("    boughtAt: ").append(toIndentedString(boughtAt)).append("\n");
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
