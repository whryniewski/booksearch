package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ListingResponseCategories;
import io.swagger.model.ListingResponseFilters;
import io.swagger.model.ListingResponseOffers;
import io.swagger.model.ListingResponseSearchMeta;
import io.swagger.model.ListingResponseSort;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ListingResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class ListingResponse   {
  @JsonProperty("items")
  private ListingResponseOffers items = null;

  @JsonProperty("categories")
  private ListingResponseCategories categories = null;

  @JsonProperty("filters")
  @Valid
  private List<ListingResponseFilters> filters = null;

  @JsonProperty("searchMeta")
  private ListingResponseSearchMeta searchMeta = null;

  @JsonProperty("sort")
  @Valid
  private List<ListingResponseSort> sort = null;

  public ListingResponse items(ListingResponseOffers items) {
    this.items = items;
    return this;
  }

  /**
   * Get items
   * @return items
  **/
  @ApiModelProperty(value = "")

  @Valid
  public ListingResponseOffers getItems() {
    return items;
  }

  public void setItems(ListingResponseOffers items) {
    this.items = items;
  }

  public ListingResponse categories(ListingResponseCategories categories) {
    this.categories = categories;
    return this;
  }

  /**
   * Get categories
   * @return categories
  **/
  @ApiModelProperty(value = "")

  @Valid
  public ListingResponseCategories getCategories() {
    return categories;
  }

  public void setCategories(ListingResponseCategories categories) {
    this.categories = categories;
  }

  public ListingResponse filters(List<ListingResponseFilters> filters) {
    this.filters = filters;
    return this;
  }

  public ListingResponse addFiltersItem(ListingResponseFilters filtersItem) {
    if (this.filters == null) {
      this.filters = new ArrayList<ListingResponseFilters>();
    }
    this.filters.add(filtersItem);
    return this;
  }

  /**
   * Filters with counters available for given search, which can be used to refine search results.
   * @return filters
  **/
  @ApiModelProperty(value = "Filters with counters available for given search, which can be used to refine search results.")
  @Valid
  public List<ListingResponseFilters> getFilters() {
    return filters;
  }

  public void setFilters(List<ListingResponseFilters> filters) {
    this.filters = filters;
  }

  public ListingResponse searchMeta(ListingResponseSearchMeta searchMeta) {
    this.searchMeta = searchMeta;
    return this;
  }

  /**
   * Get searchMeta
   * @return searchMeta
  **/
  @ApiModelProperty(value = "")

  @Valid
  public ListingResponseSearchMeta getSearchMeta() {
    return searchMeta;
  }

  public void setSearchMeta(ListingResponseSearchMeta searchMeta) {
    this.searchMeta = searchMeta;
  }

  public ListingResponse sort(List<ListingResponseSort> sort) {
    this.sort = sort;
    return this;
  }

  public ListingResponse addSortItem(ListingResponseSort sortItem) {
    if (this.sort == null) {
      this.sort = new ArrayList<ListingResponseSort>();
    }
    this.sort.add(sortItem);
    return this;
  }

  /**
   * Available sorting options.
   * @return sort
  **/
  @ApiModelProperty(value = "Available sorting options.")
  @Valid
  public List<ListingResponseSort> getSort() {
    return sort;
  }

  public void setSort(List<ListingResponseSort> sort) {
    this.sort = sort;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListingResponse listingResponse = (ListingResponse) o;
    return Objects.equals(this.items, listingResponse.items) &&
        Objects.equals(this.categories, listingResponse.categories) &&
        Objects.equals(this.filters, listingResponse.filters) &&
        Objects.equals(this.searchMeta, listingResponse.searchMeta) &&
        Objects.equals(this.sort, listingResponse.sort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, categories, filters, searchMeta, sort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListingResponse {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    searchMeta: ").append(toIndentedString(searchMeta)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
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
