package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AdditionalServicesGroupResponse;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AdditionalServicesGroups
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class AdditionalServicesGroups   {
  @JsonProperty("additionalServicesGroups")
  @Valid
  private List<AdditionalServicesGroupResponse> additionalServicesGroups = null;

  public AdditionalServicesGroups additionalServicesGroups(List<AdditionalServicesGroupResponse> additionalServicesGroups) {
    this.additionalServicesGroups = additionalServicesGroups;
    return this;
  }

  public AdditionalServicesGroups addAdditionalServicesGroupsItem(AdditionalServicesGroupResponse additionalServicesGroupsItem) {
    if (this.additionalServicesGroups == null) {
      this.additionalServicesGroups = new ArrayList<AdditionalServicesGroupResponse>();
    }
    this.additionalServicesGroups.add(additionalServicesGroupsItem);
    return this;
  }

  /**
   * Get additionalServicesGroups
   * @return additionalServicesGroups
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<AdditionalServicesGroupResponse> getAdditionalServicesGroups() {
    return additionalServicesGroups;
  }

  public void setAdditionalServicesGroups(List<AdditionalServicesGroupResponse> additionalServicesGroups) {
    this.additionalServicesGroups = additionalServicesGroups;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdditionalServicesGroups additionalServicesGroups = (AdditionalServicesGroups) o;
    return Objects.equals(this.additionalServicesGroups, additionalServicesGroups.additionalServicesGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalServicesGroups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalServicesGroups {\n");
    
    sb.append("    additionalServicesGroups: ").append(toIndentedString(additionalServicesGroups)).append("\n");
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
