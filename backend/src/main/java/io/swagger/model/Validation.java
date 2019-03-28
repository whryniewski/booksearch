package io.swagger.model;

import java.time.OffsetDateTime;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ValidationError;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Validation
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class Validation   {
  @JsonProperty("errors")
  @Valid
  private List<ValidationError> errors = new ArrayList<ValidationError>();

  @JsonProperty("validatedAt")
  private OffsetDateTime validatedAt = null;

  public Validation errors(List<ValidationError> errors) {
    this.errors = errors;
    return this;
  }

  public Validation addErrorsItem(ValidationError errorsItem) {
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * Get errors
   * @return errors
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull
  @Valid
  public List<ValidationError> getErrors() {
    return errors;
  }

  public void setErrors(List<ValidationError> errors) {
    this.errors = errors;
  }

  public Validation validatedAt(OffsetDateTime validatedAt) {
    this.validatedAt = validatedAt;
    return this;
  }

  /**
   * Get validatedAt
   * @return validatedAt
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OffsetDateTime getValidatedAt() {
    return validatedAt;
  }

  public void setValidatedAt(OffsetDateTime validatedAt) {
    this.validatedAt = validatedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Validation validation = (Validation) o;
    return Objects.equals(this.errors, validation.errors) &&
        Objects.equals(this.validatedAt, validation.validatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, validatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Validation {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    validatedAt: ").append(toIndentedString(validatedAt)).append("\n");
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
