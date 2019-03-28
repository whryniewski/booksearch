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
 * CategoryParameterOptions
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class CategoryParameterOptions   {
  @JsonProperty("variantsAllowed")
  private Boolean variantsAllowed = null;

  @JsonProperty("variantsEqual")
  private Boolean variantsEqual = null;

  public CategoryParameterOptions variantsAllowed(Boolean variantsAllowed) {
    this.variantsAllowed = variantsAllowed;
    return this;
  }

  /**
   * Parameters with this option enabled can be used for offer variants creation
   * @return variantsAllowed
  **/
  @ApiModelProperty(value = "Parameters with this option enabled can be used for offer variants creation")

  public Boolean isVariantsAllowed() {
    return variantsAllowed;
  }

  public void setVariantsAllowed(Boolean variantsAllowed) {
    this.variantsAllowed = variantsAllowed;
  }

  public CategoryParameterOptions variantsEqual(Boolean variantsEqual) {
    this.variantsEqual = variantsEqual;
    return this;
  }

  /**
   * All offer variants must have the same values in parameters with this option enabled
   * @return variantsEqual
  **/
  @ApiModelProperty(value = "All offer variants must have the same values in parameters with this option enabled")

  public Boolean isVariantsEqual() {
    return variantsEqual;
  }

  public void setVariantsEqual(Boolean variantsEqual) {
    this.variantsEqual = variantsEqual;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CategoryParameterOptions categoryParameterOptions = (CategoryParameterOptions) o;
    return Objects.equals(this.variantsAllowed, categoryParameterOptions.variantsAllowed) &&
        Objects.equals(this.variantsEqual, categoryParameterOptions.variantsEqual);
  }

  @Override
  public int hashCode() {
    return Objects.hash(variantsAllowed, variantsEqual);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CategoryParameterOptions {\n");
    
    sb.append("    variantsAllowed: ").append(toIndentedString(variantsAllowed)).append("\n");
    sb.append("    variantsEqual: ").append(toIndentedString(variantsEqual)).append("\n");
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
