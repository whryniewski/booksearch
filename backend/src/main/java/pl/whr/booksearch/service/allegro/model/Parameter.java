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
 * Offer&#x27;s parameter
 */
@ApiModel(description = "Offer's parameter")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class Parameter   {
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

  public Parameter id(String id) {
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

  public Parameter rangeValue(ParameterRangeValue rangeValue) {
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

  public Parameter values(List<String> values) {
    this.values = values;
    return this;
  }

  public Parameter addValuesItem(String valuesItem) {
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

  public Parameter valuesIds(List<String> valuesIds) {
    this.valuesIds = valuesIds;
    return this;
  }

  public Parameter addValuesIdsItem(String valuesIdsItem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Parameter parameter = (Parameter) o;
    return Objects.equals(this.id, parameter.id) &&
        Objects.equals(this.rangeValue, parameter.rangeValue) &&
        Objects.equals(this.values, parameter.values) &&
        Objects.equals(this.valuesIds, parameter.valuesIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, rangeValue, values, valuesIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Parameter {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    rangeValue: ").append(toIndentedString(rangeValue)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    valuesIds: ").append(toIndentedString(valuesIds)).append("\n");
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
