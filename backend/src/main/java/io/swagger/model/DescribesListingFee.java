package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Fee;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DescribesListingFee
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class DescribesListingFee   {
  @JsonProperty("fee")
  private Fee fee = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("cycleDuration")
  private String cycleDuration = null;

  public DescribesListingFee fee(Fee fee) {
    this.fee = fee;
    return this;
  }

  /**
   * Get fee
   * @return fee
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
  public Fee getFee() {
    return fee;
  }

  public void setFee(Fee fee) {
    this.fee = fee;
  }

  public DescribesListingFee name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DescribesListingFee type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public DescribesListingFee cycleDuration(String cycleDuration) {
    this.cycleDuration = cycleDuration;
    return this;
  }

  /**
   * Pricing cycle duration, ISO 8601 duration format
   * @return cycleDuration
  **/
  @ApiModelProperty(example = "PT240H", required = true, value = "Pricing cycle duration, ISO 8601 duration format")
  @NotNull

  public String getCycleDuration() {
    return cycleDuration;
  }

  public void setCycleDuration(String cycleDuration) {
    this.cycleDuration = cycleDuration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribesListingFee describesListingFee = (DescribesListingFee) o;
    return Objects.equals(this.fee, describesListingFee.fee) &&
        Objects.equals(this.name, describesListingFee.name) &&
        Objects.equals(this.type, describesListingFee.type) &&
        Objects.equals(this.cycleDuration, describesListingFee.cycleDuration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fee, name, type, cycleDuration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribesListingFee {\n");
    
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    cycleDuration: ").append(toIndentedString(cycleDuration)).append("\n");
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
