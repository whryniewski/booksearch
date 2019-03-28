package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.CheckoutForm;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CheckoutForms
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class CheckoutForms   {
  @JsonProperty("checkoutForms")
  @Valid
  private List<CheckoutForm> checkoutForms = new ArrayList<CheckoutForm>();

  @JsonProperty("count")
  private BigDecimal count = null;

  @JsonProperty("totalCount")
  private BigDecimal totalCount = null;

  public CheckoutForms checkoutForms(List<CheckoutForm> checkoutForms) {
    this.checkoutForms = checkoutForms;
    return this;
  }

  public CheckoutForms addCheckoutFormsItem(CheckoutForm checkoutFormsItem) {
    this.checkoutForms.add(checkoutFormsItem);
    return this;
  }

  /**
   * Get checkoutForms
   * @return checkoutForms
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull
  @Valid
  public List<CheckoutForm> getCheckoutForms() {
    return checkoutForms;
  }

  public void setCheckoutForms(List<CheckoutForm> checkoutForms) {
    this.checkoutForms = checkoutForms;
  }

  public CheckoutForms count(BigDecimal count) {
    this.count = count;
    return this;
  }

  /**
   * number of returned objects
   * @return count
  **/
  @ApiModelProperty(example = "1", required = true, value = "number of returned objects")
  @NotNull

  @Valid
  public BigDecimal getCount() {
    return count;
  }

  public void setCount(BigDecimal count) {
    this.count = count;
  }

  public CheckoutForms totalCount(BigDecimal totalCount) {
    this.totalCount = totalCount;
    return this;
  }

  /**
   * Number of all objects of requested status(es) available (regardless of the provided limit and offset) 
   * @return totalCount
  **/
  @ApiModelProperty(example = "1", required = true, value = "Number of all objects of requested status(es) available (regardless of the provided limit and offset) ")
  @NotNull

  @Valid
  public BigDecimal getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(BigDecimal totalCount) {
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
    CheckoutForms checkoutForms = (CheckoutForms) o;
    return Objects.equals(this.checkoutForms, checkoutForms.checkoutForms) &&
        Objects.equals(this.count, checkoutForms.count) &&
        Objects.equals(this.totalCount, checkoutForms.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkoutForms, count, totalCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckoutForms {\n");
    
    sb.append("    checkoutForms: ").append(toIndentedString(checkoutForms)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
