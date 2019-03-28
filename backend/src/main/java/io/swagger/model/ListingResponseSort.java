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
 * Available sort options.
 */
@ApiModel(description = "Available sort options.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class ListingResponseSort   {
  @JsonProperty("value")
  private String value = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("order")
  private String order = null;

  @JsonProperty("selected")
  private Boolean selected = null;

  public ListingResponseSort value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Query parameter value which should be used for this sorting option.
   * @return value
  **/
  @ApiModelProperty(value = "Query parameter value which should be used for this sorting option.")

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public ListingResponseSort name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Sorting option name.
   * @return name
  **/
  @ApiModelProperty(value = "Sorting option name.")

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ListingResponseSort order(String order) {
    this.order = order;
    return this;
  }

  /**
   * Order label specifying ascending or descending mode.
   * @return order
  **/
  @ApiModelProperty(value = "Order label specifying ascending or descending mode.")

  public String getOrder() {
    return order;
  }

  public void setOrder(String order) {
    this.order = order;
  }

  public ListingResponseSort selected(Boolean selected) {
    this.selected = selected;
    return this;
  }

  /**
   * Indicates whether this sorting options is used in current request.
   * @return selected
  **/
  @ApiModelProperty(value = "Indicates whether this sorting options is used in current request.")

  public Boolean isSelected() {
    return selected;
  }

  public void setSelected(Boolean selected) {
    this.selected = selected;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListingResponseSort listingResponseSort = (ListingResponseSort) o;
    return Objects.equals(this.value, listingResponseSort.value) &&
        Objects.equals(this.name, listingResponseSort.name) &&
        Objects.equals(this.order, listingResponseSort.order) &&
        Objects.equals(this.selected, listingResponseSort.selected);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, name, order, selected);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListingResponseSort {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    selected: ").append(toIndentedString(selected)).append("\n");
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
