package pl.whr.booksearch.service.allegro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

/**
 * CheckoutFormDeliveryMethod
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class CheckoutFormDeliveryMethod   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  public CheckoutFormDeliveryMethod id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Delivery method id
   * @return id
  **/
  @ApiModelProperty(example = "1fa56f79-4b6a-4821-a6f2-ca9c16d5c925", value = "Delivery method id")

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CheckoutFormDeliveryMethod name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Delivery method name
   * @return name
  **/
  @ApiModelProperty(example = "Allegro Paczkomaty InPost", value = "Delivery method name")

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckoutFormDeliveryMethod checkoutFormDeliveryMethod = (CheckoutFormDeliveryMethod) o;
    return Objects.equals(this.id, checkoutFormDeliveryMethod.id) &&
        Objects.equals(this.name, checkoutFormDeliveryMethod.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckoutFormDeliveryMethod {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
