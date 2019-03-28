package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.JustId;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Offer identifier
 */
@ApiModel(description = "Offer identifier")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class OfferReference   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("external")
  private JustId external = null;

  public OfferReference id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "3213213", required = true, value = "")
  @NotNull

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public OfferReference name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Offer name
   * @return name
  **/
  @ApiModelProperty(example = "Name of purchased offer", required = true, value = "Offer name")
  @NotNull

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OfferReference external(JustId external) {
    this.external = external;
    return this;
  }

  /**
   * Get external
   * @return external
  **/
  @ApiModelProperty(value = "")

  @Valid
  public JustId getExternal() {
    return external;
  }

  public void setExternal(JustId external) {
    this.external = external;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferReference offerReference = (OfferReference) o;
    return Objects.equals(this.id, offerReference.id) &&
        Objects.equals(this.name, offerReference.name) &&
        Objects.equals(this.external, offerReference.external);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, external);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferReference {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    external: ").append(toIndentedString(external)).append("\n");
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
