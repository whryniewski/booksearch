package pl.whr.booksearch.service.allegro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * AdditionalServiceResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class AdditionalServiceResponse   {
  @JsonProperty("configurations")
  @Valid
  private List<ModelConfiguration> configurations = null;

  @JsonProperty("definition")
  private BasicDefinitionResponse definition = null;

  @JsonProperty("description")
  private String description = null;

  public AdditionalServiceResponse configurations(List<ModelConfiguration> configurations) {
    this.configurations = configurations;
    return this;
  }

  public AdditionalServiceResponse addConfigurationsItem(ModelConfiguration configurationsItem) {
    if (this.configurations == null) {
      this.configurations = new ArrayList<ModelConfiguration>();
    }
    this.configurations.add(configurationsItem);
    return this;
  }

  /**
   * Get configurations
   * @return configurations
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<ModelConfiguration> getConfigurations() {
    return configurations;
  }

  public void setConfigurations(List<ModelConfiguration> configurations) {
    this.configurations = configurations;
  }

  public AdditionalServiceResponse definition(BasicDefinitionResponse definition) {
    this.definition = definition;
    return this;
  }

  /**
   * Get definition
   * @return definition
  **/
  @ApiModelProperty(value = "")

  @Valid
  public BasicDefinitionResponse getDefinition() {
    return definition;
  }

  public void setDefinition(BasicDefinitionResponse definition) {
    this.definition = definition;
  }

  public AdditionalServiceResponse description(String description) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdditionalServiceResponse additionalServiceResponse = (AdditionalServiceResponse) o;
    return Objects.equals(this.configurations, additionalServiceResponse.configurations) &&
        Objects.equals(this.definition, additionalServiceResponse.definition) &&
        Objects.equals(this.description, additionalServiceResponse.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configurations, definition, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalServiceResponse {\n");
    
    sb.append("    configurations: ").append(toIndentedString(configurations)).append("\n");
    sb.append("    definition: ").append(toIndentedString(definition)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
