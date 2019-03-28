package pl.whr.booksearch.service.allegro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

/**
 * ListingCategory
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class ListingCategory   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("count")
  private Integer count = null;

  public ListingCategory id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Category id.
   * @return id
  **/
  @ApiModelProperty(value = "Category id.")

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ListingCategory name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Category name.
   * @return name
  **/
  @ApiModelProperty(value = "Category name.")

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ListingCategory count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Results count in this category (available only for categories.subcategories array).
   * @return count
  **/
  @ApiModelProperty(value = "Results count in this category (available only for categories.subcategories array).")

  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListingCategory listingCategory = (ListingCategory) o;
    return Objects.equals(this.id, listingCategory.id) &&
        Objects.equals(this.name, listingCategory.name) &&
        Objects.equals(this.count, listingCategory.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, count);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListingCategory {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
