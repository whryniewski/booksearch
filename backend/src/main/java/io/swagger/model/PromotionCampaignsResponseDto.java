package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.SinglePromotionCampaignResponseDto;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PromotionCampaignsResponseDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class PromotionCampaignsResponseDto   {
  @JsonProperty("promotionCampaigns")
  @Valid
  private List<SinglePromotionCampaignResponseDto> promotionCampaigns = new ArrayList<SinglePromotionCampaignResponseDto>();

  @JsonProperty("totalCount")
  private Long totalCount = null;

  public PromotionCampaignsResponseDto promotionCampaigns(List<SinglePromotionCampaignResponseDto> promotionCampaigns) {
    this.promotionCampaigns = promotionCampaigns;
    return this;
  }

  public PromotionCampaignsResponseDto addPromotionCampaignsItem(SinglePromotionCampaignResponseDto promotionCampaignsItem) {
    this.promotionCampaigns.add(promotionCampaignsItem);
    return this;
  }

  /**
   * Get promotionCampaigns
   * @return promotionCampaigns
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull
  @Valid
  public List<SinglePromotionCampaignResponseDto> getPromotionCampaigns() {
    return promotionCampaigns;
  }

  public void setPromotionCampaigns(List<SinglePromotionCampaignResponseDto> promotionCampaigns) {
    this.promotionCampaigns = promotionCampaigns;
  }

  public PromotionCampaignsResponseDto totalCount(Long totalCount) {
    this.totalCount = totalCount;
    return this;
  }

  /**
   * Get totalCount
   * @return totalCount
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  public Long getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Long totalCount) {
    this.totalCount = totalCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromotionCampaignsResponseDto promotionCampaignsResponseDto = (PromotionCampaignsResponseDto) o;
    return Objects.equals(this.promotionCampaigns, promotionCampaignsResponseDto.promotionCampaigns) &&
        Objects.equals(this.totalCount, promotionCampaignsResponseDto.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(promotionCampaigns, totalCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromotionCampaignsResponseDto {\n");
    
    sb.append("    promotionCampaigns: ").append(toIndentedString(promotionCampaigns)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
