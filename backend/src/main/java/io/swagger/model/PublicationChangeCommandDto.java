package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.OfferCriterium;
import io.swagger.model.PublicationModification;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Publication modification command payload
 */
@ApiModel(description = "Publication modification command payload")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class PublicationChangeCommandDto   {
  @JsonProperty("offerCriteria")
  @Valid
  private List<OfferCriterium> offerCriteria = null;

  @JsonProperty("publication")
  private PublicationModification publication = null;

  public PublicationChangeCommandDto offerCriteria(List<OfferCriterium> offerCriteria) {
    this.offerCriteria = offerCriteria;
    return this;
  }

  public PublicationChangeCommandDto addOfferCriteriaItem(OfferCriterium offerCriteriaItem) {
    if (this.offerCriteria == null) {
      this.offerCriteria = new ArrayList<OfferCriterium>();
    }
    this.offerCriteria.add(offerCriteriaItem);
    return this;
  }

  /**
   * List of offer criteria
   * @return offerCriteria
  **/
  @ApiModelProperty(value = "List of offer criteria")
  @Valid
  public List<OfferCriterium> getOfferCriteria() {
    return offerCriteria;
  }

  public void setOfferCriteria(List<OfferCriterium> offerCriteria) {
    this.offerCriteria = offerCriteria;
  }

  public PublicationChangeCommandDto publication(PublicationModification publication) {
    this.publication = publication;
    return this;
  }

  /**
   * Get publication
   * @return publication
  **/
  @ApiModelProperty(value = "")

  @Valid
  public PublicationModification getPublication() {
    return publication;
  }

  public void setPublication(PublicationModification publication) {
    this.publication = publication;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublicationChangeCommandDto publicationChangeCommandDto = (PublicationChangeCommandDto) o;
    return Objects.equals(this.offerCriteria, publicationChangeCommandDto.offerCriteria) &&
        Objects.equals(this.publication, publicationChangeCommandDto.publication);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerCriteria, publication);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublicationChangeCommandDto {\n");
    
    sb.append("    offerCriteria: ").append(toIndentedString(offerCriteria)).append("\n");
    sb.append("    publication: ").append(toIndentedString(publication)).append("\n");
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
