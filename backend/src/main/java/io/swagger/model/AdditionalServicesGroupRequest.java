package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AdditionalServiceRequest;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AdditionalServicesGroupRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class AdditionalServicesGroupRequest   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("additionalServices")
  @Valid
  private List<AdditionalServiceRequest> additionalServices = new ArrayList<AdditionalServiceRequest>();

  public AdditionalServicesGroupRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(min=1,max=100)   public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AdditionalServicesGroupRequest additionalServices(List<AdditionalServiceRequest> additionalServices) {
    this.additionalServices = additionalServices;
    return this;
  }

  public AdditionalServicesGroupRequest addAdditionalServicesItem(AdditionalServiceRequest additionalServicesItem) {
    this.additionalServices.add(additionalServicesItem);
    return this;
  }

  /**
   * Get additionalServices
   * @return additionalServices
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull
  @Valid
  public List<AdditionalServiceRequest> getAdditionalServices() {
    return additionalServices;
  }

  public void setAdditionalServices(List<AdditionalServiceRequest> additionalServices) {
    this.additionalServices = additionalServices;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdditionalServicesGroupRequest additionalServicesGroupRequest = (AdditionalServicesGroupRequest) o;
    return Objects.equals(this.name, additionalServicesGroupRequest.name) &&
        Objects.equals(this.additionalServices, additionalServicesGroupRequest.additionalServices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, additionalServices);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalServicesGroupRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    additionalServices: ").append(toIndentedString(additionalServices)).append("\n");
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
