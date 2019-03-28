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
 * Payments
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class Payments   {
  @JsonProperty("invoice")
  private String invoice = null;

  public Payments invoice(String invoice) {
    this.invoice = invoice;
    return this;
  }

  /**
   * Invoice type, one of: VAT, VAT_MARGIN, WITHOUT_VAT, NO_INVOICE
   * @return invoice
  **/
  @ApiModelProperty(value = "Invoice type, one of: VAT, VAT_MARGIN, WITHOUT_VAT, NO_INVOICE")

  public String getInvoice() {
    return invoice;
  }

  public void setInvoice(String invoice) {
    this.invoice = invoice;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Payments payments = (Payments) o;
    return Objects.equals(this.invoice, payments.invoice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invoice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Payments {\n");
    
    sb.append("    invoice: ").append(toIndentedString(invoice)).append("\n");
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
