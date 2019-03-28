package pl.whr.booksearch.service.allegro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * VariantSetOffer
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class VariantSetOffer   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("colorPattern")
  private String colorPattern = null;

  public VariantSetOffer id(String id) {
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

  public VariantSetOffer colorPattern(String colorPattern) {
    this.colorPattern = colorPattern;
    return this;
  }

  /**
   * Label that allows to group variants via image. All variants having the same image should have identical identifier in this field.
   * @return colorPattern
  **/
  @ApiModelProperty(value = "Label that allows to group variants via image. All variants having the same image should have identical identifier in this field.")

@Size(max=50)   public String getColorPattern() {
    return colorPattern;
  }

  public void setColorPattern(String colorPattern) {
    this.colorPattern = colorPattern;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VariantSetOffer variantSetOffer = (VariantSetOffer) o;
    return Objects.equals(this.id, variantSetOffer.id) &&
        Objects.equals(this.colorPattern, variantSetOffer.colorPattern);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, colorPattern);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariantSetOffer {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    colorPattern: ").append(toIndentedString(colorPattern)).append("\n");
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
