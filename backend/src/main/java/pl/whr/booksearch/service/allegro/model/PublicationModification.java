package pl.whr.booksearch.service.allegro.model;

import java.time.OffsetDateTime;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * Contains publication&#x27;s fields to change
 */
@ApiModel(description = "Contains publication's fields to change")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class PublicationModification   {
  /**
   * Action to perform
   */
  public enum ActionEnum {
    ACTIVATE("ACTIVATE"),
    
    END("END");

    private String value;

    ActionEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ActionEnum fromValue(String text) {
      for (ActionEnum b : ActionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("action")
  private ActionEnum action = null;

  @JsonProperty("scheduledFor")
  private OffsetDateTime scheduledFor = null;

  public PublicationModification action(ActionEnum action) {
    this.action = action;
    return this;
  }

  /**
   * Action to perform
   * @return action
  **/
  @ApiModelProperty(value = "Action to perform")

  public ActionEnum getAction() {
    return action;
  }

  public void setAction(ActionEnum action) {
    this.action = action;
  }

  public PublicationModification scheduledFor(OffsetDateTime scheduledFor) {
    this.scheduledFor = scheduledFor;
    return this;
  }

  /**
   * Date and time for scheduling ACTIVATE action, will be ignored for another actions
   * @return scheduledFor
  **/
  @ApiModelProperty(value = "Date and time for scheduling ACTIVATE action, will be ignored for another actions")

  @Valid
  public OffsetDateTime getScheduledFor() {
    return scheduledFor;
  }

  public void setScheduledFor(OffsetDateTime scheduledFor) {
    this.scheduledFor = scheduledFor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublicationModification publicationModification = (PublicationModification) o;
    return Objects.equals(this.action, publicationModification.action) &&
        Objects.equals(this.scheduledFor, publicationModification.scheduledFor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, scheduledFor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublicationModification {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    scheduledFor: ").append(toIndentedString(scheduledFor)).append("\n");
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
