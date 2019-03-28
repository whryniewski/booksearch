package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.CheckoutFormBuyerReference;
import io.swagger.model.CheckoutFormDeliveryReference;
import io.swagger.model.CheckoutFormDiscount;
import io.swagger.model.CheckoutFormInvoiceInfo;
import io.swagger.model.CheckoutFormLineItem;
import io.swagger.model.CheckoutFormPaymentReference;
import io.swagger.model.CheckoutFormStatus;
import io.swagger.model.CheckoutFormSummary;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CheckoutForm
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class CheckoutForm   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("messageToSeller")
  private String messageToSeller = null;

  @JsonProperty("buyer")
  private CheckoutFormBuyerReference buyer = null;

  @JsonProperty("payment")
  private CheckoutFormPaymentReference payment = null;

  @JsonProperty("status")
  private CheckoutFormStatus status = null;

  @JsonProperty("delivery")
  private CheckoutFormDeliveryReference delivery = null;

  @JsonProperty("invoice")
  private CheckoutFormInvoiceInfo invoice = null;

  @JsonProperty("lineItems")
  @Valid
  private List<CheckoutFormLineItem> lineItems = new ArrayList<CheckoutFormLineItem>();

  @JsonProperty("surcharges")
  @Valid
  private List<CheckoutFormPaymentReference> surcharges = new ArrayList<CheckoutFormPaymentReference>();

  @JsonProperty("discounts")
  @Valid
  private List<CheckoutFormDiscount> discounts = new ArrayList<CheckoutFormDiscount>();

  @JsonProperty("summary")
  private CheckoutFormSummary summary = null;

  public CheckoutForm id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Checkout form id
   * @return id
  **/
  @ApiModelProperty(example = "29738e61-7f6a-11e8-ac45-09db60ede9d6", required = true, value = "Checkout form id")
  @NotNull

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CheckoutForm messageToSeller(String messageToSeller) {
    this.messageToSeller = messageToSeller;
    return this;
  }

  /**
   * Message from buyer to seller
   * @return messageToSeller
  **/
  @ApiModelProperty(example = "Please send me an item in red color", value = "Message from buyer to seller")

  public String getMessageToSeller() {
    return messageToSeller;
  }

  public void setMessageToSeller(String messageToSeller) {
    this.messageToSeller = messageToSeller;
  }

  public CheckoutForm buyer(CheckoutFormBuyerReference buyer) {
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
  public CheckoutFormBuyerReference getBuyer() {
    return buyer;
  }

  public void setBuyer(CheckoutFormBuyerReference buyer) {
    this.buyer = buyer;
  }

  public CheckoutForm payment(CheckoutFormPaymentReference payment) {
    this.payment = payment;
    return this;
  }

  /**
   * Get payment
   * @return payment
  **/
  @ApiModelProperty(value = "")

  @Valid
  public CheckoutFormPaymentReference getPayment() {
    return payment;
  }

  public void setPayment(CheckoutFormPaymentReference payment) {
    this.payment = payment;
  }

  public CheckoutForm status(CheckoutFormStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
  public CheckoutFormStatus getStatus() {
    return status;
  }

  public void setStatus(CheckoutFormStatus status) {
    this.status = status;
  }

  public CheckoutForm delivery(CheckoutFormDeliveryReference delivery) {
    this.delivery = delivery;
    return this;
  }

  /**
   * Get delivery
   * @return delivery
  **/
  @ApiModelProperty(value = "")

  @Valid
  public CheckoutFormDeliveryReference getDelivery() {
    return delivery;
  }

  public void setDelivery(CheckoutFormDeliveryReference delivery) {
    this.delivery = delivery;
  }

  public CheckoutForm invoice(CheckoutFormInvoiceInfo invoice) {
    this.invoice = invoice;
    return this;
  }

  /**
   * Get invoice
   * @return invoice
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
  public CheckoutFormInvoiceInfo getInvoice() {
    return invoice;
  }

  public void setInvoice(CheckoutFormInvoiceInfo invoice) {
    this.invoice = invoice;
  }

  public CheckoutForm lineItems(List<CheckoutFormLineItem> lineItems) {
    this.lineItems = lineItems;
    return this;
  }

  public CheckoutForm addLineItemsItem(CheckoutFormLineItem lineItemsItem) {
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
  public List<CheckoutFormLineItem> getLineItems() {
    return lineItems;
  }

  public void setLineItems(List<CheckoutFormLineItem> lineItems) {
    this.lineItems = lineItems;
  }

  public CheckoutForm surcharges(List<CheckoutFormPaymentReference> surcharges) {
    this.surcharges = surcharges;
    return this;
  }

  public CheckoutForm addSurchargesItem(CheckoutFormPaymentReference surchargesItem) {
    this.surcharges.add(surchargesItem);
    return this;
  }

  /**
   * Get surcharges
   * @return surcharges
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull
  @Valid
  public List<CheckoutFormPaymentReference> getSurcharges() {
    return surcharges;
  }

  public void setSurcharges(List<CheckoutFormPaymentReference> surcharges) {
    this.surcharges = surcharges;
  }

  public CheckoutForm discounts(List<CheckoutFormDiscount> discounts) {
    this.discounts = discounts;
    return this;
  }

  public CheckoutForm addDiscountsItem(CheckoutFormDiscount discountsItem) {
    this.discounts.add(discountsItem);
    return this;
  }

  /**
   * Get discounts
   * @return discounts
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull
  @Valid
  public List<CheckoutFormDiscount> getDiscounts() {
    return discounts;
  }

  public void setDiscounts(List<CheckoutFormDiscount> discounts) {
    this.discounts = discounts;
  }

  public CheckoutForm summary(CheckoutFormSummary summary) {
    this.summary = summary;
    return this;
  }

  /**
   * Get summary
   * @return summary
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
  public CheckoutFormSummary getSummary() {
    return summary;
  }

  public void setSummary(CheckoutFormSummary summary) {
    this.summary = summary;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckoutForm checkoutForm = (CheckoutForm) o;
    return Objects.equals(this.id, checkoutForm.id) &&
        Objects.equals(this.messageToSeller, checkoutForm.messageToSeller) &&
        Objects.equals(this.buyer, checkoutForm.buyer) &&
        Objects.equals(this.payment, checkoutForm.payment) &&
        Objects.equals(this.status, checkoutForm.status) &&
        Objects.equals(this.delivery, checkoutForm.delivery) &&
        Objects.equals(this.invoice, checkoutForm.invoice) &&
        Objects.equals(this.lineItems, checkoutForm.lineItems) &&
        Objects.equals(this.surcharges, checkoutForm.surcharges) &&
        Objects.equals(this.discounts, checkoutForm.discounts) &&
        Objects.equals(this.summary, checkoutForm.summary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, messageToSeller, buyer, payment, status, delivery, invoice, lineItems, surcharges, discounts, summary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckoutForm {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    messageToSeller: ").append(toIndentedString(messageToSeller)).append("\n");
    sb.append("    buyer: ").append(toIndentedString(buyer)).append("\n");
    sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    delivery: ").append(toIndentedString(delivery)).append("\n");
    sb.append("    invoice: ").append(toIndentedString(invoice)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    surcharges: ").append(toIndentedString(surcharges)).append("\n");
    sb.append("    discounts: ").append(toIndentedString(discounts)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
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
