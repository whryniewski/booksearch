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
 * ModificationPromotion
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class ModificationPromotion   {
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

  public ModificationPromotion bold(Boolean bold) {
    this.bold = bold;
    return this;
  }

  /**
   * Bold flag: true, false, null
   * @return bold
  **/
  @ApiModelProperty(example = "false", value = "Bold flag: true, false, null")

  public Boolean isBold() {
    return bold;
  }

  public void setBold(Boolean bold) {
    this.bold = bold;
  }

  public ModificationPromotion departmentPage(Boolean departmentPage) {
    this.departmentPage = departmentPage;
    return this;
  }

  /**
   * DepartmentPage flag: true, false, null
   * @return departmentPage
  **/
  @ApiModelProperty(example = "false", value = "DepartmentPage flag: true, false, null")

  public Boolean isDepartmentPage() {
    return departmentPage;
  }

  public void setDepartmentPage(Boolean departmentPage) {
    this.departmentPage = departmentPage;
  }

  public ModificationPromotion emphasized(Boolean emphasized) {
    this.emphasized = emphasized;
    return this;
  }

  /**
   * Emphasized flag: true, false, null
   * @return emphasized
  **/
  @ApiModelProperty(example = "false", value = "Emphasized flag: true, false, null")

  public Boolean isEmphasized() {
    return emphasized;
  }

  public void setEmphasized(Boolean emphasized) {
    this.emphasized = emphasized;
  }

  public ModificationPromotion emphasizedHighlightBoldPackage(Boolean emphasizedHighlightBoldPackage) {
    this.emphasizedHighlightBoldPackage = emphasizedHighlightBoldPackage;
    return this;
  }

  /**
   * EmphasizedHighlightBoldPackage flag: true, false, null
   * @return emphasizedHighlightBoldPackage
  **/
  @ApiModelProperty(example = "false", value = "EmphasizedHighlightBoldPackage flag: true, false, null")

  public Boolean isEmphasizedHighlightBoldPackage() {
    return emphasizedHighlightBoldPackage;
  }

  public void setEmphasizedHighlightBoldPackage(Boolean emphasizedHighlightBoldPackage) {
    this.emphasizedHighlightBoldPackage = emphasizedHighlightBoldPackage;
  }

  public ModificationPromotion highlight(Boolean highlight) {
    this.highlight = highlight;
    return this;
  }

  /**
   * Highlight flag: true, false, null
   * @return highlight
  **/
  @ApiModelProperty(example = "false", value = "Highlight flag: true, false, null")

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
    ModificationPromotion modificationPromotion = (ModificationPromotion) o;
    return Objects.equals(this.bold, modificationPromotion.bold) &&
        Objects.equals(this.departmentPage, modificationPromotion.departmentPage) &&
        Objects.equals(this.emphasized, modificationPromotion.emphasized) &&
        Objects.equals(this.emphasizedHighlightBoldPackage, modificationPromotion.emphasizedHighlightBoldPackage) &&
        Objects.equals(this.highlight, modificationPromotion.highlight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bold, departmentPage, emphasized, emphasizedHighlightBoldPackage, highlight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModificationPromotion {\n");
    
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
