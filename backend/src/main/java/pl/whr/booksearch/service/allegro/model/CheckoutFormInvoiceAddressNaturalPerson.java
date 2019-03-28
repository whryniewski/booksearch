package pl.whr.booksearch.service.allegro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * CheckoutFormInvoiceAddressNaturalPerson
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class CheckoutFormInvoiceAddressNaturalPerson   {
  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("lastName")
  private String lastName = null;

  public CheckoutFormInvoiceAddressNaturalPerson firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Invoice receiver first name
   * @return firstName
  **/
  @ApiModelProperty(example = "Jan", required = true, value = "Invoice receiver first name")
  @NotNull

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public CheckoutFormInvoiceAddressNaturalPerson lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Invoice receiver last name
   * @return lastName
  **/
  @ApiModelProperty(example = "Kowalski", required = true, value = "Invoice receiver last name")
  @NotNull

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckoutFormInvoiceAddressNaturalPerson checkoutFormInvoiceAddressNaturalPerson = (CheckoutFormInvoiceAddressNaturalPerson) o;
    return Objects.equals(this.firstName, checkoutFormInvoiceAddressNaturalPerson.firstName) &&
        Objects.equals(this.lastName, checkoutFormInvoiceAddressNaturalPerson.lastName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckoutFormInvoiceAddressNaturalPerson {\n");
    
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
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
