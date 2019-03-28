package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CheckoutFormDiscount
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class CheckoutFormDiscount   {
  /**
   * Describes type of discount used in checkout form. The types of discounts can be as follows: * `COUPON` - coupon was used during payment * `BUNDLE` - some of the line items were bought as a bundle * `MULTIPACK` - at least one line item was bought with multipack option * `CROSSMULTIPACK` - some of line items each from different offers were bought together as multipack 
   */
  public enum TypeEnum {
    COUPON("COUPON"),
    
    BUNDLE("BUNDLE"),
    
    MULTIPACK("MULTIPACK"),
    
    CROSSMULTIPACK("CROSSMULTIPACK");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("type")
  private TypeEnum type = null;

  public CheckoutFormDiscount type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Describes type of discount used in checkout form. The types of discounts can be as follows: * `COUPON` - coupon was used during payment * `BUNDLE` - some of the line items were bought as a bundle * `MULTIPACK` - at least one line item was bought with multipack option * `CROSSMULTIPACK` - some of line items each from different offers were bought together as multipack 
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Describes type of discount used in checkout form. The types of discounts can be as follows: * `COUPON` - coupon was used during payment * `BUNDLE` - some of the line items were bought as a bundle * `MULTIPACK` - at least one line item was bought with multipack option * `CROSSMULTIPACK` - some of line items each from different offers were bought together as multipack ")
  @NotNull

  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckoutFormDiscount checkoutFormDiscount = (CheckoutFormDiscount) o;
    return Objects.equals(this.type, checkoutFormDiscount.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckoutFormDiscount {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
