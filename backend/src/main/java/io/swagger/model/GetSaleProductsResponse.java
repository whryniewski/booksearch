package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.SaleProductResponseDto;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GetSaleProductsResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class GetSaleProductsResponse   {
  @JsonProperty("products")
  @Valid
  private List<SaleProductResponseDto> products = new ArrayList<SaleProductResponseDto>();

  @JsonProperty("count")
  private BigDecimal count = null;

  public GetSaleProductsResponse products(List<SaleProductResponseDto> products) {
    this.products = products;
    return this;
  }

  public GetSaleProductsResponse addProductsItem(SaleProductResponseDto productsItem) {
    this.products.add(productsItem);
    return this;
  }

  /**
   * Get products
   * @return products
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull
  @Valid
  public List<SaleProductResponseDto> getProducts() {
    return products;
  }

  public void setProducts(List<SaleProductResponseDto> products) {
    this.products = products;
  }

  public GetSaleProductsResponse count(BigDecimal count) {
    this.count = count;
    return this;
  }

  /**
   * Total number of products matching query criteria
   * @return count
  **/
  @ApiModelProperty(value = "Total number of products matching query criteria")

  @Valid
  public BigDecimal getCount() {
    return count;
  }

  public void setCount(BigDecimal count) {
    this.count = count;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetSaleProductsResponse getSaleProductsResponse = (GetSaleProductsResponse) o;
    return Objects.equals(this.products, getSaleProductsResponse.products) &&
        Objects.equals(this.count, getSaleProductsResponse.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(products, count);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSaleProductsResponse {\n");
    
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
