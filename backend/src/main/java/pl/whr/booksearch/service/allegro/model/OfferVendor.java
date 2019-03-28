package pl.whr.booksearch.service.allegro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

/**
 * This section is available only for advertisements, linking to external services.
 */
@ApiModel(description = "This section is available only for advertisements, linking to external services.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class OfferVendor   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("url")
  private String url = null;

  public OfferVendor id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Identifier of external service (OTOMOTO, OTODOM, CHARYTATYWNI_ALLEGRO).
   * @return id
  **/
  @ApiModelProperty(value = "Identifier of external service (OTOMOTO, OTODOM, CHARYTATYWNI_ALLEGRO).")

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public OfferVendor url(String url) {
    this.url = url;
    return this;
  }

  /**
   * URL to the web page of advertisement.
   * @return url
  **/
  @ApiModelProperty(value = "URL to the web page of advertisement.")

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
    OfferVendor offerVendor = (OfferVendor) o;
    return Objects.equals(this.id, offerVendor.id) &&
        Objects.equals(this.url, offerVendor.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferVendor {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
