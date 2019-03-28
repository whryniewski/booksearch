package pl.whr.booksearch.service.allegro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

/**
 * Promotion
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class Promotion   {
  @JsonProperty("bold")
  private Boolean bold = null;

  @JsonProperty("departmentPage")
  private Boolean departmentPage = null;

  @JsonProperty("emphasized")
  private Boolean emphasized = null;

  @JsonProperty("emphasizedHighlightBoldPackage")
  private Boolean emphasizedHighlightBoldPackage = null;

  @JsonProperty("highlight")
  private Boolean highlight = null;

  public Promotion bold(Boolean bold) {
    this.bold = bold;
    return this;
  }

  /**
   * Get bold
   * @return bold
  **/
  @ApiModelProperty(value = "")

  public Boolean isBold() {
    return bold;
  }

  public void setBold(Boolean bold) {
    this.bold = bold;
  }

  public Promotion departmentPage(Boolean departmentPage) {
    this.departmentPage = departmentPage;
    return this;
  }

  /**
   * Get departmentPage
   * @return departmentPage
  **/
  @ApiModelProperty(value = "")

  public Boolean isDepartmentPage() {
    return departmentPage;
  }

  public void setDepartmentPage(Boolean departmentPage) {
    this.departmentPage = departmentPage;
  }

  public Promotion emphasized(Boolean emphasized) {
    this.emphasized = emphasized;
    return this;
  }

  /**
   * Get emphasized
   * @return emphasized
  **/
  @ApiModelProperty(value = "")

  public Boolean isEmphasized() {
    return emphasized;
  }

  public void setEmphasized(Boolean emphasized) {
    this.emphasized = emphasized;
  }

  public Promotion emphasizedHighlightBoldPackage(Boolean emphasizedHighlightBoldPackage) {
    this.emphasizedHighlightBoldPackage = emphasizedHighlightBoldPackage;
    return this;
  }

  /**
   * Get emphasizedHighlightBoldPackage
   * @return emphasizedHighlightBoldPackage
  **/
  @ApiModelProperty(value = "")

  public Boolean isEmphasizedHighlightBoldPackage() {
    return emphasizedHighlightBoldPackage;
  }

  public void setEmphasizedHighlightBoldPackage(Boolean emphasizedHighlightBoldPackage) {
    this.emphasizedHighlightBoldPackage = emphasizedHighlightBoldPackage;
  }

  public Promotion highlight(Boolean highlight) {
    this.highlight = highlight;
    return this;
  }

  /**
   * Get highlight
   * @return highlight
  **/
  @ApiModelProperty(value = "")

  public Boolean isHighlight() {
    return highlight;
  }

  public void setHighlight(Boolean highlight) {
    this.highlight = highlight;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Promotion promotion = (Promotion) o;
    return Objects.equals(this.bold, promotion.bold) &&
        Objects.equals(this.departmentPage, promotion.departmentPage) &&
        Objects.equals(this.emphasized, promotion.emphasized) &&
        Objects.equals(this.emphasizedHighlightBoldPackage, promotion.emphasizedHighlightBoldPackage) &&
        Objects.equals(this.highlight, promotion.highlight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bold, departmentPage, emphasized, emphasizedHighlightBoldPackage, highlight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Promotion {\n");
    
    sb.append("    bold: ").append(toIndentedString(bold)).append("\n");
    sb.append("    departmentPage: ").append(toIndentedString(departmentPage)).append("\n");
    sb.append("    emphasized: ").append(toIndentedString(emphasized)).append("\n");
    sb.append("    emphasizedHighlightBoldPackage: ").append(toIndentedString(emphasizedHighlightBoldPackage)).append("\n");
    sb.append("    highlight: ").append(toIndentedString(highlight)).append("\n");
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
