package pl.whr.booksearch.service.allegro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

/**
 * Search metadata.
 */
@ApiModel(description = "Search metadata.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class ListingResponseSearchMeta   {
  @JsonProperty("availableCount")
  private Integer availableCount = null;

  @JsonProperty("totalCount")
  private Integer totalCount = null;

  @JsonProperty("fallback")
  private Boolean fallback = null;

  public ListingResponseSearchMeta availableCount(Integer availableCount) {
    this.availableCount = availableCount;
    return this;
  }

  /**
   * Number of results available for navigation. If this number is less than the total count, search criteria (categories, filters) should be narrowed down to make all results available.
   * @return availableCount
  **/
  @ApiModelProperty(value = "Number of results available for navigation. If this number is less than the total count, search criteria (categories, filters) should be narrowed down to make all results available.")

  public Integer getAvailableCount() {
    return availableCount;
  }

  public void setAvailableCount(Integer availableCount) {
    this.availableCount = availableCount;
  }

  public ListingResponseSearchMeta totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

  /**
   * Total number of search results for given parameters.
   * @return totalCount
  **/
  @ApiModelProperty(value = "Total number of search results for given parameters.")

  public Integer getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }

  public ListingResponseSearchMeta fallback(Boolean fallback) {
    this.fallback = fallback;
    return this;
  }

  /**
   * Indicates whether search fallback was used. If true, no items matching exact given phrase were found and related items are presented.
   * @return fallback
  **/
  @ApiModelProperty(value = "Indicates whether search fallback was used. If true, no items matching exact given phrase were found and related items are presented.")

  public Boolean isFallback() {
    return fallback;
  }

  public void setFallback(Boolean fallback) {
    this.fallback = fallback;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListingResponseSearchMeta listingResponseSearchMeta = (ListingResponseSearchMeta) o;
    return Objects.equals(this.availableCount, listingResponseSearchMeta.availableCount) &&
        Objects.equals(this.totalCount, listingResponseSearchMeta.totalCount) &&
        Objects.equals(this.fallback, listingResponseSearchMeta.fallback);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableCount, totalCount, fallback);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListingResponseSearchMeta {\n");
    
    sb.append("    availableCount: ").append(toIndentedString(availableCount)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    fallback: ").append(toIndentedString(fallback)).append("\n");
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
