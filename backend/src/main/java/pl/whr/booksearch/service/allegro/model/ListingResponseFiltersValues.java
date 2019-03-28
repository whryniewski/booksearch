package pl.whr.booksearch.service.allegro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

/**
 * ListingResponseFiltersValues
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class ListingResponseFiltersValues   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("value")
  private String value = null;

  @JsonProperty("idSuffix")
  private String idSuffix = null;

  @JsonProperty("count")
  private Integer count = null;

  @JsonProperty("selected")
  private Boolean selected = null;

  public ListingResponseFiltersValues name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the option; for NUMERIC parameters - word indicating start or end of range (ie. *from*, *to*).
   * @return name
  **/
  @ApiModelProperty(value = "Name of the option; for NUMERIC parameters - word indicating start or end of range (ie. *from*, *to*).")

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ListingResponseFiltersValues value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Filter value. Should be used as query parameter value in request. This can be: for MULTI and SINGLE parameters - value identifier (ie. KUJAWSKO_POMORSKIE option in location.province filter); for other types - value entered by user.
   * @return value
  **/
  @ApiModelProperty(value = "Filter value. Should be used as query parameter value in request. This can be: for MULTI and SINGLE parameters - value identifier (ie. KUJAWSKO_POMORSKIE option in location.province filter); for other types - value entered by user.")

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public ListingResponseFiltersValues idSuffix(String idSuffix) {
    this.idSuffix = idSuffix;
    return this;
  }

  /**
   * Suffix used as a second part of query parameter key to be used in request (the first part is filter id). Applicable for NUMERIC values only.
   * @return idSuffix
  **/
  @ApiModelProperty(value = "Suffix used as a second part of query parameter key to be used in request (the first part is filter id). Applicable for NUMERIC values only.")

  public String getIdSuffix() {
    return idSuffix;
  }

  public void setIdSuffix(String idSuffix) {
    this.idSuffix = idSuffix;
  }

  public ListingResponseFiltersValues count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Number of search results matching this filter value.
   * @return count
  **/
  @ApiModelProperty(value = "Number of search results matching this filter value.")

  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public ListingResponseFiltersValues selected(Boolean selected) {
    this.selected = selected;
    return this;
  }

  /**
   * Indicates whether this filter value is used in current request.
   * @return selected
  **/
  @ApiModelProperty(value = "Indicates whether this filter value is used in current request.")

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
    ListingResponseFiltersValues listingResponseFiltersValues = (ListingResponseFiltersValues) o;
    return Objects.equals(this.name, listingResponseFiltersValues.name) &&
        Objects.equals(this.value, listingResponseFiltersValues.value) &&
        Objects.equals(this.idSuffix, listingResponseFiltersValues.idSuffix) &&
        Objects.equals(this.count, listingResponseFiltersValues.count) &&
        Objects.equals(this.selected, listingResponseFiltersValues.selected);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value, idSuffix, count, selected);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListingResponseFiltersValues {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    idSuffix: ").append(toIndentedString(idSuffix)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
