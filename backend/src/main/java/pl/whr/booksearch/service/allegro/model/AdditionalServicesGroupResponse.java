package pl.whr.booksearch.service.allegro.model;

import java.time.OffsetDateTime;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * AdditionalServicesGroupResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class AdditionalServicesGroupResponse   {
  @JsonProperty("additionalServices")
  @Valid
  private List<AdditionalServiceResponse> additionalServices = null;

  @JsonProperty("createdAt")
  private OffsetDateTime createdAt = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("updatedAt")
  private OffsetDateTime updatedAt = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("seller")
  private Reference seller = null;

  public AdditionalServicesGroupResponse additionalServices(List<AdditionalServiceResponse> additionalServices) {
    this.additionalServices = additionalServices;
    return this;
  }

  public AdditionalServicesGroupResponse addAdditionalServicesItem(AdditionalServiceResponse additionalServicesItem) {
    if (this.additionalServices == null) {
      this.additionalServices = new ArrayList<AdditionalServiceResponse>();
    }
    this.additionalServices.add(additionalServicesItem);
    return this;
  }

  /**
   * Get additionalServices
   * @return additionalServices
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<AdditionalServiceResponse> getAdditionalServices() {
    return additionalServices;
  }

  public void setAdditionalServices(List<AdditionalServiceResponse> additionalServices) {
    this.additionalServices = additionalServices;
  }

  public AdditionalServicesGroupResponse createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public AdditionalServicesGroupResponse id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AdditionalServicesGroupResponse updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Get updatedAt
   * @return updatedAt
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public AdditionalServicesGroupResponse name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AdditionalServicesGroupResponse seller(Reference seller) {
    this.seller = seller;
    return this;
  }

  /**
   * Get seller
   * @return seller
  **/
  @ApiModelProperty(value = "")

  @Valid
  public Reference getSeller() {
    return seller;
  }

  public void setSeller(Reference seller) {
    this.seller = seller;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdditionalServicesGroupResponse additionalServicesGroupResponse = (AdditionalServicesGroupResponse) o;
    return Objects.equals(this.additionalServices, additionalServicesGroupResponse.additionalServices) &&
        Objects.equals(this.createdAt, additionalServicesGroupResponse.createdAt) &&
        Objects.equals(this.id, additionalServicesGroupResponse.id) &&
        Objects.equals(this.updatedAt, additionalServicesGroupResponse.updatedAt) &&
        Objects.equals(this.name, additionalServicesGroupResponse.name) &&
        Objects.equals(this.seller, additionalServicesGroupResponse.seller);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalServices, createdAt, id, updatedAt, name, seller);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalServicesGroupResponse {\n");
    
    sb.append("    additionalServices: ").append(toIndentedString(additionalServices)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    seller: ").append(toIndentedString(seller)).append("\n");
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
