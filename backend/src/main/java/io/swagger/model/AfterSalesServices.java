package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.JustId;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AfterSalesServices
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class AfterSalesServices   {
  @JsonProperty("impliedWarranty")
  private JustId impliedWarranty = null;

  @JsonProperty("returnPolicy")
  private JustId returnPolicy = null;

  @JsonProperty("warranty")
  private JustId warranty = null;

  public AfterSalesServices impliedWarranty(JustId impliedWarranty) {
    this.impliedWarranty = impliedWarranty;
    return this;
  }

  /**
   * Get impliedWarranty
   * @return impliedWarranty
  **/
  @ApiModelProperty(value = "")

  @Valid
  public JustId getImpliedWarranty() {
    return impliedWarranty;
  }

  public void setImpliedWarranty(JustId impliedWarranty) {
    this.impliedWarranty = impliedWarranty;
  }

  public AfterSalesServices returnPolicy(JustId returnPolicy) {
    this.returnPolicy = returnPolicy;
    return this;
  }

  /**
   * Get returnPolicy
   * @return returnPolicy
  **/
  @ApiModelProperty(value = "")

  @Valid
  public JustId getReturnPolicy() {
    return returnPolicy;
  }

  public void setReturnPolicy(JustId returnPolicy) {
    this.returnPolicy = returnPolicy;
  }

  public AfterSalesServices warranty(JustId warranty) {
    this.warranty = warranty;
    return this;
  }

  /**
   * Get warranty
   * @return warranty
  **/
  @ApiModelProperty(value = "")

  @Valid
  public JustId getWarranty() {
    return warranty;
  }

  public void setWarranty(JustId warranty) {
    this.warranty = warranty;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AfterSalesServices afterSalesServices = (AfterSalesServices) o;
    return Objects.equals(this.impliedWarranty, afterSalesServices.impliedWarranty) &&
        Objects.equals(this.returnPolicy, afterSalesServices.returnPolicy) &&
        Objects.equals(this.warranty, afterSalesServices.warranty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(impliedWarranty, returnPolicy, warranty);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AfterSalesServices {\n");
    
    sb.append("    impliedWarranty: ").append(toIndentedString(impliedWarranty)).append("\n");
    sb.append("    returnPolicy: ").append(toIndentedString(returnPolicy)).append("\n");
    sb.append("    warranty: ").append(toIndentedString(warranty)).append("\n");
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
