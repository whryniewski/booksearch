package pl.whr.booksearch.service.allegro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * DisputeAttachment
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class DisputeAttachment   {
  @JsonProperty("fileName")
  private String fileName = null;

  @JsonProperty("url")
  private String url = null;

  public DisputeAttachment fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

  /**
   * Get fileName
   * @return fileName
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=255)   public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public DisputeAttachment url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Direct link to the attachment
   * @return url
  **/
  @ApiModelProperty(example = "https://upload.allegro.pl/sale/dispute-attachments/eeed0007-4404-4176-a1eb-11d26f056c0d", required = true, value = "Direct link to the attachment")
  @NotNull

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisputeAttachment disputeAttachment = (DisputeAttachment) o;
    return Objects.equals(this.fileName, disputeAttachment.fileName) &&
        Objects.equals(this.url, disputeAttachment.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileName, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisputeAttachment {\n");
    
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
