package pl.whr.booksearch.service.allegro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

/**
 * LineItemIdMappingsMappings
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class LineItemIdMappingsMappings   {
  @JsonProperty("dealId")
  private String dealId = null;

  @JsonProperty("lineItemId")
  private String lineItemId = null;

  public LineItemIdMappingsMappings dealId(String dealId) {
    this.dealId = dealId;
    return this;
  }

  /**
   * WebAPI deal id
   * @return dealId
  **/
  @ApiModelProperty(example = "12345678", value = "WebAPI deal id")

  public String getDealId() {
    return dealId;
  }

  public void setDealId(String dealId) {
    this.dealId = dealId;
  }

  public LineItemIdMappingsMappings lineItemId(String lineItemId) {
    this.lineItemId = lineItemId;
    return this;
  }

  /**
   * Order API line item id
   * @return lineItemId
  **/
  @ApiModelProperty(example = "4e9d1d43-0da5-466e-9c4a-679625b7a617", value = "Order API line item id")

  public String getLineItemId() {
    return lineItemId;
  }

  public void setLineItemId(String lineItemId) {
    this.lineItemId = lineItemId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LineItemIdMappingsMappings lineItemIdMappingsMappings = (LineItemIdMappingsMappings) o;
    return Objects.equals(this.dealId, lineItemIdMappingsMappings.dealId) &&
        Objects.equals(this.lineItemId, lineItemIdMappingsMappings.lineItemId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dealId, lineItemId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineItemIdMappingsMappings {\n");
    
    sb.append("    dealId: ").append(toIndentedString(dealId)).append("\n");
    sb.append("    lineItemId: ").append(toIndentedString(lineItemId)).append("\n");
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
