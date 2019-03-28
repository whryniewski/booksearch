package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.OfferId;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Contains offers criteria
 */
@ApiModel(description = "Contains offers criteria")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class OfferCriterium   {
  @JsonProperty("offers")
  @Valid
  private List<OfferId> offers = null;

  /**
   * Criteria type: CONTAINS_OFFERS
   */
  public enum TypeEnum {
    OFFERS("CONTAINS_OFFERS");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("type")
  private TypeEnum type = null;

  public OfferCriterium offers(List<OfferId> offers) {
    this.offers = offers;
    return this;
  }

  public OfferCriterium addOffersItem(OfferId offersItem) {
    if (this.offers == null) {
      this.offers = new ArrayList<OfferId>();
    }
    this.offers.add(offersItem);
    return this;
  }

  /**
   * Set of offers
   * @return offers
  **/
  @ApiModelProperty(value = "Set of offers")
  @Valid
  public List<OfferId> getOffers() {
    return offers;
  }

  public void setOffers(List<OfferId> offers) {
    this.offers = offers;
  }

  public OfferCriterium type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Criteria type: CONTAINS_OFFERS
   * @return type
  **/
  @ApiModelProperty(value = "Criteria type: CONTAINS_OFFERS")

  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferCriterium offerCriterium = (OfferCriterium) o;
    return Objects.equals(this.offers, offerCriterium.offers) &&
        Objects.equals(this.type, offerCriterium.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offers, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferCriterium {\n");
    
    sb.append("    offers: ").append(toIndentedString(offers)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
