package pl.whr.booksearch.service.allegro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

/**
 * InlineResponse2001DeliveryMethods
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class InlineResponse2001DeliveryMethods   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  /**
   * Whether the payment is to be collected in advance or on delivery
   */
  public enum PaymentPolicyEnum {
    IN_ADVANCE("IN_ADVANCE"),
    
    CASH_ON_DELIVERY("CASH_ON_DELIVERY");

    private String value;

    PaymentPolicyEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PaymentPolicyEnum fromValue(String text) {
      for (PaymentPolicyEnum b : PaymentPolicyEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("paymentPolicy")
  private PaymentPolicyEnum paymentPolicy = null;

  public InlineResponse2001DeliveryMethods id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Delivery method ID
   * @return id
  **/
  @ApiModelProperty(value = "Delivery method ID")

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public InlineResponse2001DeliveryMethods name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Delivery method name
   * @return name
  **/
  @ApiModelProperty(value = "Delivery method name")

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public InlineResponse2001DeliveryMethods paymentPolicy(PaymentPolicyEnum paymentPolicy) {
    this.paymentPolicy = paymentPolicy;
    return this;
  }

  /**
   * Whether the payment is to be collected in advance or on delivery
   * @return paymentPolicy
  **/
  @ApiModelProperty(value = "Whether the payment is to be collected in advance or on delivery")

  public PaymentPolicyEnum getPaymentPolicy() {
    return paymentPolicy;
  }

  public void setPaymentPolicy(PaymentPolicyEnum paymentPolicy) {
    this.paymentPolicy = paymentPolicy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2001DeliveryMethods inlineResponse2001DeliveryMethods = (InlineResponse2001DeliveryMethods) o;
    return Objects.equals(this.id, inlineResponse2001DeliveryMethods.id) &&
        Objects.equals(this.name, inlineResponse2001DeliveryMethods.name) &&
        Objects.equals(this.paymentPolicy, inlineResponse2001DeliveryMethods.paymentPolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, paymentPolicy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2001DeliveryMethods {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    paymentPolicy: ").append(toIndentedString(paymentPolicy)).append("\n");
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
