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
 * IntegerCategoryParameterRestrictions
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class IntegerCategoryParameterRestrictions   {
  @JsonProperty("min")
  private Integer min = null;

  @JsonProperty("max")
  private Integer max = null;

  @JsonProperty("range")
  private Boolean range = null;

  public IntegerCategoryParameterRestrictions min(Integer min) {
    this.min = min;
    return this;
  }

  /**
   * Get min
   * @return min
  **/
  @ApiModelProperty(value = "")

  public Integer getMin() {
    return min;
  }

  public void setMin(Integer min) {
    this.min = min;
  }

  public IntegerCategoryParameterRestrictions max(Integer max) {
    this.max = max;
    return this;
  }

  /**
   * Get max
   * @return max
  **/
  @ApiModelProperty(value = "")

  public Integer getMax() {
    return max;
  }

  public void setMax(Integer max) {
    this.max = max;
  }

  public IntegerCategoryParameterRestrictions range(Boolean range) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntegerCategoryParameterRestrictions integerCategoryParameterRestrictions = (IntegerCategoryParameterRestrictions) o;
    return Objects.equals(this.min, integerCategoryParameterRestrictions.min) &&
        Objects.equals(this.max, integerCategoryParameterRestrictions.max) &&
        Objects.equals(this.range, integerCategoryParameterRestrictions.range);
  }

  @Override
  public int hashCode() {
    return Objects.hash(min, max, range);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegerCategoryParameterRestrictions {\n");
    
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
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
