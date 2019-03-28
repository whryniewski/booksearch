package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.WarrantyBasic;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * WarrantiesListWarrantyBasic_
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class WarrantiesListWarrantyBasic_   {
  @JsonProperty("count")
  private Integer count = null;

  @JsonProperty("warranties")
  @Valid
  private List<WarrantyBasic> warranties = null;

  public WarrantiesListWarrantyBasic_ count(Integer count) {
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

  public WarrantiesListWarrantyBasic_ warranties(List<WarrantyBasic> warranties) {
    this.warranties = warranties;
    return this;
  }

  public WarrantiesListWarrantyBasic_ addWarrantiesItem(WarrantyBasic warrantiesItem) {
    if (this.warranties == null) {
      this.warranties = new ArrayList<WarrantyBasic>();
    }
    this.warranties.add(warrantiesItem);
    return this;
  }

  /**
   * Get warranties
   * @return warranties
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<WarrantyBasic> getWarranties() {
    return warranties;
  }

  public void setWarranties(List<WarrantyBasic> warranties) {
    this.warranties = warranties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WarrantiesListWarrantyBasic_ warrantiesListWarrantyBasic_ = (WarrantiesListWarrantyBasic_) o;
    return Objects.equals(this.count, warrantiesListWarrantyBasic_.count) &&
        Objects.equals(this.warranties, warrantiesListWarrantyBasic_.warranties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, warranties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WarrantiesListWarrantyBasic_ {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    warranties: ").append(toIndentedString(warranties)).append("\n");
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
