package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AdditionalServiceDefinitionRequest;
import io.swagger.model.ModelConfiguration;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AdditionalServiceRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class AdditionalServiceRequest   {
  @JsonProperty("definition")
  private AdditionalServiceDefinitionRequest definition = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("configurations")
  @Valid
  private List<ModelConfiguration> configurations = new ArrayList<ModelConfiguration>();

  public AdditionalServiceRequest definition(AdditionalServiceDefinitionRequest definition) {
    this.definition = definition;
    return this;
  }

  /**
   * Get definition
   * @return definition
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
  public AdditionalServiceDefinitionRequest getDefinition() {
    return definition;
  }

  public void setDefinition(AdditionalServiceDefinitionRequest definition) {
    this.definition = definition;
  }

  public AdditionalServiceRequest description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=1000)   public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AdditionalServiceRequest configurations(List<ModelConfiguration> configurations) {
    this.configurations = configurations;
    return this;
  }

  public AdditionalServiceRequest addConfigurationsItem(ModelConfiguration configurationsItem) {
    this.configurations.add(configurationsItem);
    return this;
  }

  /**
   * Get configurations
   * @return configurations
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull
  @Valid
  public List<ModelConfiguration> getConfigurations() {
    return configurations;
  }

  public void setConfigurations(List<ModelConfiguration> configurations) {
    this.configurations = configurations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdditionalServiceRequest additionalServiceRequest = (AdditionalServiceRequest) o;
    return Objects.equals(this.definition, additionalServiceRequest.definition) &&
        Objects.equals(this.description, additionalServiceRequest.description) &&
        Objects.equals(this.configurations, additionalServiceRequest.configurations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(definition, description, configurations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalServiceRequest {\n");
    
    sb.append("    definition: ").append(toIndentedString(definition)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    configurations: ").append(toIndentedString(configurations)).append("\n");
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
