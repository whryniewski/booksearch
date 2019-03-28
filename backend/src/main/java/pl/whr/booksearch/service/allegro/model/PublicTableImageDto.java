package pl.whr.booksearch.service.allegro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PublicTableImageDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class PublicTableImageDto   {
  @JsonProperty("captions")
  @Valid
  private List<Caption> captions = new ArrayList<Caption>();

  @JsonProperty("url")
  private String url = null;

  public PublicTableImageDto captions(List<Caption> captions) {
    this.captions = captions;
    return this;
  }

  public PublicTableImageDto addCaptionsItem(Caption captionsItem) {
    this.captions.add(captionsItem);
    return this;
  }

  /**
   * Get captions
   * @return captions
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull
  @Valid
  public List<Caption> getCaptions() {
    return captions;
  }

  public void setCaptions(List<Caption> captions) {
    this.captions = captions;
  }

  public PublicTableImageDto url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(required = true, value = "")
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
    PublicTableImageDto publicTableImageDto = (PublicTableImageDto) o;
    return Objects.equals(this.captions, publicTableImageDto.captions) &&
        Objects.equals(this.url, publicTableImageDto.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(captions, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublicTableImageDto {\n");
    
    sb.append("    captions: ").append(toIndentedString(captions)).append("\n");
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
