package pl.whr.booksearch.service.allegro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

/**
 * VariantSetsVariantSet
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class VariantSetsVariantSet   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  public VariantSetsVariantSet id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Variant set id.
   * @return id
  **/
  @ApiModelProperty(value = "Variant set id.")

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public VariantSetsVariantSet name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Variant set name.
   * @return name
  **/
  @ApiModelProperty(value = "Variant set name.")

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VariantSetsVariantSet variantSetsVariantSet = (VariantSetsVariantSet) o;
    return Objects.equals(this.id, variantSetsVariantSet.id) &&
        Objects.equals(this.name, variantSetsVariantSet.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariantSetsVariantSet {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
