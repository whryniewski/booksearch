package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ReturnPolicyBasic;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ReturnPoliciesListReturnPolicyBasic_
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class ReturnPoliciesListReturnPolicyBasic_   {
  @JsonProperty("count")
  private Integer count = null;

  @JsonProperty("returnPolicies")
  @Valid
  private List<ReturnPolicyBasic> returnPolicies = null;

  public ReturnPoliciesListReturnPolicyBasic_ count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Get count
   * @return count
  **/
  @ApiModelProperty(value = "")

  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public ReturnPoliciesListReturnPolicyBasic_ returnPolicies(List<ReturnPolicyBasic> returnPolicies) {
    this.returnPolicies = returnPolicies;
    return this;
  }

  public ReturnPoliciesListReturnPolicyBasic_ addReturnPoliciesItem(ReturnPolicyBasic returnPoliciesItem) {
    if (this.returnPolicies == null) {
      this.returnPolicies = new ArrayList<ReturnPolicyBasic>();
    }
    this.returnPolicies.add(returnPoliciesItem);
    return this;
  }

  /**
   * Get returnPolicies
   * @return returnPolicies
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<ReturnPolicyBasic> getReturnPolicies() {
    return returnPolicies;
  }

  public void setReturnPolicies(List<ReturnPolicyBasic> returnPolicies) {
    this.returnPolicies = returnPolicies;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReturnPoliciesListReturnPolicyBasic_ returnPoliciesListReturnPolicyBasic_ = (ReturnPoliciesListReturnPolicyBasic_) o;
    return Objects.equals(this.count, returnPoliciesListReturnPolicyBasic_.count) &&
        Objects.equals(this.returnPolicies, returnPoliciesListReturnPolicyBasic_.returnPolicies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, returnPolicies);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReturnPoliciesListReturnPolicyBasic_ {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    returnPolicies: ").append(toIndentedString(returnPolicies)).append("\n");
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
