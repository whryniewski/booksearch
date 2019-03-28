package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ListingOffer;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Lists of search results.
 */
@ApiModel(description = "Lists of search results.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class ListingResponseOffers   {
  @JsonProperty("promoted")
  @Valid
  private List<ListingOffer> promoted = null;

  @JsonProperty("regular")
  @Valid
  private List<ListingOffer> regular = null;

  public ListingResponseOffers promoted(List<ListingOffer> promoted) {
    this.promoted = promoted;
    return this;
  }

  public ListingResponseOffers addPromotedItem(ListingOffer promotedItem) {
    if (this.promoted == null) {
      this.promoted = new ArrayList<ListingOffer>();
    }
    this.promoted.add(promotedItem);
    return this;
  }

  /**
   * List of promoted offers.
   * @return promoted
  **/
  @ApiModelProperty(value = "List of promoted offers.")
  @Valid
  public List<ListingOffer> getPromoted() {
    return promoted;
  }

  public void setPromoted(List<ListingOffer> promoted) {
    this.promoted = promoted;
  }

  public ListingResponseOffers regular(List<ListingOffer> regular) {
    this.regular = regular;
    return this;
  }

  public ListingResponseOffers addRegularItem(ListingOffer regularItem) {
    if (this.regular == null) {
      this.regular = new ArrayList<ListingOffer>();
    }
    this.regular.add(regularItem);
    return this;
  }

  /**
   * List of regular (non-promoted) offers.
   * @return regular
  **/
  @ApiModelProperty(value = "List of regular (non-promoted) offers.")
  @Valid
  public List<ListingOffer> getRegular() {
    return regular;
  }

  public void setRegular(List<ListingOffer> regular) {
    this.regular = regular;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListingResponseOffers listingResponseOffers = (ListingResponseOffers) o;
    return Objects.equals(this.promoted, listingResponseOffers.promoted) &&
        Objects.equals(this.regular, listingResponseOffers.regular);
  }

  @Override
  public int hashCode() {
    return Objects.hash(promoted, regular);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListingResponseOffers {\n");
    
    sb.append("    promoted: ").append(toIndentedString(promoted)).append("\n");
    sb.append("    regular: ").append(toIndentedString(regular)).append("\n");
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
