package pl.whr.booksearch.service.allegro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

/**
 * Information about promotion options of the item.
 */
@ApiModel(description = "Information about promotion options of the item.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class OfferPromotion   {
  @JsonProperty("emphasized")
  private Boolean emphasized = null;

  @JsonProperty("bold")
  private Boolean bold = null;

  @JsonProperty("highlight")
  private Boolean highlight = null;

  public OfferPromotion emphasized(Boolean emphasized) {
    this.emphasized = emphasized;
    return this;
  }

  /**
   * Indicates whether the item is promoted.
   * @return emphasized
  **/
  @ApiModelProperty(value = "Indicates whether the item is promoted.")

  public Boolean isEmphasized() {
    return emphasized;
  }

  public void setEmphasized(Boolean emphasized) {
    this.emphasized = emphasized;
  }

  public OfferPromotion bold(Boolean bold) {
    this.bold = bold;
    return this;
  }

  /**
   * Indicates whether the item has bold title option.
   * @return bold
  **/
  @ApiModelProperty(value = "Indicates whether the item has bold title option.")

  public Boolean isBold() {
    return bold;
  }

  public void setBold(Boolean bold) {
    this.bold = bold;
  }

  public OfferPromotion highlight(Boolean highlight) {
    this.highlight = highlight;
    return this;
  }

  /**
   * Indicates whether the item has highlight option.
   * @return highlight
  **/
  @ApiModelProperty(value = "Indicates whether the item has highlight option.")

  public Boolean isHighlight() {
    return highlight;
  }

  public void setHighlight(Boolean highlight) {
    this.highlight = highlight;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferPromotion offerPromotion = (OfferPromotion) o;
    return Objects.equals(this.emphasized, offerPromotion.emphasized) &&
        Objects.equals(this.bold, offerPromotion.bold) &&
        Objects.equals(this.highlight, offerPromotion.highlight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emphasized, bold, highlight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferPromotion {\n");
    
    sb.append("    emphasized: ").append(toIndentedString(emphasized)).append("\n");
    sb.append("    bold: ").append(toIndentedString(bold)).append("\n");
    sb.append("    highlight: ").append(toIndentedString(highlight)).append("\n");
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
