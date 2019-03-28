package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ChangePriceInput;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The change price command&#x27;s input data
 */
@ApiModel(description = "The change price command's input data")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class ChangePriceWithoutOutput   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("input")
  private ChangePriceInput input = null;

  public ChangePriceWithoutOutput id(String id) {
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

  public ChangePriceWithoutOutput input(ChangePriceInput input) {
    this.input = input;
    return this;
  }

  /**
   * Get input
   * @return input
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
  public ChangePriceInput getInput() {
    return input;
  }

  public void setInput(ChangePriceInput input) {
    this.input = input;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChangePriceWithoutOutput changePriceWithoutOutput = (ChangePriceWithoutOutput) o;
    return Objects.equals(this.id, changePriceWithoutOutput.id) &&
        Objects.equals(this.input, changePriceWithoutOutput.input);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, input);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangePriceWithoutOutput {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
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
