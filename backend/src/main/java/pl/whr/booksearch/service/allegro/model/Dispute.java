package pl.whr.booksearch.service.allegro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Dispute
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class Dispute   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("subject")
  private Subject subject = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    CLOSED("CLOSED"),
    
    ONGOING("ONGOING"),
    
    UNRESOLVED("UNRESOLVED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("status")
  private StatusEnum status = null;

  @JsonProperty("buyer")
  private DisputeUser buyer = null;

  @JsonProperty("seller")
  private DisputeUser seller = null;

  @JsonProperty("checkoutForm")
  private DisputeCheckoutForm checkoutForm = null;

  @JsonProperty("message")
  private DisputeFirstMessage message = null;

  @JsonProperty("messagesCount")
  private Integer messagesCount = null;

  public Dispute id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Identifier of the dispute
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Identifier of the dispute")
  @NotNull

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Dispute subject(Subject subject) {
    this.subject = subject;
    return this;
  }

  /**
   * Get subject
   * @return subject
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
  public Subject getSubject() {
    return subject;
  }

  public void setSubject(Subject subject) {
    this.subject = subject;
  }

  public Dispute status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Dispute buyer(DisputeUser buyer) {
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
  public DisputeUser getBuyer() {
    return buyer;
  }

  public void setBuyer(DisputeUser buyer) {
    this.buyer = buyer;
  }

  public Dispute seller(DisputeUser seller) {
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
  public DisputeUser getSeller() {
    return seller;
  }

  public void setSeller(DisputeUser seller) {
    this.seller = seller;
  }

  public Dispute checkoutForm(DisputeCheckoutForm checkoutForm) {
    this.checkoutForm = checkoutForm;
    return this;
  }

  /**
   * Get checkoutForm
   * @return checkoutForm
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
  public DisputeCheckoutForm getCheckoutForm() {
    return checkoutForm;
  }

  public void setCheckoutForm(DisputeCheckoutForm checkoutForm) {
    this.checkoutForm = checkoutForm;
  }

  public Dispute message(DisputeFirstMessage message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
  public DisputeFirstMessage getMessage() {
    return message;
  }

  public void setMessage(DisputeFirstMessage message) {
    this.message = message;
  }

  public Dispute messagesCount(Integer messagesCount) {
    this.messagesCount = messagesCount;
    return this;
  }

  /**
   * Get messagesCount
   * @return messagesCount
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  public Integer getMessagesCount() {
    return messagesCount;
  }

  public void setMessagesCount(Integer messagesCount) {
    this.messagesCount = messagesCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dispute dispute = (Dispute) o;
    return Objects.equals(this.id, dispute.id) &&
        Objects.equals(this.subject, dispute.subject) &&
        Objects.equals(this.status, dispute.status) &&
        Objects.equals(this.buyer, dispute.buyer) &&
        Objects.equals(this.seller, dispute.seller) &&
        Objects.equals(this.checkoutForm, dispute.checkoutForm) &&
        Objects.equals(this.message, dispute.message) &&
        Objects.equals(this.messagesCount, dispute.messagesCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, subject, status, buyer, seller, checkoutForm, message, messagesCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dispute {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    buyer: ").append(toIndentedString(buyer)).append("\n");
    sb.append("    seller: ").append(toIndentedString(seller)).append("\n");
    sb.append("    checkoutForm: ").append(toIndentedString(checkoutForm)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    messagesCount: ").append(toIndentedString(messagesCount)).append("\n");
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
