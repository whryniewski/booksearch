package pl.whr.booksearch.service.allegro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Order events list
 */
@ApiModel(description = "Order events list")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class OrderEventsList   {
  @JsonProperty("events")
  @Valid
  private List<OrderEvent> events = new ArrayList<OrderEvent>();

  public OrderEventsList events(List<OrderEvent> events) {
    this.events = events;
    return this;
  }

  public OrderEventsList addEventsItem(OrderEvent eventsItem) {
    this.events.add(eventsItem);
    return this;
  }

  /**
   * Get events
   * @return events
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull
  @Valid
  public List<OrderEvent> getEvents() {
    return events;
  }

  public void setEvents(List<OrderEvent> events) {
    this.events = events;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderEventsList orderEventsList = (OrderEventsList) o;
    return Objects.equals(this.events, orderEventsList.events);
  }

  @Override
  public int hashCode() {
    return Objects.hash(events);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderEventsList {\n");
    
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
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
