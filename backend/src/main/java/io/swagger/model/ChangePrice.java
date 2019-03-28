package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ChangePriceInput;
import io.swagger.model.CommandOutput;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The change price command with its input and output data
 */
@ApiModel(description = "The change price command with its input and output data")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class ChangePrice   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("input")
  private ChangePriceInput input = null;

  @JsonProperty("output")
  private CommandOutput output = null;

  public ChangePrice id(String id) {
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

  public ChangePrice input(ChangePriceInput input) {
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

  public ChangePrice output(CommandOutput output) {
    this.output = output;
    return this;
  }

  /**
   * Get output
   * @return output
  **/
  @ApiModelProperty(value = "")

  @Valid
  public CommandOutput getOutput() {
    return output;
  }

  public void setOutput(CommandOutput output) {
    this.output = output;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChangePrice changePrice = (ChangePrice) o;
    return Objects.equals(this.id, changePrice.id) &&
        Objects.equals(this.input, changePrice.input) &&
        Objects.equals(this.output, changePrice.output);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, input, output);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangePrice {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    output: ").append(toIndentedString(output)).append("\n");
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
