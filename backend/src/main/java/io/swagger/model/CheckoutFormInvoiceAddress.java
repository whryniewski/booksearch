package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.CheckoutFormInvoiceAddressCompany;
import io.swagger.model.CheckoutFormInvoiceAddressNaturalPerson;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CheckoutFormInvoiceAddress
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class CheckoutFormInvoiceAddress   {
  @JsonProperty("street")
  private String street = null;

  @JsonProperty("city")
  private String city = null;

  @JsonProperty("zipCode")
  private String zipCode = null;

  @JsonProperty("countryCode")
  private String countryCode = null;

  @JsonProperty("company")
  private CheckoutFormInvoiceAddressCompany company = null;

  @JsonProperty("naturalPerson")
  private CheckoutFormInvoiceAddressNaturalPerson naturalPerson = null;

  public CheckoutFormInvoiceAddress street(String street) {
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

  public CheckoutFormInvoiceAddress city(String city) {
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

  public CheckoutFormInvoiceAddress zipCode(String zipCode) {
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

  public CheckoutFormInvoiceAddress countryCode(String countryCode) {
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

  public CheckoutFormInvoiceAddress company(CheckoutFormInvoiceAddressCompany company) {
    this.company = company;
    return this;
  }

  /**
   * Get company
   * @return company
  **/
  @ApiModelProperty(value = "")

  @Valid
  public CheckoutFormInvoiceAddressCompany getCompany() {
    return company;
  }

  public void setCompany(CheckoutFormInvoiceAddressCompany company) {
    this.company = company;
  }

  public CheckoutFormInvoiceAddress naturalPerson(CheckoutFormInvoiceAddressNaturalPerson naturalPerson) {
    this.naturalPerson = naturalPerson;
    return this;
  }

  /**
   * Get naturalPerson
   * @return naturalPerson
  **/
  @ApiModelProperty(value = "")

  @Valid
  public CheckoutFormInvoiceAddressNaturalPerson getNaturalPerson() {
    return naturalPerson;
  }

  public void setNaturalPerson(CheckoutFormInvoiceAddressNaturalPerson naturalPerson) {
    this.naturalPerson = naturalPerson;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckoutFormInvoiceAddress checkoutFormInvoiceAddress = (CheckoutFormInvoiceAddress) o;
    return Objects.equals(this.street, checkoutFormInvoiceAddress.street) &&
        Objects.equals(this.city, checkoutFormInvoiceAddress.city) &&
        Objects.equals(this.zipCode, checkoutFormInvoiceAddress.zipCode) &&
        Objects.equals(this.countryCode, checkoutFormInvoiceAddress.countryCode) &&
        Objects.equals(this.company, checkoutFormInvoiceAddress.company) &&
        Objects.equals(this.naturalPerson, checkoutFormInvoiceAddress.naturalPerson);
  }

  @Override
  public int hashCode() {
    return Objects.hash(street, city, zipCode, countryCode, company, naturalPerson);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckoutFormInvoiceAddress {\n");
    
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    naturalPerson: ").append(toIndentedString(naturalPerson)).append("\n");
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
