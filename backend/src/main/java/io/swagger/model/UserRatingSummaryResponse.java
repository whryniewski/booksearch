package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AverageRates;
import io.swagger.model.Summary;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UserRatingSummaryResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class UserRatingSummaryResponse   {
  @JsonProperty("averageRates")
  private AverageRates averageRates = null;

  @JsonProperty("notRecommended")
  private Summary notRecommended = null;

  @JsonProperty("recommended")
  private Summary recommended = null;

  @JsonProperty("recommendedPercentage")
  private String recommendedPercentage = null;

  public UserRatingSummaryResponse averageRates(AverageRates averageRates) {
    this.averageRates = averageRates;
    return this;
  }

  /**
   * Get averageRates
   * @return averageRates
  **/
  @ApiModelProperty(value = "")

  @Valid
  public AverageRates getAverageRates() {
    return averageRates;
  }

  public void setAverageRates(AverageRates averageRates) {
    this.averageRates = averageRates;
  }

  public UserRatingSummaryResponse notRecommended(Summary notRecommended) {
    this.notRecommended = notRecommended;
    return this;
  }

  /**
   * Get notRecommended
   * @return notRecommended
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
  public Summary getNotRecommended() {
    return notRecommended;
  }

  public void setNotRecommended(Summary notRecommended) {
    this.notRecommended = notRecommended;
  }

  public UserRatingSummaryResponse recommended(Summary recommended) {
    this.recommended = recommended;
    return this;
  }

  /**
   * Get recommended
   * @return recommended
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
  public Summary getRecommended() {
    return recommended;
  }

  public void setRecommended(Summary recommended) {
    this.recommended = recommended;
  }

  public UserRatingSummaryResponse recommendedPercentage(String recommendedPercentage) {
    this.recommendedPercentage = recommendedPercentage;
    return this;
  }

  /**
   * Percentage of unique buyers recommending seller
   * @return recommendedPercentage
  **/
  @ApiModelProperty(example = "1", required = true, value = "Percentage of unique buyers recommending seller")
  @NotNull

  public String getRecommendedPercentage() {
    return recommendedPercentage;
  }

  public void setRecommendedPercentage(String recommendedPercentage) {
    this.recommendedPercentage = recommendedPercentage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserRatingSummaryResponse userRatingSummaryResponse = (UserRatingSummaryResponse) o;
    return Objects.equals(this.averageRates, userRatingSummaryResponse.averageRates) &&
        Objects.equals(this.notRecommended, userRatingSummaryResponse.notRecommended) &&
        Objects.equals(this.recommended, userRatingSummaryResponse.recommended) &&
        Objects.equals(this.recommendedPercentage, userRatingSummaryResponse.recommendedPercentage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(averageRates, notRecommended, recommended, recommendedPercentage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserRatingSummaryResponse {\n");
    
    sb.append("    averageRates: ").append(toIndentedString(averageRates)).append("\n");
    sb.append("    notRecommended: ").append(toIndentedString(notRecommended)).append("\n");
    sb.append("    recommended: ").append(toIndentedString(recommended)).append("\n");
    sb.append("    recommendedPercentage: ").append(toIndentedString(recommendedPercentage)).append("\n");
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
