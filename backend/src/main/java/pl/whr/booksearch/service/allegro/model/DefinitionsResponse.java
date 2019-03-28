package pl.whr.booksearch.service.allegro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * DefinitionsResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class DefinitionsResponse   {
  @JsonProperty("definitions")
  @Valid
  private List<FullDefinitionResponse> definitions = null;

  public DefinitionsResponse definitions(List<FullDefinitionResponse> definitions) {
    this.definitions = definitions;
    return this;
  }

  public DefinitionsResponse addDefinitionsItem(FullDefinitionResponse definitionsItem) {
    if (this.definitions == null) {
      this.definitions = new ArrayList<FullDefinitionResponse>();
    }
    this.definitions.add(definitionsItem);
    return this;
  }

  /**
   * Get definitions
   * @return definitions
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<FullDefinitionResponse> getDefinitions() {
    return definitions;
  }

  public void setDefinitions(List<FullDefinitionResponse> definitions) {
    this.definitions = definitions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DefinitionsResponse definitionsResponse = (DefinitionsResponse) o;
    return Objects.equals(this.definitions, definitionsResponse.definitions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(definitions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DefinitionsResponse {\n");
    
    sb.append("    definitions: ").append(toIndentedString(definitions)).append("\n");
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
