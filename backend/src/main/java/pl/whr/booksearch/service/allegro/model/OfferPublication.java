package pl.whr.booksearch.service.allegro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

/**
 * This section is available only for items with defined end of publication.
 */
@ApiModel(description = "This section is available only for items with defined end of publication.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class OfferPublication   {
  @JsonProperty("endingAt")
  private String endingAt = null;

  public OfferPublication endingAt(String endingAt) {
    this.endingAt = endingAt;
    return this;
  }

  /**
   * Publication ending time.
   * @return endingAt
  **/
  @ApiModelProperty(value = "Publication ending time.")

  public String getEndingAt() {
    return endingAt;
  }

  public void setEndingAt(String endingAt) {
    this.endingAt = endingAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferPublication offerPublication = (OfferPublication) o;
    return Objects.equals(this.endingAt, offerPublication.endingAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endingAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferPublication {\n");
    
    sb.append("    endingAt: ").append(toIndentedString(endingAt)).append("\n");
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
