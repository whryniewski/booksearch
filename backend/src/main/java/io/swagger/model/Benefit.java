package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.BenefitSpecification;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Benefit
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class Benefit   {
  @JsonProperty("specification")
  private BenefitSpecification specification = null;

  public Benefit specification(BenefitSpecification specification) {
    this.specification = specification;
    return this;
  }

  /**
   * Get specification
   * @return specification
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
  public BenefitSpecification getSpecification() {
    return specification;
  }

  public void setSpecification(BenefitSpecification specification) {
    this.specification = specification;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Benefit benefit = (Benefit) o;
    return Objects.equals(this.specification, benefit.specification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(specification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Benefit {\n");
    
    sb.append("    specification: ").append(toIndentedString(specification)).append("\n");
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
