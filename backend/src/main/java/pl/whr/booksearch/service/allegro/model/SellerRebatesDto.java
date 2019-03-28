package pl.whr.booksearch.service.allegro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SellerRebatesDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class SellerRebatesDto   {
  @JsonProperty("promotions")
  @Valid
  private List<SellerRebateDto> promotions = new ArrayList<SellerRebateDto>();

  @JsonProperty("totalCount")
  private Long totalCount = null;

  public SellerRebatesDto promotions(List<SellerRebateDto> promotions) {
    this.promotions = promotions;
    return this;
  }

  public SellerRebatesDto addPromotionsItem(SellerRebateDto promotionsItem) {
    this.promotions.add(promotionsItem);
    return this;
  }

  /**
   * Get promotions
   * @return promotions
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull
  @Valid
  public List<SellerRebateDto> getPromotions() {
    return promotions;
  }

  public void setPromotions(List<SellerRebateDto> promotions) {
    this.promotions = promotions;
  }

  public SellerRebatesDto totalCount(Long totalCount) {
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
    SellerRebatesDto sellerRebatesDto = (SellerRebatesDto) o;
    return Objects.equals(this.promotions, sellerRebatesDto.promotions) &&
        Objects.equals(this.totalCount, sellerRebatesDto.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(promotions, totalCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SellerRebatesDto {\n");
    
    sb.append("    promotions: ").append(toIndentedString(promotions)).append("\n");
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
