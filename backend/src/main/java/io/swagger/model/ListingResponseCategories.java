package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ListingCategory;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Information about categories.
 */
@ApiModel(description = "Information about categories.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class ListingResponseCategories   {
  @JsonProperty("subcategories")
  @Valid
  private List<ListingCategory> subcategories = null;

  @JsonProperty("path")
  @Valid
  private List<ListingCategory> path = null;

  public ListingResponseCategories subcategories(List<ListingCategory> subcategories) {
    this.subcategories = subcategories;
    return this;
  }

  public ListingResponseCategories addSubcategoriesItem(ListingCategory subcategoriesItem) {
    if (this.subcategories == null) {
      this.subcategories = new ArrayList<ListingCategory>();
    }
    this.subcategories.add(subcategoriesItem);
    return this;
  }

  /**
   * Categories with counters, which can be used to refine search results.
   * @return subcategories
  **/
  @ApiModelProperty(value = "Categories with counters, which can be used to refine search results.")
  @Valid
  public List<ListingCategory> getSubcategories() {
    return subcategories;
  }

  public void setSubcategories(List<ListingCategory> subcategories) {
    this.subcategories = subcategories;
  }

  public ListingResponseCategories path(List<ListingCategory> path) {
    this.path = path;
    return this;
  }

  public ListingResponseCategories addPathItem(ListingCategory pathItem) {
    if (this.path == null) {
      this.path = new ArrayList<ListingCategory>();
    }
    this.path.add(pathItem);
    return this;
  }

  /**
   * Categories path to the current listing category (breadcrumbs).
   * @return path
  **/
  @ApiModelProperty(value = "Categories path to the current listing category (breadcrumbs).")
  @Valid
  public List<ListingCategory> getPath() {
    return path;
  }

  public void setPath(List<ListingCategory> path) {
    this.path = path;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListingResponseCategories listingResponseCategories = (ListingResponseCategories) o;
    return Objects.equals(this.subcategories, listingResponseCategories.subcategories) &&
        Objects.equals(this.path, listingResponseCategories.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subcategories, path);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListingResponseCategories {\n");
    
    sb.append("    subcategories: ").append(toIndentedString(subcategories)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
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
