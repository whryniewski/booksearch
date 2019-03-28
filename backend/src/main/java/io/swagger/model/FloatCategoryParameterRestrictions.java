package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FloatCategoryParameterRestrictions
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class FloatCategoryParameterRestrictions   {
  @JsonProperty("min")
  private BigDecimal min = null;

  @JsonProperty("max")
  private BigDecimal max = null;

  @JsonProperty("range")
  private Boolean range = null;

  @JsonProperty("precision")
  private Integer precision = null;

  public FloatCategoryParameterRestrictions min(BigDecimal min) {
    this.min = min;
    return this;
  }

  /**
   * Get min
   * @return min
  **/
  @ApiModelProperty(value = "")

  @Valid
  public BigDecimal getMin() {
    return min;
  }

  public void setMin(BigDecimal min) {
    this.min = min;
  }

  public FloatCategoryParameterRestrictions max(BigDecimal max) {
    this.max = max;
    return this;
  }

  /**
   * Get max
   * @return max
  **/
  @ApiModelProperty(value = "")

  @Valid
  public BigDecimal getMax() {
    return max;
  }

  public void setMax(BigDecimal max) {
    this.max = max;
  }

  public FloatCategoryParameterRestrictions range(Boolean range) {
    this.range = range;
    return this;
  }

  /**
   * Get range
   * @return range
  **/
  @ApiModelProperty(value = "")

  public Boolean isRange() {
    return range;
  }

  public void setRange(Boolean range) {
    this.range = range;
  }

  public FloatCategoryParameterRestrictions precision(Integer precision) {
    this.precision = precision;
    return this;
  }

  /**
   * Get precision
   * @return precision
  **/
  @ApiModelProperty(value = "")

  public Integer getPrecision() {
    return precision;
  }

  public void setPrecision(Integer precision) {
    this.precision = precision;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FloatCategoryParameterRestrictions floatCategoryParameterRestrictions = (FloatCategoryParameterRestrictions) o;
    return Objects.equals(this.min, floatCategoryParameterRestrictions.min) &&
        Objects.equals(this.max, floatCategoryParameterRestrictions.max) &&
        Objects.equals(this.range, floatCategoryParameterRestrictions.range) &&
        Objects.equals(this.precision, floatCategoryParameterRestrictions.precision);
  }

  @Override
  public int hashCode() {
    return Objects.hash(min, max, range, precision);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FloatCategoryParameterRestrictions {\n");
    
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
    sb.append("    precision: ").append(toIndentedString(precision)).append("\n");
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
