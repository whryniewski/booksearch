package io.swagger.model;

import java.time.OffsetDateTime;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.CheckoutFormStatus;
import io.swagger.model.OrderEventData;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Order event
 */
@ApiModel(description = "Order event")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class OrderEvent   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("order")
  private OrderEventData order = null;

  @JsonProperty("type")
  private CheckoutFormStatus type = null;

  @JsonProperty("occurredAt")
  private OffsetDateTime occurredAt = null;

  public OrderEvent id(String id) {
    this.id = id;
    return this;
  }

  /**
   * event id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "event id")
  @NotNull

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public OrderEvent order(OrderEventData order) {
    this.order = order;
    return this;
  }

  /**
   * Get order
   * @return order
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
  public OrderEventData getOrder() {
    return order;
  }

  public void setOrder(OrderEventData order) {
    this.order = order;
  }

  public OrderEvent type(CheckoutFormStatus type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
  public CheckoutFormStatus getType() {
    return type;
  }

  public void setType(CheckoutFormStatus type) {
    this.type = type;
  }

  public OrderEvent occurredAt(OffsetDateTime occurredAt) {
    this.occurredAt = occurredAt;
    return this;
  }

  /**
   * Date when the event occurred
   * @return occurredAt
  **/
  @ApiModelProperty(required = true, value = "Date when the event occurred")
  @NotNull

  @Valid
  public OffsetDateTime getOccurredAt() {
    return occurredAt;
  }

  public void setOccurredAt(OffsetDateTime occurredAt) {
    this.occurredAt = occurredAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderEvent orderEvent = (OrderEvent) o;
    return Objects.equals(this.id, orderEvent.id) &&
        Objects.equals(this.order, orderEvent.order) &&
        Objects.equals(this.type, orderEvent.type) &&
        Objects.equals(this.occurredAt, orderEvent.occurredAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, order, type, occurredAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderEvent {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    occurredAt: ").append(toIndentedString(occurredAt)).append("\n");
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
