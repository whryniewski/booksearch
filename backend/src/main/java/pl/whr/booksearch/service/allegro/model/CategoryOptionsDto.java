package pl.whr.booksearch.service.allegro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

/**
 * CategoryOptionsDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class CategoryOptionsDto   {
  @JsonProperty("advertisement")
  private Boolean advertisement = null;

  @JsonProperty("advertisementPriceOptional")
  private Boolean advertisementPriceOptional = null;

  @JsonProperty("variantsByColorPatternAllowed")
  private Boolean variantsByColorPatternAllowed = null;

  @JsonProperty("offersWithProductPublicationEnabled")
  private Boolean offersWithProductPublicationEnabled = null;

  public CategoryOptionsDto advertisement(Boolean advertisement) {
    this.advertisement = advertisement;
    return this;
  }

  /**
   * Get advertisement
   * @return advertisement
  **/
  @ApiModelProperty(value = "")

  public Boolean isAdvertisement() {
    return advertisement;
  }

  public void setAdvertisement(Boolean advertisement) {
    this.advertisement = advertisement;
  }

  public CategoryOptionsDto advertisementPriceOptional(Boolean advertisementPriceOptional) {
    this.advertisementPriceOptional = advertisementPriceOptional;
    return this;
  }

  /**
   * Get advertisementPriceOptional
   * @return advertisementPriceOptional
  **/
  @ApiModelProperty(value = "")

  public Boolean isAdvertisementPriceOptional() {
    return advertisementPriceOptional;
  }

  public void setAdvertisementPriceOptional(Boolean advertisementPriceOptional) {
    this.advertisementPriceOptional = advertisementPriceOptional;
  }

  public CategoryOptionsDto variantsByColorPatternAllowed(Boolean variantsByColorPatternAllowed) {
    this.variantsByColorPatternAllowed = variantsByColorPatternAllowed;
    return this;
  }

  /**
   * Get variantsByColorPatternAllowed
   * @return variantsByColorPatternAllowed
  **/
  @ApiModelProperty(value = "")

  public Boolean isVariantsByColorPatternAllowed() {
    return variantsByColorPatternAllowed;
  }

  public void setVariantsByColorPatternAllowed(Boolean variantsByColorPatternAllowed) {
    this.variantsByColorPatternAllowed = variantsByColorPatternAllowed;
  }

  public CategoryOptionsDto offersWithProductPublicationEnabled(Boolean offersWithProductPublicationEnabled) {
    this.offersWithProductPublicationEnabled = offersWithProductPublicationEnabled;
    return this;
  }

  /**
   * Get offersWithProductPublicationEnabled
   * @return offersWithProductPublicationEnabled
  **/
  @ApiModelProperty(value = "")

  public Boolean isOffersWithProductPublicationEnabled() {
    return offersWithProductPublicationEnabled;
  }

  public void setOffersWithProductPublicationEnabled(Boolean offersWithProductPublicationEnabled) {
    this.offersWithProductPublicationEnabled = offersWithProductPublicationEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CategoryOptionsDto categoryOptionsDto = (CategoryOptionsDto) o;
    return Objects.equals(this.advertisement, categoryOptionsDto.advertisement) &&
        Objects.equals(this.advertisementPriceOptional, categoryOptionsDto.advertisementPriceOptional) &&
        Objects.equals(this.variantsByColorPatternAllowed, categoryOptionsDto.variantsByColorPatternAllowed) &&
        Objects.equals(this.offersWithProductPublicationEnabled, categoryOptionsDto.offersWithProductPublicationEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertisement, advertisementPriceOptional, variantsByColorPatternAllowed, offersWithProductPublicationEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CategoryOptionsDto {\n");
    
    sb.append("    advertisement: ").append(toIndentedString(advertisement)).append("\n");
    sb.append("    advertisementPriceOptional: ").append(toIndentedString(advertisementPriceOptional)).append("\n");
    sb.append("    variantsByColorPatternAllowed: ").append(toIndentedString(variantsByColorPatternAllowed)).append("\n");
    sb.append("    offersWithProductPublicationEnabled: ").append(toIndentedString(offersWithProductPublicationEnabled)).append("\n");
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
