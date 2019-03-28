package pl.whr.booksearch.service.allegro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

/**
 * CheckoutFormDeliveryPickupPointAddress
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class CheckoutFormDeliveryPickupPointAddress   {
  @JsonProperty("street")
  private String street = null;

  @JsonProperty("zipCode")
  private String zipCode = null;

  @JsonProperty("city")
  private String city = null;

  public CheckoutFormDeliveryPickupPointAddress street(String street) {
    this.street = street;
    return this;
  }

  /**
   * Delivery point street name
   * @return street
  **/
  @ApiModelProperty(example = "Grunwaldzka 108", value = "Delivery point street name")

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public CheckoutFormDeliveryPickupPointAddress zipCode(String zipCode) {
    this.zipCode = zipCode;
    return this;
  }

  /**
   * Delivery point postal code
   * @return zipCode
  **/
  @ApiModelProperty(example = "60-166", value = "Delivery point postal code")

  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }

  public CheckoutFormDeliveryPickupPointAddress city(String city) {
    this.city = city;
    return this;
  }

  /**
   * City name
   * @return city
  **/
  @ApiModelProperty(example = "Poznań", value = "City name")

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckoutFormDeliveryPickupPointAddress checkoutFormDeliveryPickupPointAddress = (CheckoutFormDeliveryPickupPointAddress) o;
    return Objects.equals(this.street, checkoutFormDeliveryPickupPointAddress.street) &&
        Objects.equals(this.zipCode, checkoutFormDeliveryPickupPointAddress.zipCode) &&
        Objects.equals(this.city, checkoutFormDeliveryPickupPointAddress.city);
  }

  @Override
  public int hashCode() {
    return Objects.hash(street, zipCode, city);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckoutFormDeliveryPickupPointAddress {\n");
    
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
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
