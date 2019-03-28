package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CheckoutFormDeliveryAddress
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class CheckoutFormDeliveryAddress   {
  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("street")
  private String street = null;

  @JsonProperty("city")
  private String city = null;

  @JsonProperty("zipCode")
  private String zipCode = null;

  @JsonProperty("countryCode")
  private String countryCode = null;

  @JsonProperty("companyName")
  private String companyName = null;

  @JsonProperty("phoneNumber")
  private String phoneNumber = null;

  public CheckoutFormDeliveryAddress firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Receiver's first name
   * @return firstName
  **/
  @ApiModelProperty(example = "Jan", required = true, value = "Receiver's first name")
  @NotNull

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public CheckoutFormDeliveryAddress lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Receiver's last name
   * @return lastName
  **/
  @ApiModelProperty(example = "Kowalski", required = true, value = "Receiver's last name")
  @NotNull

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public CheckoutFormDeliveryAddress street(String street) {
    this.street = street;
    return this;
  }

  /**
   * Street name
   * @return street
  **/
  @ApiModelProperty(example = "Grunwaldzka 182", required = true, value = "Street name")
  @NotNull

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public CheckoutFormDeliveryAddress city(String city) {
    this.city = city;
    return this;
  }

  /**
   * City name
   * @return city
  **/
  @ApiModelProperty(example = "Poznań", required = true, value = "City name")
  @NotNull

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public CheckoutFormDeliveryAddress zipCode(String zipCode) {
    this.zipCode = zipCode;
    return this;
  }

  /**
   * Postal code
   * @return zipCode
  **/
  @ApiModelProperty(example = "60-166", required = true, value = "Postal code")
  @NotNull

  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }

  public CheckoutFormDeliveryAddress countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * Country code
   * @return countryCode
  **/
  @ApiModelProperty(example = "PL", required = true, value = "Country code")
  @NotNull

  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public CheckoutFormDeliveryAddress companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

  /**
   * Company name
   * @return companyName
  **/
  @ApiModelProperty(example = "Allegro.pl sp. z o.o.", value = "Company name")

  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public CheckoutFormDeliveryAddress phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * Phone number
   * @return phoneNumber
  **/
  @ApiModelProperty(example = "+48999999999", value = "Phone number")

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckoutFormDeliveryAddress checkoutFormDeliveryAddress = (CheckoutFormDeliveryAddress) o;
    return Objects.equals(this.firstName, checkoutFormDeliveryAddress.firstName) &&
        Objects.equals(this.lastName, checkoutFormDeliveryAddress.lastName) &&
        Objects.equals(this.street, checkoutFormDeliveryAddress.street) &&
        Objects.equals(this.city, checkoutFormDeliveryAddress.city) &&
        Objects.equals(this.zipCode, checkoutFormDeliveryAddress.zipCode) &&
        Objects.equals(this.countryCode, checkoutFormDeliveryAddress.countryCode) &&
        Objects.equals(this.companyName, checkoutFormDeliveryAddress.companyName) &&
        Objects.equals(this.phoneNumber, checkoutFormDeliveryAddress.phoneNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, street, city, zipCode, countryCode, companyName, phoneNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckoutFormDeliveryAddress {\n");
    
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
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
