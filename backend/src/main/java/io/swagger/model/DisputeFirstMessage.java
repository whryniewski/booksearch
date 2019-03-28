package io.swagger.model;

import java.time.OffsetDateTime;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.DisputeAttachment;
import io.swagger.model.DisputeAuthor;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Initial dispute message with text OR attachment OR both
 */
@ApiModel(description = "Initial dispute message with text OR attachment OR both")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class DisputeFirstMessage   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("text")
  private String text = null;

  @JsonProperty("attachment")
  private DisputeAttachment attachment = null;

  @JsonProperty("author")
  private DisputeAuthor author = null;

  @JsonProperty("createdAt")
  private OffsetDateTime createdAt = null;

  public DisputeFirstMessage id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public DisputeFirstMessage text(String text) {
    this.text = text;
    return this;
  }

  /**
   * Get text
   * @return text
  **/
  @ApiModelProperty(value = "")

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public DisputeFirstMessage attachment(DisputeAttachment attachment) {
    this.attachment = attachment;
    return this;
  }

  /**
   * Get attachment
   * @return attachment
  **/
  @ApiModelProperty(value = "")

  @Valid
  public DisputeAttachment getAttachment() {
    return attachment;
  }

  public void setAttachment(DisputeAttachment attachment) {
    this.attachment = attachment;
  }

  public DisputeFirstMessage author(DisputeAuthor author) {
    this.author = author;
    return this;
  }

  /**
   * Get author
   * @return author
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
  public DisputeAuthor getAuthor() {
    return author;
  }

  public void setAuthor(DisputeAuthor author) {
    this.author = author;
  }

  public DisputeFirstMessage createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisputeFirstMessage disputeFirstMessage = (DisputeFirstMessage) o;
    return Objects.equals(this.id, disputeFirstMessage.id) &&
        Objects.equals(this.text, disputeFirstMessage.text) &&
        Objects.equals(this.attachment, disputeFirstMessage.attachment) &&
        Objects.equals(this.author, disputeFirstMessage.author) &&
        Objects.equals(this.createdAt, disputeFirstMessage.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, text, attachment, author, createdAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisputeFirstMessage {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    attachment: ").append(toIndentedString(attachment)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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
