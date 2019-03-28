package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Benefit;
import io.swagger.model.OfferCriterion;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SellerCreateRebateRequestDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class SellerCreateRebateRequestDto   {
  @JsonProperty("benefits")
  @Valid
  private List<Benefit> benefits = new ArrayList<Benefit>();

  @JsonProperty("offerCriteria")
  @Valid
  private List<OfferCriterion> offerCriteria = new ArrayList<OfferCriterion>();

  public SellerCreateRebateRequestDto benefits(List<Benefit> benefits) {
    this.benefits = benefits;
    return this;
  }

  public SellerCreateRebateRequestDto addBenefitsItem(Benefit benefitsItem) {
    this.benefits.add(benefitsItem);
    return this;
  }

  /**
   * Get benefits
   * @return benefits
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull
  @Valid
  public List<Benefit> getBenefits() {
    return benefits;
  }

  public void setBenefits(List<Benefit> benefits) {
    this.benefits = benefits;
  }

  public SellerCreateRebateRequestDto offerCriteria(List<OfferCriterion> offerCriteria) {
    this.offerCriteria = offerCriteria;
    return this;
  }

  public SellerCreateRebateRequestDto addOfferCriteriaItem(OfferCriterion offerCriteriaItem) {
    this.offerCriteria.add(offerCriteriaItem);
    return this;
  }

  /**
   * Get offerCriteria
   * @return offerCriteria
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull
  @Valid
  public List<OfferCriterion> getOfferCriteria() {
    return offerCriteria;
  }

  public void setOfferCriteria(List<OfferCriterion> offerCriteria) {
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
    SellerCreateRebateRequestDto sellerCreateRebateRequestDto = (SellerCreateRebateRequestDto) o;
    return Objects.equals(this.benefits, sellerCreateRebateRequestDto.benefits) &&
        Objects.equals(this.offerCriteria, sellerCreateRebateRequestDto.offerCriteria);
  }

  @Override
  public int hashCode() {
    return Objects.hash(benefits, offerCriteria);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SellerCreateRebateRequestDto {\n");
    
    sb.append("    benefits: ").append(toIndentedString(benefits)).append("\n");
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
