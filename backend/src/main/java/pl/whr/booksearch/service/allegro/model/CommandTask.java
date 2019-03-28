package pl.whr.booksearch.service.allegro.model;

import java.time.OffsetDateTime;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * Status of single command task
 */
@ApiModel(description = "Status of single command task")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class CommandTask   {
  @JsonProperty("field")
  private String field = null;

  @JsonProperty("finishedAt")
  private OffsetDateTime finishedAt = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("offer")
  private OfferId offer = null;

  @JsonProperty("scheduledAt")
  private OffsetDateTime scheduledAt = null;

  @JsonProperty("status")
  private String status = null;

  public CommandTask field(String field) {
    this.field = field;
    return this;
  }

  /**
   * Modified field as JSON path
   * @return field
  **/
  @ApiModelProperty(value = "Modified field as JSON path")

  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public CommandTask finishedAt(OffsetDateTime finishedAt) {
    this.finishedAt = finishedAt;
    return this;
  }

  /**
   * Date of completion of the modification. Format (ISO 8601) - yyyy-MM-dd'T'HH:mm:ss.SSSZ
   * @return finishedAt
  **/
  @ApiModelProperty(value = "Date of completion of the modification. Format (ISO 8601) - yyyy-MM-dd'T'HH:mm:ss.SSSZ")

  @Valid
  public OffsetDateTime getFinishedAt() {
    return finishedAt;
  }

  public void setFinishedAt(OffsetDateTime finishedAt) {
    this.finishedAt = finishedAt;
  }

  public CommandTask message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Fail reason description
   * @return message
  **/
  @ApiModelProperty(value = "Fail reason description")

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public CommandTask offer(OfferId offer) {
    this.offer = offer;
    return this;
  }

  /**
   * Get offer
   * @return offer
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OfferId getOffer() {
    return offer;
  }

  public void setOffer(OfferId offer) {
    this.offer = offer;
  }

  public CommandTask scheduledAt(OffsetDateTime scheduledAt) {
    this.scheduledAt = scheduledAt;
    return this;
  }

  /**
   * Date of the modification schedule. Format (ISO 8601) - yyyy-MM-dd'T'HH:mm:ss.SSSZ
   * @return scheduledAt
  **/
  @ApiModelProperty(value = "Date of the modification schedule. Format (ISO 8601) - yyyy-MM-dd'T'HH:mm:ss.SSSZ")

  @Valid
  public OffsetDateTime getScheduledAt() {
    return scheduledAt;
  }

  public void setScheduledAt(OffsetDateTime scheduledAt) {
    this.scheduledAt = scheduledAt;
  }

  public CommandTask status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Available statuses: NEW, SUCCESS, FAIL
   * @return status
  **/
  @ApiModelProperty(value = "Available statuses: NEW, SUCCESS, FAIL")

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommandTask commandTask = (CommandTask) o;
    return Objects.equals(this.field, commandTask.field) &&
        Objects.equals(this.finishedAt, commandTask.finishedAt) &&
        Objects.equals(this.message, commandTask.message) &&
        Objects.equals(this.offer, commandTask.offer) &&
        Objects.equals(this.scheduledAt, commandTask.scheduledAt) &&
        Objects.equals(this.status, commandTask.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, finishedAt, message, offer, scheduledAt, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommandTask {\n");
    
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    finishedAt: ").append(toIndentedString(finishedAt)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    offer: ").append(toIndentedString(offer)).append("\n");
    sb.append("    scheduledAt: ").append(toIndentedString(scheduledAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
