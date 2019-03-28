package io.swagger.model;

import java.time.OffsetDateTime;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AvailableConstraint;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FullDefinitionResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class FullDefinitionResponse   {
  @JsonProperty("availableConstraints")
  @Valid
  private List<AvailableConstraint> availableConstraints = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("updatedAt")
  private OffsetDateTime updatedAt = null;

  public FullDefinitionResponse availableConstraints(List<AvailableConstraint> availableConstraints) {
    this.availableConstraints = availableConstraints;
    return this;
  }

  public FullDefinitionResponse addAvailableConstraintsItem(AvailableConstraint availableConstraintsItem) {
    if (this.availableConstraints == null) {
      this.availableConstraints = new ArrayList<AvailableConstraint>();
    }
    this.availableConstraints.add(availableConstraintsItem);
    return this;
  }

  /**
   * Get availableConstraints
   * @return availableConstraints
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<AvailableConstraint> getAvailableConstraints() {
    return availableConstraints;
  }

  public void setAvailableConstraints(List<AvailableConstraint> availableConstraints) {
    this.availableConstraints = availableConstraints;
  }

  public FullDefinitionResponse description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public FullDefinitionResponse id(String id) {
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

  public FullDefinitionResponse name(String name) {
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

  public FullDefinitionResponse updatedAt(OffsetDateTime updatedAt) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FullDefinitionResponse fullDefinitionResponse = (FullDefinitionResponse) o;
    return Objects.equals(this.availableConstraints, fullDefinitionResponse.availableConstraints) &&
        Objects.equals(this.description, fullDefinitionResponse.description) &&
        Objects.equals(this.id, fullDefinitionResponse.id) &&
        Objects.equals(this.name, fullDefinitionResponse.name) &&
        Objects.equals(this.updatedAt, fullDefinitionResponse.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableConstraints, description, id, name, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FullDefinitionResponse {\n");
    
    sb.append("    availableConstraints: ").append(toIndentedString(availableConstraints)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
