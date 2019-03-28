package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.VariantSetOffer;
import io.swagger.model.VariantSetParameter;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * VariantSet
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class VariantSet   {
  @JsonProperty("offers")
  @Valid
  private List<VariantSetOffer> offers = new ArrayList<VariantSetOffer>();

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("parameters")
  @Valid
  private List<VariantSetParameter> parameters = new ArrayList<VariantSetParameter>();

  public VariantSet offers(List<VariantSetOffer> offers) {
    this.offers = offers;
    return this;
  }

  public VariantSet addOffersItem(VariantSetOffer offersItem) {
    this.offers.add(offersItem);
    return this;
  }

  /**
   * Get offers
   * @return offers
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull
  @Valid
  public List<VariantSetOffer> getOffers() {
    return offers;
  }

  public void setOffers(List<VariantSetOffer> offers) {
    this.offers = offers;
  }

  public VariantSet name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=50)   public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public VariantSet parameters(List<VariantSetParameter> parameters) {
    this.parameters = parameters;
    return this;
  }

  public VariantSet addParametersItem(VariantSetParameter parametersItem) {
    this.parameters.add(parametersItem);
    return this;
  }

  /**
   * Get parameters
   * @return parameters
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull
  @Valid
  public List<VariantSetParameter> getParameters() {
    return parameters;
  }

  public void setParameters(List<VariantSetParameter> parameters) {
    this.parameters = parameters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VariantSet variantSet = (VariantSet) o;
    return Objects.equals(this.offers, variantSet.offers) &&
        Objects.equals(this.name, variantSet.name) &&
        Objects.equals(this.parameters, variantSet.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offers, name, parameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariantSet {\n");
    
    sb.append("    offers: ").append(toIndentedString(offers)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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
