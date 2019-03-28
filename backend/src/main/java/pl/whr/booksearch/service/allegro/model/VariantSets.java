package pl.whr.booksearch.service.allegro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * VariantSets
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class VariantSets   {
  @JsonProperty("count")
  private Integer count = null;

  @JsonProperty("offerVariants")
  @Valid
  private List<VariantSetsVariantSet> offerVariants = null;

  public VariantSets count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Total number of variant sets matching the query.
   * @return count
  **/
  @ApiModelProperty(value = "Total number of variant sets matching the query.")

  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public VariantSets offerVariants(List<VariantSetsVariantSet> offerVariants) {
    this.offerVariants = offerVariants;
    return this;
  }

  public VariantSets addOfferVariantsItem(VariantSetsVariantSet offerVariantsItem) {
    if (this.offerVariants == null) {
      this.offerVariants = new ArrayList<VariantSetsVariantSet>();
    }
    this.offerVariants.add(offerVariantsItem);
    return this;
  }

  /**
   * Get offerVariants
   * @return offerVariants
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<VariantSetsVariantSet> getOfferVariants() {
    return offerVariants;
  }

  public void setOfferVariants(List<VariantSetsVariantSet> offerVariants) {
    this.offerVariants = offerVariants;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VariantSets variantSets = (VariantSets) o;
    return Objects.equals(this.count, variantSets.count) &&
        Objects.equals(this.offerVariants, variantSets.offerVariants);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, offerVariants);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariantSets {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    offerVariants: ").append(toIndentedString(offerVariants)).append("\n");
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
