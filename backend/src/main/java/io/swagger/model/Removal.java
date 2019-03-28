package io.swagger.model;

import java.time.OffsetDateTime;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.RemovalRequest;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Removal
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class Removal   {
  @JsonProperty("possibleTo")
  private OffsetDateTime possibleTo = null;

  @JsonProperty("request")
  private RemovalRequest request = null;

  public Removal possibleTo(OffsetDateTime possibleTo) {
    this.possibleTo = possibleTo;
    return this;
  }

  /**
   * Date until a removal request can be submitted in ISO 8601 format
   * @return possibleTo
  **/
  @ApiModelProperty(required = true, value = "Date until a removal request can be submitted in ISO 8601 format")
  @NotNull

  @Valid
  public OffsetDateTime getPossibleTo() {
    return possibleTo;
  }

  public void setPossibleTo(OffsetDateTime possibleTo) {
    this.possibleTo = possibleTo;
  }

  public Removal request(RemovalRequest request) {
    this.request = request;
    return this;
  }

  /**
   * Get request
   * @return request
  **/
  @ApiModelProperty(value = "")

  @Valid
  public RemovalRequest getRequest() {
    return request;
  }

  public void setRequest(RemovalRequest request) {
    this.request = request;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Removal removal = (Removal) o;
    return Objects.equals(this.possibleTo, removal.possibleTo) &&
        Objects.equals(this.request, removal.request);
  }

  @Override
  public int hashCode() {
    return Objects.hash(possibleTo, request);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Removal {\n");
    
    sb.append("    possibleTo: ").append(toIndentedString(possibleTo)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
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
