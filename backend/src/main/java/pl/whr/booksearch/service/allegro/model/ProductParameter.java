package pl.whr.booksearch.service.allegro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Product&#x27;s parameter
 */
@ApiModel(description = "Product's parameter")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class ProductParameter   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("rangeValue")
  private ParameterRangeValue rangeValue = null;

  @JsonProperty("values")
  @Valid
  private List<String> values = null;

  @JsonProperty("valuesIds")
  @Valid
  private List<String> valuesIds = null;

  @JsonProperty("valueLabels")
  @Valid
  private List<String> valueLabels = null;

  @JsonProperty("options")
  @Valid
  private List<ProductParameterOptions> options = null;

  public ProductParameter id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ProductParameter rangeValue(ParameterRangeValue rangeValue) {
    this.rangeValue = rangeValue;
    return this;
  }

  /**
   * Get rangeValue
   * @return rangeValue
  **/
  @ApiModelProperty(value = "")

  @Valid
  public ParameterRangeValue getRangeValue() {
    return rangeValue;
  }

  public void setRangeValue(ParameterRangeValue rangeValue) {
    this.rangeValue = rangeValue;
  }

  public ProductParameter values(List<String> values) {
    this.values = values;
    return this;
  }

  public ProductParameter addValuesItem(String valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<String>();
    }
    this.values.add(valuesItem);
    return this;
  }

  /**
   * Get values
   * @return values
  **/
  @ApiModelProperty(value = "")

  public List<String> getValues() {
    return values;
  }

  public void setValues(List<String> values) {
    this.values = values;
  }

  public ProductParameter valuesIds(List<String> valuesIds) {
    this.valuesIds = valuesIds;
    return this;
  }

  public ProductParameter addValuesIdsItem(String valuesIdsItem) {
    if (this.valuesIds == null) {
      this.valuesIds = new ArrayList<String>();
    }
    this.valuesIds.add(valuesIdsItem);
    return this;
  }

  /**
   * Get valuesIds
   * @return valuesIds
  **/
  @ApiModelProperty(value = "")

  public List<String> getValuesIds() {
    return valuesIds;
  }

  public void setValuesIds(List<String> valuesIds) {
    this.valuesIds = valuesIds;
  }

  public ProductParameter valueLabels(List<String> valueLabels) {
    this.valueLabels = valueLabels;
    return this;
  }

  public ProductParameter addValueLabelsItem(String valueLabelsItem) {
    if (this.valueLabels == null) {
      this.valueLabels = new ArrayList<String>();
    }
    this.valueLabels.add(valueLabelsItem);
    return this;
  }

  /**
   * Get valueLabels
   * @return valueLabels
  **/
  @ApiModelProperty(value = "")

  public List<String> getValueLabels() {
    return valueLabels;
  }

  public void setValueLabels(List<String> valueLabels) {
    this.valueLabels = valueLabels;
  }

  public ProductParameter options(List<ProductParameterOptions> options) {
    this.options = options;
    return this;
  }

  public ProductParameter addOptionsItem(ProductParameterOptions optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<ProductParameterOptions>();
    }
    this.options.add(optionsItem);
    return this;
  }

  /**
   * Get options
   * @return options
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<ProductParameterOptions> getOptions() {
    return options;
  }

  public void setOptions(List<ProductParameterOptions> options) {
    this.options = options;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductParameter productParameter = (ProductParameter) o;
    return Objects.equals(this.id, productParameter.id) &&
        Objects.equals(this.rangeValue, productParameter.rangeValue) &&
        Objects.equals(this.values, productParameter.values) &&
        Objects.equals(this.valuesIds, productParameter.valuesIds) &&
        Objects.equals(this.valueLabels, productParameter.valueLabels) &&
        Objects.equals(this.options, productParameter.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, rangeValue, values, valuesIds, valueLabels, options);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductParameter {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    rangeValue: ").append(toIndentedString(rangeValue)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    valuesIds: ").append(toIndentedString(valuesIds)).append("\n");
    sb.append("    valueLabels: ").append(toIndentedString(valueLabels)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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
