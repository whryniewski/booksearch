package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.OfferCriterium;
import io.swagger.model.QuantityModification;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Quantity modification command payload
 */
@ApiModel(description = "Quantity modification command payload")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class OfferQuantityChangeCommand   {
  @JsonProperty("modification")
  private QuantityModification modification = null;

  @JsonProperty("offerCriteria")
  @Valid
  private List<OfferCriterium> offerCriteria = null;

  public OfferQuantityChangeCommand modification(QuantityModification modification) {
    this.modification = modification;
    return this;
  }

  /**
   * Get modification
   * @return modification
  **/
  @ApiModelProperty(value = "")

  @Valid
  public QuantityModification getModification() {
    return modification;
  }

  public void setModification(QuantityModification modification) {
    this.modification = modification;
  }

  public OfferQuantityChangeCommand offerCriteria(List<OfferCriterium> offerCriteria) {
    this.offerCriteria = offerCriteria;
    return this;
  }

  public OfferQuantityChangeCommand addOfferCriteriaItem(OfferCriterium offerCriteriaItem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferQuantityChangeCommand offerQuantityChangeCommand = (OfferQuantityChangeCommand) o;
    return Objects.equals(this.modification, offerQuantityChangeCommand.modification) &&
        Objects.equals(this.offerCriteria, offerQuantityChangeCommand.offerCriteria);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modification, offerCriteria);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferQuantityChangeCommand {\n");
    
    sb.append("    modification: ").append(toIndentedString(modification)).append("\n");
    sb.append("    offerCriteria: ").append(toIndentedString(offerCriteria)).append("\n");
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
