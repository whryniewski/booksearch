package pl.whr.booksearch.service.allegro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

/**
 * ModificationPayments
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class ModificationPayments   {
  /**
   * Invoice type: VAT, VAT_MARGIN, WITHOUT_VAT, NO_INVOICE
   */
  public enum InvoiceEnum {
    VAT("VAT"),
    
    VAT_MARGIN("VAT_MARGIN"),
    
    WITHOUT_VAT("WITHOUT_VAT"),
    
    NO_INVOICE("NO_INVOICE");

    private String value;

    InvoiceEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static InvoiceEnum fromValue(String text) {
      for (InvoiceEnum b : InvoiceEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("invoice")
  private InvoiceEnum invoice = null;

  public ModificationPayments invoice(InvoiceEnum invoice) {
    this.invoice = invoice;
    return this;
  }

  /**
   * Invoice type: VAT, VAT_MARGIN, WITHOUT_VAT, NO_INVOICE
   * @return invoice
  **/
  @ApiModelProperty(value = "Invoice type: VAT, VAT_MARGIN, WITHOUT_VAT, NO_INVOICE")

  public InvoiceEnum getInvoice() {
    return invoice;
  }

  public void setInvoice(InvoiceEnum invoice) {
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
    ModificationPayments modificationPayments = (ModificationPayments) o;
    return Objects.equals(this.invoice, modificationPayments.invoice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invoice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModificationPayments {\n");
    
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
