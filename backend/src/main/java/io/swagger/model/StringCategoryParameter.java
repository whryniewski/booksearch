package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.CategoryParameter;
import io.swagger.model.CategoryParameterOptions;
import io.swagger.model.StringCategoryParameterRestrictions;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * StringCategoryParameter
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class StringCategoryParameter extends CategoryParameter  {
  @JsonProperty("type")
  private String type = "string";

  @JsonProperty("restrictions")
  private StringCategoryParameterRestrictions restrictions = null;

  public StringCategoryParameter type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public StringCategoryParameter restrictions(StringCategoryParameterRestrictions restrictions) {
    this.restrictions = restrictions;
    return this;
  }

  /**
   * Get restrictions
   * @return restrictions
  **/
  @ApiModelProperty(value = "")

  @Valid
  public StringCategoryParameterRestrictions getRestrictions() {
    return restrictions;
  }

  public void setRestrictions(StringCategoryParameterRestrictions restrictions) {
    this.restrictions = restrictions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StringCategoryParameter stringCategoryParameter = (StringCategoryParameter) o;
    return Objects.equals(this.type, stringCategoryParameter.type) &&
        Objects.equals(this.restrictions, stringCategoryParameter.restrictions) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, restrictions, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StringCategoryParameter {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    restrictions: ").append(toIndentedString(restrictions)).append("\n");
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
