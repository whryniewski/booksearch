package pl.whr.booksearch.service.allegro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * LineItemIdMappings
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class LineItemIdMappings   {
  @JsonProperty("mappings")
  @Valid
  private List<LineItemIdMappingsMappings> mappings = null;

  public LineItemIdMappings mappings(List<LineItemIdMappingsMappings> mappings) {
    this.mappings = mappings;
    return this;
  }

  public LineItemIdMappings addMappingsItem(LineItemIdMappingsMappings mappingsItem) {
    if (this.mappings == null) {
      this.mappings = new ArrayList<LineItemIdMappingsMappings>();
    }
    this.mappings.add(mappingsItem);
    return this;
  }

  /**
   * Get mappings
   * @return mappings
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<LineItemIdMappingsMappings> getMappings() {
    return mappings;
  }

  public void setMappings(List<LineItemIdMappingsMappings> mappings) {
    this.mappings = mappings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LineItemIdMappings lineItemIdMappings = (LineItemIdMappings) o;
    return Objects.equals(this.mappings, lineItemIdMappings.mappings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mappings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineItemIdMappings {\n");
    
    sb.append("    mappings: ").append(toIndentedString(mappings)).append("\n");
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
