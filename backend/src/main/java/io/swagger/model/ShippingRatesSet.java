package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ShippingRatesSetRates;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ShippingRatesSet
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class ShippingRatesSet   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("rates")
  private ShippingRatesSetRates rates = null;

  @JsonProperty("lastModified")
  private String lastModified = null;

  public ShippingRatesSet id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Shipping rates set ID
   * @return id
  **/
  @ApiModelProperty(value = "Shipping rates set ID")

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ShippingRatesSet name(String name) {
    this.name = name;
    return this;
  }

  /**
   * User defined name of the shipping rates set
   * @return name
  **/
  @ApiModelProperty(value = "User defined name of the shipping rates set")

@Size(min=1,max=64)   public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ShippingRatesSet rates(ShippingRatesSetRates rates) {
    this.rates = rates;
    return this;
  }

  /**
   * Get rates
   * @return rates
  **/
  @ApiModelProperty(value = "")

  @Valid
  public ShippingRatesSetRates getRates() {
    return rates;
  }

  public void setRates(ShippingRatesSetRates rates) {
    this.rates = rates;
  }

  public ShippingRatesSet lastModified(String lastModified) {
    this.lastModified = lastModified;
    return this;
  }

  /**
   * Date and time of the last modification of the set in UTC ISO 8601 format
   * @return lastModified
  **/
  @ApiModelProperty(value = "Date and time of the last modification of the set in UTC ISO 8601 format")

  public String getLastModified() {
    return lastModified;
  }

  public void setLastModified(String lastModified) {
    this.lastModified = lastModified;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShippingRatesSet shippingRatesSet = (ShippingRatesSet) o;
    return Objects.equals(this.id, shippingRatesSet.id) &&
        Objects.equals(this.name, shippingRatesSet.name) &&
        Objects.equals(this.rates, shippingRatesSet.rates) &&
        Objects.equals(this.lastModified, shippingRatesSet.lastModified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, rates, lastModified);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShippingRatesSet {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rates: ").append(toIndentedString(rates)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
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
