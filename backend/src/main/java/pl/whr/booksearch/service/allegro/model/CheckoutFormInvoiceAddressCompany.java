package pl.whr.booksearch.service.allegro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * CheckoutFormInvoiceAddressCompany
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class CheckoutFormInvoiceAddressCompany   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("taxId")
  private String taxId = null;

  public CheckoutFormInvoiceAddressCompany name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of a company for which invoice should be issued
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of a company for which invoice should be issued")
  @NotNull

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CheckoutFormInvoiceAddressCompany taxId(String taxId) {
    this.taxId = taxId;
    return this;
  }

  /**
   * Tax id
   * @return taxId
  **/
  @ApiModelProperty(value = "Tax id")

  public String getTaxId() {
    return taxId;
  }

  public void setTaxId(String taxId) {
    this.taxId = taxId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckoutFormInvoiceAddressCompany checkoutFormInvoiceAddressCompany = (CheckoutFormInvoiceAddressCompany) o;
    return Objects.equals(this.name, checkoutFormInvoiceAddressCompany.name) &&
        Objects.equals(this.taxId, checkoutFormInvoiceAddressCompany.taxId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, taxId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckoutFormInvoiceAddressCompany {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    taxId: ").append(toIndentedString(taxId)).append("\n");
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
