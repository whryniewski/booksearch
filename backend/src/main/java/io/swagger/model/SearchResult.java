package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Pos;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SearchResult
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class SearchResult   {
  @JsonProperty("posList")
  @Valid
  private List<Pos> posList = null;

  public SearchResult posList(List<Pos> posList) {
    this.posList = posList;
    return this;
  }

  public SearchResult addPosListItem(Pos posListItem) {
    if (this.posList == null) {
      this.posList = new ArrayList<Pos>();
    }
    this.posList.add(posListItem);
    return this;
  }

  /**
   * Get posList
   * @return posList
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<Pos> getPosList() {
    return posList;
  }

  public void setPosList(List<Pos> posList) {
    this.posList = posList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchResult searchResult = (SearchResult) o;
    return Objects.equals(this.posList, searchResult.posList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(posList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchResult {\n");
    
    sb.append("    posList: ").append(toIndentedString(posList)).append("\n");
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
