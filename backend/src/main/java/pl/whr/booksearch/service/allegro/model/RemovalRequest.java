package pl.whr.booksearch.service.allegro.model;

import java.time.OffsetDateTime;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RemovalRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class RemovalRequest   {
  @JsonProperty("createdAt")
  private OffsetDateTime createdAt = null;

  @JsonProperty("message")
  private String message = null;

  public RemovalRequest createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Removal request creation datetime in ISO 8601 format
   * @return createdAt
  **/
  @ApiModelProperty(required = true, value = "Removal request creation datetime in ISO 8601 format")
  @NotNull

  @Valid
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public RemovalRequest message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Message containing explanation for removing rating
   * @return message
  **/
  @ApiModelProperty(required = true, value = "Message containing explanation for removing rating")
  @NotNull

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemovalRequest removalRequest = (RemovalRequest) o;
    return Objects.equals(this.createdAt, removalRequest.createdAt) &&
        Objects.equals(this.message, removalRequest.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemovalRequest {\n");
    
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
