package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ParametersForPreviewPrice;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * WrapperTypeForPreviewConditions
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class WrapperTypeForPreviewConditions   {
  @JsonProperty("includeQuotingBundles")
  private Boolean includeQuotingBundles = null;

  @JsonProperty("offer")
  private ParametersForPreviewPrice offer = null;

  public WrapperTypeForPreviewConditions includeQuotingBundles(Boolean includeQuotingBundles) {
    this.includeQuotingBundles = includeQuotingBundles;
    return this;
  }

  /**
   * Include in calculation user's active bundles which allow to publish for free offer or use for free promotion options.
   * @return includeQuotingBundles
  **/
  @ApiModelProperty(example = "false", value = "Include in calculation user's active bundles which allow to publish for free offer or use for free promotion options.")

  public Boolean isIncludeQuotingBundles() {
    return includeQuotingBundles;
  }

  public void setIncludeQuotingBundles(Boolean includeQuotingBundles) {
    this.includeQuotingBundles = includeQuotingBundles;
  }

  public WrapperTypeForPreviewConditions offer(ParametersForPreviewPrice offer) {
    this.offer = offer;
    return this;
  }

  /**
   * Get offer
   * @return offer
  **/
  @ApiModelProperty(value = "")

  @Valid
  public ParametersForPreviewPrice getOffer() {
    return offer;
  }

  public void setOffer(ParametersForPreviewPrice offer) {
    this.offer = offer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WrapperTypeForPreviewConditions wrapperTypeForPreviewConditions = (WrapperTypeForPreviewConditions) o;
    return Objects.equals(this.includeQuotingBundles, wrapperTypeForPreviewConditions.includeQuotingBundles) &&
        Objects.equals(this.offer, wrapperTypeForPreviewConditions.offer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeQuotingBundles, offer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WrapperTypeForPreviewConditions {\n");
    
    sb.append("    includeQuotingBundles: ").append(toIndentedString(includeQuotingBundles)).append("\n");
    sb.append("    offer: ").append(toIndentedString(offer)).append("\n");
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
