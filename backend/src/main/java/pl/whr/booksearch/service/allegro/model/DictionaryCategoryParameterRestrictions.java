package pl.whr.booksearch.service.allegro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

/**
 * DictionaryCategoryParameterRestrictions
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class DictionaryCategoryParameterRestrictions   {
  @JsonProperty("multipleChoices")
  private Boolean multipleChoices = null;

  public DictionaryCategoryParameterRestrictions multipleChoices(Boolean multipleChoices) {
    this.multipleChoices = multipleChoices;
    return this;
  }

  /**
   * Get multipleChoices
   * @return multipleChoices
  **/
  @ApiModelProperty(value = "")

  public Boolean isMultipleChoices() {
    return multipleChoices;
  }

  public void setMultipleChoices(Boolean multipleChoices) {
    this.multipleChoices = multipleChoices;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DictionaryCategoryParameterRestrictions dictionaryCategoryParameterRestrictions = (DictionaryCategoryParameterRestrictions) o;
    return Objects.equals(this.multipleChoices, dictionaryCategoryParameterRestrictions.multipleChoices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(multipleChoices);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DictionaryCategoryParameterRestrictions {\n");
    
    sb.append("    multipleChoices: ").append(toIndentedString(multipleChoices)).append("\n");
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
