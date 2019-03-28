package pl.whr.booksearch.service.allegro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * DictionaryCategoryParameter
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class DictionaryCategoryParameter extends CategoryParameter  {
  @JsonProperty("type")
  private String type = "dictionary";

  @JsonProperty("restrictions")
  private DictionaryCategoryParameterRestrictions restrictions = null;

  @JsonProperty("dictionary")
  @Valid
  private List<DictionaryCategoryParameterDictionary> dictionary = null;

  public DictionaryCategoryParameter type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public DictionaryCategoryParameter restrictions(DictionaryCategoryParameterRestrictions restrictions) {
    this.restrictions = restrictions;
    return this;
  }

  /**
   * Get restrictions
   * @return restrictions
  **/
  @ApiModelProperty(value = "")

  @Valid
  public DictionaryCategoryParameterRestrictions getRestrictions() {
    return restrictions;
  }

  public void setRestrictions(DictionaryCategoryParameterRestrictions restrictions) {
    this.restrictions = restrictions;
  }

  public DictionaryCategoryParameter dictionary(List<DictionaryCategoryParameterDictionary> dictionary) {
    this.dictionary = dictionary;
    return this;
  }

  public DictionaryCategoryParameter addDictionaryItem(DictionaryCategoryParameterDictionary dictionaryItem) {
    if (this.dictionary == null) {
      this.dictionary = new ArrayList<DictionaryCategoryParameterDictionary>();
    }
    this.dictionary.add(dictionaryItem);
    return this;
  }

  /**
   * Get dictionary
   * @return dictionary
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<DictionaryCategoryParameterDictionary> getDictionary() {
    return dictionary;
  }

  public void setDictionary(List<DictionaryCategoryParameterDictionary> dictionary) {
    this.dictionary = dictionary;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DictionaryCategoryParameter dictionaryCategoryParameter = (DictionaryCategoryParameter) o;
    return Objects.equals(this.type, dictionaryCategoryParameter.type) &&
        Objects.equals(this.restrictions, dictionaryCategoryParameter.restrictions) &&
        Objects.equals(this.dictionary, dictionaryCategoryParameter.dictionary) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, restrictions, dictionary, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DictionaryCategoryParameter {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    restrictions: ").append(toIndentedString(restrictions)).append("\n");
    sb.append("    dictionary: ").append(toIndentedString(dictionary)).append("\n");
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
