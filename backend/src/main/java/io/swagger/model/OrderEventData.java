package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.BuyerReference;
import io.swagger.model.CheckoutFormReference;
import io.swagger.model.OrderLineItem;
import io.swagger.model.SellerReference;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Order event data
 */
@ApiModel(description = "Order event data")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class OrderEventData   {
  @JsonProperty("seller")
  private SellerReference seller = null;

  @JsonProperty("buyer")
  private BuyerReference buyer = null;

  @JsonProperty("lineItems")
  @Valid
  private List<OrderLineItem> lineItems = new ArrayList<OrderLineItem>();

  @JsonProperty("checkoutForm")
  private CheckoutFormReference checkoutForm = null;

  public OrderEventData seller(SellerReference seller) {
    this.seller = seller;
    return this;
  }

  /**
   * Get seller
   * @return seller
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
  public SellerReference getSeller() {
    return seller;
  }

  public void setSeller(SellerReference seller) {
    this.seller = seller;
  }

  public OrderEventData buyer(BuyerReference buyer) {
    this.buyer = buyer;
    return this;
  }

  /**
   * Get buyer
   * @return buyer
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
  public BuyerReference getBuyer() {
    return buyer;
  }

  public void setBuyer(BuyerReference buyer) {
    this.buyer = buyer;
  }

  public OrderEventData lineItems(List<OrderLineItem> lineItems) {
    this.lineItems = lineItems;
    return this;
  }

  public OrderEventData addLineItemsItem(OrderLineItem lineItemsItem) {
    this.lineItems.add(lineItemsItem);
    return this;
  }

  /**
   * Get lineItems
   * @return lineItems
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull
  @Valid
  public List<OrderLineItem> getLineItems() {
    return lineItems;
  }

  public void setLineItems(List<OrderLineItem> lineItems) {
    this.lineItems = lineItems;
  }

  public OrderEventData checkoutForm(CheckoutFormReference checkoutForm) {
    this.checkoutForm = checkoutForm;
    return this;
  }

  /**
   * Get checkoutForm
   * @return checkoutForm
  **/
  @ApiModelProperty(value = "")

  @Valid
  public CheckoutFormReference getCheckoutForm() {
    return checkoutForm;
  }

  public void setCheckoutForm(CheckoutFormReference checkoutForm) {
    this.checkoutForm = checkoutForm;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderEventData orderEventData = (OrderEventData) o;
    return Objects.equals(this.seller, orderEventData.seller) &&
        Objects.equals(this.buyer, orderEventData.buyer) &&
        Objects.equals(this.lineItems, orderEventData.lineItems) &&
        Objects.equals(this.checkoutForm, orderEventData.checkoutForm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(seller, buyer, lineItems, checkoutForm);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderEventData {\n");
    
    sb.append("    seller: ").append(toIndentedString(seller)).append("\n");
    sb.append("    buyer: ").append(toIndentedString(buyer)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    checkoutForm: ").append(toIndentedString(checkoutForm)).append("\n");
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
