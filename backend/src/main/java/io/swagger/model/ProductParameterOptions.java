package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProductParameterOptions
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class ProductParameterOptions   {
  @JsonProperty("identifiesProduct")
  private Boolean identifiesProduct = null;

  public ProductParameterOptions identifiesProduct(Boolean identifiesProduct) {
    this.identifiesProduct = identifiesProduct;
    return this;
  }

  /**
   * Get identifiesProduct
   * @return identifiesProduct
  **/
  @ApiModelProperty(value = "")

  public Boolean isIdentifiesProduct() {
    return identifiesProduct;
  }

  public void setIdentifiesProduct(Boolean identifiesProduct) {
    this.identifiesProduct = identifiesProduct;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductParameterOptions productParameterOptions = (ProductParameterOptions) o;
    return Objects.equals(this.identifiesProduct, productParameterOptions.identifiesProduct);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifiesProduct);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductParameterOptions {\n");
    
    sb.append("    identifiesProduct: ").append(toIndentedString(identifiesProduct)).append("\n");
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
