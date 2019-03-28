package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
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
 * SellerRebateDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class SellerRebateDto   {
  @JsonProperty("benefits")
  @Valid
  private List<Benefit> benefits = new ArrayList<Benefit>();

  @JsonProperty("createdAt")
  private String createdAt = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("offerCriteria")
  @Valid
  private List<OfferCriterion> offerCriteria = new ArrayList<OfferCriterion>();

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    ACTIVE("ACTIVE"),
    
    INACTIVE("INACTIVE"),
    
    SUSPENDED("SUSPENDED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("status")
  private StatusEnum status = null;

  public SellerRebateDto benefits(List<Benefit> benefits) {
    this.benefits = benefits;
    return this;
  }

  public SellerRebateDto addBenefitsItem(Benefit benefitsItem) {
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

  public SellerRebateDto createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(value = "")

  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public SellerRebateDto id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SellerRebateDto offerCriteria(List<OfferCriterion> offerCriteria) {
    this.offerCriteria = offerCriteria;
    return this;
  }

  public SellerRebateDto addOfferCriteriaItem(OfferCriterion offerCriteriaItem) {
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

  public SellerRebateDto status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SellerRebateDto sellerRebateDto = (SellerRebateDto) o;
    return Objects.equals(this.benefits, sellerRebateDto.benefits) &&
        Objects.equals(this.createdAt, sellerRebateDto.createdAt) &&
        Objects.equals(this.id, sellerRebateDto.id) &&
        Objects.equals(this.offerCriteria, sellerRebateDto.offerCriteria) &&
        Objects.equals(this.status, sellerRebateDto.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(benefits, createdAt, id, offerCriteria, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SellerRebateDto {\n");
    
    sb.append("    benefits: ").append(toIndentedString(benefits)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    offerCriteria: ").append(toIndentedString(offerCriteria)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
