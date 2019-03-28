package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.CampaignResponseDto;
import io.swagger.model.PromotionResponseDto;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PromotionCampaignResponseDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class PromotionCampaignResponseDto   {
  @JsonProperty("campaign")
  private CampaignResponseDto campaign = null;

  @JsonProperty("link")
  private String link = null;

  @JsonProperty("promotion")
  private PromotionResponseDto promotion = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    REQUESTED("REQUESTED"),
    
    SUSPENDED("SUSPENDED"),
    
    VERIFICATION("VERIFICATION"),
    
    ACCEPTED("ACCEPTED"),
    
    ACTIVE("ACTIVE"),
    
    FINISHED("FINISHED"),
    
    DECLINED("DECLINED");

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

  public PromotionCampaignResponseDto campaign(CampaignResponseDto campaign) {
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
  public CampaignResponseDto getCampaign() {
    return campaign;
  }

  public void setCampaign(CampaignResponseDto campaign) {
    this.campaign = campaign;
  }

  public PromotionCampaignResponseDto link(String link) {
    this.link = link;
    return this;
  }

  /**
   * Get link
   * @return link
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public PromotionCampaignResponseDto promotion(PromotionResponseDto promotion) {
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
  public PromotionResponseDto getPromotion() {
    return promotion;
  }

  public void setPromotion(PromotionResponseDto promotion) {
    this.promotion = promotion;
  }

  public PromotionCampaignResponseDto status(StatusEnum status) {
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
    PromotionCampaignResponseDto promotionCampaignResponseDto = (PromotionCampaignResponseDto) o;
    return Objects.equals(this.campaign, promotionCampaignResponseDto.campaign) &&
        Objects.equals(this.link, promotionCampaignResponseDto.link) &&
        Objects.equals(this.promotion, promotionCampaignResponseDto.promotion) &&
        Objects.equals(this.status, promotionCampaignResponseDto.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaign, link, promotion, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromotionCampaignResponseDto {\n");
    
    sb.append("    campaign: ").append(toIndentedString(campaign)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    promotion: ").append(toIndentedString(promotion)).append("\n");
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
