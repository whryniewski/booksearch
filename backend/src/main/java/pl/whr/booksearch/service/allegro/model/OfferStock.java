package pl.whr.booksearch.service.allegro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

/**
 * Information about stock.
 */
@ApiModel(description = "Information about stock.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class OfferStock   {
  @JsonProperty("unit")
  private String unit = null;

  @JsonProperty("available")
  private Integer available = null;

  public OfferStock unit(String unit) {
    this.unit = unit;
    return this;
  }

  /**
   * Unit type of the item (UNIT, PAIR or SET).
   * @return unit
  **/
  @ApiModelProperty(value = "Unit type of the item (UNIT, PAIR or SET).")

  public String getUnit() {
    return unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }

  public OfferStock available(Integer available) {
    this.available = available;
    return this;
  }

  /**
   * Number of items available to buy.
   * @return available
  **/
  @ApiModelProperty(value = "Number of items available to buy.")

  public Integer getAvailable() {
    return available;
  }

  public void setAvailable(Integer available) {
    this.available = available;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferStock offerStock = (OfferStock) o;
    return Objects.equals(this.unit, offerStock.unit) &&
        Objects.equals(this.available, offerStock.available);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unit, available);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferStock {\n");
    
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    available: ").append(toIndentedString(available)).append("\n");
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
