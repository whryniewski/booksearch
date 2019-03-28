package pl.whr.booksearch.service.allegro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * The description section cannot have more than 40000 bytes in length.
 */
@ApiModel(description = "The description section cannot have more than 40000 bytes in length.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class OfferDescription   {
  @JsonProperty("sections")
  @Valid
  private List<DescriptionSection> sections = null;

  public OfferDescription sections(List<DescriptionSection> sections) {
    this.sections = sections;
    return this;
  }

  public OfferDescription addSectionsItem(DescriptionSection sectionsItem) {
    if (this.sections == null) {
      this.sections = new ArrayList<DescriptionSection>();
    }
    this.sections.add(sectionsItem);
    return this;
  }

  /**
   * Get sections
   * @return sections
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<DescriptionSection> getSections() {
    return sections;
  }

  public void setSections(List<DescriptionSection> sections) {
    this.sections = sections;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferDescription offerDescription = (OfferDescription) o;
    return Objects.equals(this.sections, offerDescription.sections);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sections);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferDescription {\n");
    
    sb.append("    sections: ").append(toIndentedString(sections)).append("\n");
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
