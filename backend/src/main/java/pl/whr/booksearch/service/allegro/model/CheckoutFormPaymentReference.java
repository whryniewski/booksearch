package pl.whr.booksearch.service.allegro.model;

import java.time.OffsetDateTime;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CheckoutFormPaymentReference
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class CheckoutFormPaymentReference   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("type")
  private CheckoutFormPaymentType type = null;

  @JsonProperty("provider")
  private CheckoutFormPaymentProvider provider = null;

  @JsonProperty("finishedAt")
  private OffsetDateTime finishedAt = null;

  @JsonProperty("paidAmount")
  private Price paidAmount = null;

  public CheckoutFormPaymentReference id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Payment id
   * @return id
  **/
  @ApiModelProperty(example = "0f8f1d13-7e9e-11e8-9b00-c5b0dfb78ea6", required = true, value = "Payment id")
  @NotNull

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CheckoutFormPaymentReference type(CheckoutFormPaymentType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
  public CheckoutFormPaymentType getType() {
    return type;
  }

  public void setType(CheckoutFormPaymentType type) {
    this.type = type;
  }

  public CheckoutFormPaymentReference provider(CheckoutFormPaymentProvider provider) {
    this.provider = provider;
    return this;
  }

  /**
   * Get provider
   * @return provider
  **/
  @ApiModelProperty(value = "")

  @Valid
  public CheckoutFormPaymentProvider getProvider() {
    return provider;
  }

  public void setProvider(CheckoutFormPaymentProvider provider) {
    this.provider = provider;
  }

  public CheckoutFormPaymentReference finishedAt(OffsetDateTime finishedAt) {
    this.finishedAt = finishedAt;
    return this;
  }

  /**
   * Date when the event occurred
   * @return finishedAt
  **/
  @ApiModelProperty(value = "Date when the event occurred")

  @Valid
  public OffsetDateTime getFinishedAt() {
    return finishedAt;
  }

  public void setFinishedAt(OffsetDateTime finishedAt) {
    this.finishedAt = finishedAt;
  }

  public CheckoutFormPaymentReference paidAmount(Price paidAmount) {
    this.paidAmount = paidAmount;
    return this;
  }

  /**
   * Get paidAmount
   * @return paidAmount
  **/
  @ApiModelProperty(value = "")

  @Valid
  public Price getPaidAmount() {
    return paidAmount;
  }

  public void setPaidAmount(Price paidAmount) {
    this.paidAmount = paidAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckoutFormPaymentReference checkoutFormPaymentReference = (CheckoutFormPaymentReference) o;
    return Objects.equals(this.id, checkoutFormPaymentReference.id) &&
        Objects.equals(this.type, checkoutFormPaymentReference.type) &&
        Objects.equals(this.provider, checkoutFormPaymentReference.provider) &&
        Objects.equals(this.finishedAt, checkoutFormPaymentReference.finishedAt) &&
        Objects.equals(this.paidAmount, checkoutFormPaymentReference.paidAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, provider, finishedAt, paidAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckoutFormPaymentReference {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    finishedAt: ").append(toIndentedString(finishedAt)).append("\n");
    sb.append("    paidAmount: ").append(toIndentedString(paidAmount)).append("\n");
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
