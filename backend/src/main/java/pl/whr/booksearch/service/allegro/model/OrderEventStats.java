package pl.whr.booksearch.service.allegro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * Event statistics, currently contains only basic information about the latest event.
 */
@ApiModel(description = "Event statistics, currently contains only basic information about the latest event.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class OrderEventStats   {
  @JsonProperty("latestEvent")
  private LatestOrderEvent latestEvent = null;

  public OrderEventStats latestEvent(LatestOrderEvent latestEvent) {
    this.latestEvent = latestEvent;
    return this;
  }

  /**
   * Get latestEvent
   * @return latestEvent
  **/
  @ApiModelProperty(value = "")

  @Valid
  public LatestOrderEvent getLatestEvent() {
    return latestEvent;
  }

  public void setLatestEvent(LatestOrderEvent latestEvent) {
    this.latestEvent = latestEvent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderEventStats orderEventStats = (OrderEventStats) o;
    return Objects.equals(this.latestEvent, orderEventStats.latestEvent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(latestEvent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderEventStats {\n");
    
    sb.append("    latestEvent: ").append(toIndentedString(latestEvent)).append("\n");
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
