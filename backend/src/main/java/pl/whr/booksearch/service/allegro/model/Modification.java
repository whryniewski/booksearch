package pl.whr.booksearch.service.allegro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * Contains fields to change
 */
@ApiModel(description = "Contains fields to change")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class Modification   {
  @JsonProperty("additionalServicesGroup")
  private AdditionalServicesGroup additionalServicesGroup = null;

  @JsonProperty("delivery")
  private ModificationDelivery delivery = null;

  @JsonProperty("payments")
  private ModificationPayments payments = null;

  @JsonProperty("promotion")
  private ModificationPromotion promotion = null;

  @JsonProperty("sizeTable")
  private ModificationSizeTable sizeTable = null;

  public Modification additionalServicesGroup(AdditionalServicesGroup additionalServicesGroup) {
    this.additionalServicesGroup = additionalServicesGroup;
    return this;
  }

  /**
   * Get additionalServicesGroup
   * @return additionalServicesGroup
  **/
  @ApiModelProperty(value = "")

  @Valid
  public AdditionalServicesGroup getAdditionalServicesGroup() {
    return additionalServicesGroup;
  }

  public void setAdditionalServicesGroup(AdditionalServicesGroup additionalServicesGroup) {
    this.additionalServicesGroup = additionalServicesGroup;
  }

  public Modification delivery(ModificationDelivery delivery) {
    this.delivery = delivery;
    return this;
  }

  /**
   * Get delivery
   * @return delivery
  **/
  @ApiModelProperty(value = "")

  @Valid
  public ModificationDelivery getDelivery() {
    return delivery;
  }

  public void setDelivery(ModificationDelivery delivery) {
    this.delivery = delivery;
  }

  public Modification payments(ModificationPayments payments) {
    this.payments = payments;
    return this;
  }

  /**
   * Get payments
   * @return payments
  **/
  @ApiModelProperty(value = "")

  @Valid
  public ModificationPayments getPayments() {
    return payments;
  }

  public void setPayments(ModificationPayments payments) {
    this.payments = payments;
  }

  public Modification promotion(ModificationPromotion promotion) {
    this.promotion = promotion;
    return this;
  }

  /**
   * Get promotion
   * @return promotion
  **/
  @ApiModelProperty(value = "")

  @Valid
  public ModificationPromotion getPromotion() {
    return promotion;
  }

  public void setPromotion(ModificationPromotion promotion) {
    this.promotion = promotion;
  }

  public Modification sizeTable(ModificationSizeTable sizeTable) {
    this.sizeTable = sizeTable;
    return this;
  }

  /**
   * Get sizeTable
   * @return sizeTable
  **/
  @ApiModelProperty(value = "")

  @Valid
  public ModificationSizeTable getSizeTable() {
    return sizeTable;
  }

  public void setSizeTable(ModificationSizeTable sizeTable) {
    this.sizeTable = sizeTable;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Modification modification = (Modification) o;
    return Objects.equals(this.additionalServicesGroup, modification.additionalServicesGroup) &&
        Objects.equals(this.delivery, modification.delivery) &&
        Objects.equals(this.payments, modification.payments) &&
        Objects.equals(this.promotion, modification.promotion) &&
        Objects.equals(this.sizeTable, modification.sizeTable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalServicesGroup, delivery, payments, promotion, sizeTable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Modification {\n");
    
    sb.append("    additionalServicesGroup: ").append(toIndentedString(additionalServicesGroup)).append("\n");
    sb.append("    delivery: ").append(toIndentedString(delivery)).append("\n");
    sb.append("    payments: ").append(toIndentedString(payments)).append("\n");
    sb.append("    promotion: ").append(toIndentedString(promotion)).append("\n");
    sb.append("    sizeTable: ").append(toIndentedString(sizeTable)).append("\n");
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
