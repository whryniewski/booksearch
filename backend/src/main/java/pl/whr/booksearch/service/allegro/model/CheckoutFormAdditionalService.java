package pl.whr.booksearch.service.allegro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * CheckoutFormAdditionalService
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class CheckoutFormAdditionalService   {
  @JsonProperty("definitionId")
  private String definitionId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("price")
  private Price price = null;

  @JsonProperty("quantity")
  private Integer quantity = null;

  public CheckoutFormAdditionalService definitionId(String definitionId) {
    this.definitionId = definitionId;
    return this;
  }

  /**
   * Additional service id
   * @return definitionId
  **/
  @ApiModelProperty(value = "Additional service id")

  public String getDefinitionId() {
    return definitionId;
  }

  public void setDefinitionId(String definitionId) {
    this.definitionId = definitionId;
  }

  public CheckoutFormAdditionalService name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Additional service name
   * @return name
  **/
  @ApiModelProperty(value = "Additional service name")

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CheckoutFormAdditionalService price(Price price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
  **/
  @ApiModelProperty(value = "")

  @Valid
  public Price getPrice() {
    return price;
  }

  public void setPrice(Price price) {
    this.price = price;
  }

  public CheckoutFormAdditionalService quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Quantity of an additional service
   * @return quantity
  **/
  @ApiModelProperty(example = "1", value = "Quantity of an additional service")

  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckoutFormAdditionalService checkoutFormAdditionalService = (CheckoutFormAdditionalService) o;
    return Objects.equals(this.definitionId, checkoutFormAdditionalService.definitionId) &&
        Objects.equals(this.name, checkoutFormAdditionalService.name) &&
        Objects.equals(this.price, checkoutFormAdditionalService.price) &&
        Objects.equals(this.quantity, checkoutFormAdditionalService.quantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(definitionId, name, price, quantity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckoutFormAdditionalService {\n");
    
    sb.append("    definitionId: ").append(toIndentedString(definitionId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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
