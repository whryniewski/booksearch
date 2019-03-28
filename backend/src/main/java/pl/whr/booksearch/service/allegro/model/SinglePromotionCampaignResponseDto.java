package pl.whr.booksearch.service.allegro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SinglePromotionCampaignResponseDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class SinglePromotionCampaignResponseDto   {
  @JsonProperty("campaign")
  private CampaignResponseDto campaign = null;

  @JsonProperty("promotion")
  private PromotionResponseDto promotion = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    PENDING("PENDING"),
    
    ACTIVE("ACTIVE"),
    
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

  public SinglePromotionCampaignResponseDto campaign(CampaignResponseDto campaign) {
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

  public SinglePromotionCampaignResponseDto promotion(PromotionResponseDto promotion) {
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

  public SinglePromotionCampaignResponseDto status(StatusEnum status) {
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
    SinglePromotionCampaignResponseDto singlePromotionCampaignResponseDto = (SinglePromotionCampaignResponseDto) o;
    return Objects.equals(this.campaign, singlePromotionCampaignResponseDto.campaign) &&
        Objects.equals(this.promotion, singlePromotionCampaignResponseDto.promotion) &&
        Objects.equals(this.status, singlePromotionCampaignResponseDto.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaign, promotion, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SinglePromotionCampaignResponseDto {\n");
    
    sb.append("    campaign: ").append(toIndentedString(campaign)).append("\n");
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
