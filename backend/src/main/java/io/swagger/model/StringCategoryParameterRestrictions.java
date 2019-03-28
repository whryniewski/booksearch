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
 * StringCategoryParameterRestrictions
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class StringCategoryParameterRestrictions   {
  @JsonProperty("minLength")
  private Integer minLength = null;

  @JsonProperty("maxLength")
  private Integer maxLength = null;

  @JsonProperty("allowedNumberOfValues")
  private Integer allowedNumberOfValues = null;

  public StringCategoryParameterRestrictions minLength(Integer minLength) {
    this.minLength = minLength;
    return this;
  }

  /**
   * Get minLength
   * @return minLength
  **/
  @ApiModelProperty(value = "")

  public Integer getMinLength() {
    return minLength;
  }

  public void setMinLength(Integer minLength) {
    this.minLength = minLength;
  }

  public StringCategoryParameterRestrictions maxLength(Integer maxLength) {
    this.maxLength = maxLength;
    return this;
  }

  /**
   * Get maxLength
   * @return maxLength
  **/
  @ApiModelProperty(value = "")

  public Integer getMaxLength() {
    return maxLength;
  }

  public void setMaxLength(Integer maxLength) {
    this.maxLength = maxLength;
  }

  public StringCategoryParameterRestrictions allowedNumberOfValues(Integer allowedNumberOfValues) {
    this.allowedNumberOfValues = allowedNumberOfValues;
    return this;
  }

  /**
   * Get allowedNumberOfValues
   * @return allowedNumberOfValues
  **/
  @ApiModelProperty(value = "")

  public Integer getAllowedNumberOfValues() {
    return allowedNumberOfValues;
  }

  public void setAllowedNumberOfValues(Integer allowedNumberOfValues) {
    this.allowedNumberOfValues = allowedNumberOfValues;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StringCategoryParameterRestrictions stringCategoryParameterRestrictions = (StringCategoryParameterRestrictions) o;
    return Objects.equals(this.minLength, stringCategoryParameterRestrictions.minLength) &&
        Objects.equals(this.maxLength, stringCategoryParameterRestrictions.maxLength) &&
        Objects.equals(this.allowedNumberOfValues, stringCategoryParameterRestrictions.allowedNumberOfValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minLength, maxLength, allowedNumberOfValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StringCategoryParameterRestrictions {\n");
    
    sb.append("    minLength: ").append(toIndentedString(minLength)).append("\n");
    sb.append("    maxLength: ").append(toIndentedString(maxLength)).append("\n");
    sb.append("    allowedNumberOfValues: ").append(toIndentedString(allowedNumberOfValues)).append("\n");
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
