package pl.whr.booksearch.service.allegro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ShippingRatesSetRates
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class ShippingRatesSetRates   {
  @JsonProperty("deliveryMethod")
  private ShippingRatesSetRatesDeliveryMethod deliveryMethod = null;

  @JsonProperty("maxQuantityPerPackage")
  private Integer maxQuantityPerPackage = null;

  @JsonProperty("firstItemRate")
  private ShippingRatesSetRatesFirstItemRate firstItemRate = null;

  @JsonProperty("nextItemRate")
  private ShippingRatesSetRatesNextItemRate nextItemRate = null;

  @JsonProperty("shippingTime")
  private ShippingRatesSetRatesShippingTime shippingTime = null;

  public ShippingRatesSetRates deliveryMethod(ShippingRatesSetRatesDeliveryMethod deliveryMethod) {
    this.deliveryMethod = deliveryMethod;
    return this;
  }

  /**
   * Get deliveryMethod
   * @return deliveryMethod
  **/
  @ApiModelProperty(value = "")

  @Valid
  public ShippingRatesSetRatesDeliveryMethod getDeliveryMethod() {
    return deliveryMethod;
  }

  public void setDeliveryMethod(ShippingRatesSetRatesDeliveryMethod deliveryMethod) {
    this.deliveryMethod = deliveryMethod;
  }

  public ShippingRatesSetRates maxQuantityPerPackage(Integer maxQuantityPerPackage) {
    this.maxQuantityPerPackage = maxQuantityPerPackage;
    return this;
  }

  /**
   * Maximum quantity per package for the given delivery method. Minimum value is 1.
   * minimum: 1
   * @return maxQuantityPerPackage
  **/
  @ApiModelProperty(value = "Maximum quantity per package for the given delivery method. Minimum value is 1.")

@Min(1)  public Integer getMaxQuantityPerPackage() {
    return maxQuantityPerPackage;
  }

  public void setMaxQuantityPerPackage(Integer maxQuantityPerPackage) {
    this.maxQuantityPerPackage = maxQuantityPerPackage;
  }

  public ShippingRatesSetRates firstItemRate(ShippingRatesSetRatesFirstItemRate firstItemRate) {
    this.firstItemRate = firstItemRate;
    return this;
  }

  /**
   * Get firstItemRate
   * @return firstItemRate
  **/
  @ApiModelProperty(value = "")

  @Valid
  public ShippingRatesSetRatesFirstItemRate getFirstItemRate() {
    return firstItemRate;
  }

  public void setFirstItemRate(ShippingRatesSetRatesFirstItemRate firstItemRate) {
    this.firstItemRate = firstItemRate;
  }

  public ShippingRatesSetRates nextItemRate(ShippingRatesSetRatesNextItemRate nextItemRate) {
    this.nextItemRate = nextItemRate;
    return this;
  }

  /**
   * Get nextItemRate
   * @return nextItemRate
  **/
  @ApiModelProperty(value = "")

  @Valid
  public ShippingRatesSetRatesNextItemRate getNextItemRate() {
    return nextItemRate;
  }

  public void setNextItemRate(ShippingRatesSetRatesNextItemRate nextItemRate) {
    this.nextItemRate = nextItemRate;
  }

  public ShippingRatesSetRates shippingTime(ShippingRatesSetRatesShippingTime shippingTime) {
    this.shippingTime = shippingTime;
    return this;
  }

  /**
   * Get shippingTime
   * @return shippingTime
  **/
  @ApiModelProperty(value = "")

  @Valid
  public ShippingRatesSetRatesShippingTime getShippingTime() {
    return shippingTime;
  }

  public void setShippingTime(ShippingRatesSetRatesShippingTime shippingTime) {
    this.shippingTime = shippingTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShippingRatesSetRates shippingRatesSetRates = (ShippingRatesSetRates) o;
    return Objects.equals(this.deliveryMethod, shippingRatesSetRates.deliveryMethod) &&
        Objects.equals(this.maxQuantityPerPackage, shippingRatesSetRates.maxQuantityPerPackage) &&
        Objects.equals(this.firstItemRate, shippingRatesSetRates.firstItemRate) &&
        Objects.equals(this.nextItemRate, shippingRatesSetRates.nextItemRate) &&
        Objects.equals(this.shippingTime, shippingRatesSetRates.shippingTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliveryMethod, maxQuantityPerPackage, firstItemRate, nextItemRate, shippingTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShippingRatesSetRates {\n");
    
    sb.append("    deliveryMethod: ").append(toIndentedString(deliveryMethod)).append("\n");
    sb.append("    maxQuantityPerPackage: ").append(toIndentedString(maxQuantityPerPackage)).append("\n");
    sb.append("    firstItemRate: ").append(toIndentedString(firstItemRate)).append("\n");
    sb.append("    nextItemRate: ").append(toIndentedString(nextItemRate)).append("\n");
    sb.append("    shippingTime: ").append(toIndentedString(shippingTime)).append("\n");
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
