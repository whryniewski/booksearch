package pl.whr.booksearch.service.allegro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PromotionCampaignRequestDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class PromotionCampaignRequestDto   {
  @JsonProperty("promotion")
  private PromotionRequestDto promotion = null;

  @JsonProperty("campaign")
  private CampaignRequestDto campaign = null;

  public PromotionCampaignRequestDto promotion(PromotionRequestDto promotion) {
    this.promotion = promotion;
    return this;
  }

  /**
   * Get promotion
   * @return promotion
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
  public PromotionRequestDto getPromotion() {
    return promotion;
  }

  public void setPromotion(PromotionRequestDto promotion) {
    this.promotion = promotion;
  }

  public PromotionCampaignRequestDto campaign(CampaignRequestDto campaign) {
    this.campaign = campaign;
    return this;
  }

  /**
   * Get campaign
   * @return campaign
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
  public CampaignRequestDto getCampaign() {
    return campaign;
  }

  public void setCampaign(CampaignRequestDto campaign) {
    this.campaign = campaign;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromotionCampaignRequestDto promotionCampaignRequestDto = (PromotionCampaignRequestDto) o;
    return Objects.equals(this.promotion, promotionCampaignRequestDto.promotion) &&
        Objects.equals(this.campaign, promotionCampaignRequestDto.campaign);
  }

  @Override
  public int hashCode() {
    return Objects.hash(promotion, campaign);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromotionCampaignRequestDto {\n");
    
    sb.append("    promotion: ").append(toIndentedString(promotion)).append("\n");
    sb.append("    campaign: ").append(toIndentedString(campaign)).append("\n");
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
