package pl.whr.booksearch.service.allegro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Request body to add message to the dispute. Presence of text or attachment fields or both is required.
 */
@ApiModel(description = "Request body to add message to the dispute. Presence of text or attachment fields or both is required.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class MessageRequest   {
  @JsonProperty("text")
  private String text = null;

  @JsonProperty("attachment")
  private DisputeAttachmentId attachment = null;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    REGULAR("REGULAR"),
    
    END_REQUEST("END_REQUEST");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("type")
  private TypeEnum type = null;

  public MessageRequest text(String text) {
    this.text = text;
    return this;
  }

  /**
   * Get text
   * @return text
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=20000)   public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public MessageRequest attachment(DisputeAttachmentId attachment) {
    this.attachment = attachment;
    return this;
  }

  /**
   * Get attachment
   * @return attachment
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
  public DisputeAttachmentId getAttachment() {
    return attachment;
  }

  public void setAttachment(DisputeAttachmentId attachment) {
    this.attachment = attachment;
  }

  public MessageRequest type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageRequest messageRequest = (MessageRequest) o;
    return Objects.equals(this.text, messageRequest.text) &&
        Objects.equals(this.attachment, messageRequest.attachment) &&
        Objects.equals(this.type, messageRequest.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, attachment, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageRequest {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    attachment: ").append(toIndentedString(attachment)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
