package pl.whr.booksearch.service.allegro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * ListingResponseFilters
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class ListingResponseFilters   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("values")
  @Valid
  private List<ListingResponseFiltersValues> values = null;

  @JsonProperty("minValue")
  private BigDecimal minValue = null;

  @JsonProperty("maxValue")
  private BigDecimal maxValue = null;

  @JsonProperty("unit")
  private String unit = null;

  public ListingResponseFilters id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Identifier of the filter. Should be used as query parameter key, optionally followed by idSuffix from parameter value (only for NUMERIC filters).
   * @return id
  **/
  @ApiModelProperty(value = "Identifier of the filter. Should be used as query parameter key, optionally followed by idSuffix from parameter value (only for NUMERIC filters).")

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ListingResponseFilters type(String type) {
    this.type = type;
    return this;
  }

  /**
   * MULTI - multiple choice filter, SINGLE - single select (dropdown) filter, NUMERIC - range of numeric values (search offers with value matching this range), NUMERIC_SINGLE - single numeric value (search offers with given value matching the range defined in offer), TEXT - filter allowing user to input any text
   * @return type
  **/
  @ApiModelProperty(value = "MULTI - multiple choice filter, SINGLE - single select (dropdown) filter, NUMERIC - range of numeric values (search offers with value matching this range), NUMERIC_SINGLE - single numeric value (search offers with given value matching the range defined in offer), TEXT - filter allowing user to input any text")

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ListingResponseFilters name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the filter.
   * @return name
  **/
  @ApiModelProperty(value = "Name of the filter.")

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ListingResponseFilters values(List<ListingResponseFiltersValues> values) {
    this.values = values;
    return this;
  }

  public ListingResponseFilters addValuesItem(ListingResponseFiltersValues valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<ListingResponseFiltersValues>();
    }
    this.values.add(valuesItem);
    return this;
  }

  /**
   * Available filter values.
   * @return values
  **/
  @ApiModelProperty(value = "Available filter values.")
  @Valid
  public List<ListingResponseFiltersValues> getValues() {
    return values;
  }

  public void setValues(List<ListingResponseFiltersValues> values) {
    this.values = values;
  }

  public ListingResponseFilters minValue(BigDecimal minValue) {
    this.minValue = minValue;
    return this;
  }

  /**
   * Minimum valid value for filters of type NUMERIC.
   * @return minValue
  **/
  @ApiModelProperty(value = "Minimum valid value for filters of type NUMERIC.")

  @Valid
  public BigDecimal getMinValue() {
    return minValue;
  }

  public void setMinValue(BigDecimal minValue) {
    this.minValue = minValue;
  }

  public ListingResponseFilters maxValue(BigDecimal maxValue) {
    this.maxValue = maxValue;
    return this;
  }

  /**
   * Maximum valid value for filters of type NUMERIC.
   * @return maxValue
  **/
  @ApiModelProperty(value = "Maximum valid value for filters of type NUMERIC.")

  @Valid
  public BigDecimal getMaxValue() {
    return maxValue;
  }

  public void setMaxValue(BigDecimal maxValue) {
    this.maxValue = maxValue;
  }

  public ListingResponseFilters unit(String unit) {
    this.unit = unit;
    return this;
  }

  /**
   * Unit of the NUMERIC/NUMERIC RANGE filter.
   * @return unit
  **/
  @ApiModelProperty(value = "Unit of the NUMERIC/NUMERIC RANGE filter.")

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
    ListingResponseFilters listingResponseFilters = (ListingResponseFilters) o;
    return Objects.equals(this.id, listingResponseFilters.id) &&
        Objects.equals(this.type, listingResponseFilters.type) &&
        Objects.equals(this.name, listingResponseFilters.name) &&
        Objects.equals(this.values, listingResponseFilters.values) &&
        Objects.equals(this.minValue, listingResponseFilters.minValue) &&
        Objects.equals(this.maxValue, listingResponseFilters.maxValue) &&
        Objects.equals(this.unit, listingResponseFilters.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, name, values, minValue, maxValue, unit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListingResponseFilters {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    minValue: ").append(toIndentedString(minValue)).append("\n");
    sb.append("    maxValue: ").append(toIndentedString(maxValue)).append("\n");
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
