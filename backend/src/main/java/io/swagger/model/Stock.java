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
 * Stock
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class Stock   {
  @JsonProperty("available")
  private Integer available = null;

  @JsonProperty("unit")
  private String unit = null;

  public Stock available(Integer available) {
    this.available = available;
    return this;
  }

  /**
   * Get available
   * @return available
  **/
  @ApiModelProperty(value = "")

  public Integer getAvailable() {
    return available;
  }

  public void setAvailable(Integer available) {
    this.available = available;
  }

  public Stock unit(String unit) {
    this.unit = unit;
    return this;
  }

  /**
   * Stock unit, one of: UNIT, PAIR, SET
   * @return unit
  **/
  @ApiModelProperty(value = "Stock unit, one of: UNIT, PAIR, SET")

  public String getUnit() {
    return unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Stock stock = (Stock) o;
    return Objects.equals(this.available, stock.available) &&
        Objects.equals(this.unit, stock.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(available, unit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Stock {\n");
    
    sb.append("    available: ").append(toIndentedString(available)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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
