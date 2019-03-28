package pl.whr.booksearch.service.allegro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * CategoryDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class CategoryDto   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("leaf")
  private Boolean leaf = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("options")
  private CategoryOptionsDto options = null;

  @JsonProperty("parent")
  private CategoryIdDto parent = null;

  public CategoryDto id(String id) {
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

  public CategoryDto leaf(Boolean leaf) {
    this.leaf = leaf;
    return this;
  }

  /**
   * Get leaf
   * @return leaf
  **/
  @ApiModelProperty(value = "")

  public Boolean isLeaf() {
    return leaf;
  }

  public void setLeaf(Boolean leaf) {
    this.leaf = leaf;
  }

  public CategoryDto name(String name) {
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

  public CategoryDto options(CategoryOptionsDto options) {
    this.options = options;
    return this;
  }

  /**
   * Get options
   * @return options
  **/
  @ApiModelProperty(value = "")

  @Valid
  public CategoryOptionsDto getOptions() {
    return options;
  }

  public void setOptions(CategoryOptionsDto options) {
    this.options = options;
  }

  public CategoryDto parent(CategoryIdDto parent) {
    this.parent = parent;
    return this;
  }

  /**
   * Get parent
   * @return parent
  **/
  @ApiModelProperty(value = "")

  @Valid
  public CategoryIdDto getParent() {
    return parent;
  }

  public void setParent(CategoryIdDto parent) {
    this.parent = parent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CategoryDto categoryDto = (CategoryDto) o;
    return Objects.equals(this.id, categoryDto.id) &&
        Objects.equals(this.leaf, categoryDto.leaf) &&
        Objects.equals(this.name, categoryDto.name) &&
        Objects.equals(this.options, categoryDto.options) &&
        Objects.equals(this.parent, categoryDto.parent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, leaf, name, options, parent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CategoryDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    leaf: ").append(toIndentedString(leaf)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
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
