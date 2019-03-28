package pl.whr.booksearch.service.allegro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * The way the offer price should be changed. One of three ways is possible: new price, increase/decrease price, percentage change and only one can be chosen at once.
 */
@ApiModel(description = "The way the offer price should be changed. One of three ways is possible: new price, increase/decrease price, percentage change and only one can be chosen at once.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class PriceModification   {
  /**
   * modification type
   */
  public enum TypeEnum {
    FIXED_PRICE("FIXED_PRICE"),
    
    INCREASE_PRICE("INCREASE_PRICE"),
    
    DECREASE_PRICE("DECREASE_PRICE"),
    
    INCREASE_PERCENTAGE("INCREASE_PERCENTAGE"),
    
    DECREASE_PERCENTAGE("DECREASE_PERCENTAGE");

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

  @JsonProperty("price")
  private PriceModificationFixedPrice price = null;

  @JsonProperty("value")
  private PriceModificationValueChange value = null;

  @JsonProperty("percentage")
  private String percentage = null;

  public PriceModification type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * modification type
   * @return type
  **/
  @ApiModelProperty(value = "modification type")

  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public PriceModification price(PriceModificationFixedPrice price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
  **/
  @ApiModelProperty(value = "")

  @Valid
  public PriceModificationFixedPrice getPrice() {
    return price;
  }

  public void setPrice(PriceModificationFixedPrice price) {
    this.price = price;
  }

  public PriceModification value(PriceModificationValueChange value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(value = "")

  @Valid
  public PriceModificationValueChange getValue() {
    return value;
  }

  public void setValue(PriceModificationValueChange value) {
    this.value = value;
  }

  public PriceModification percentage(String percentage) {
    this.percentage = percentage;
    return this;
  }

  /**
   * Percentage change of offer buy now price, related to types: INCREASE_PERCENTAGE, DECREASE_PERCENTAGE
   * @return percentage
  **/
  @ApiModelProperty(value = "Percentage change of offer buy now price, related to types: INCREASE_PERCENTAGE, DECREASE_PERCENTAGE")

  public String getPercentage() {
    return percentage;
  }

  public void setPercentage(String percentage) {
    this.percentage = percentage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriceModification priceModification = (PriceModification) o;
    return Objects.equals(this.type, priceModification.type) &&
        Objects.equals(this.price, priceModification.price) &&
        Objects.equals(this.value, priceModification.value) &&
        Objects.equals(this.percentage, priceModification.percentage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, price, value, percentage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceModification {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
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
