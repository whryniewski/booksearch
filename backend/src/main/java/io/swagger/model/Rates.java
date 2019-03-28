package io.swagger.model;

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
 * Rates
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class Rates   {
  /**
   * Delivery rate value
   */
  public enum DeliveryEnum {
    NUMBER_1(1),
    
    NUMBER_2(2),
    
    NUMBER_3(3),
    
    NUMBER_4(4),
    
    NUMBER_5(5);

    private Integer value;

    DeliveryEnum(Integer value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DeliveryEnum fromValue(String text) {
      for (DeliveryEnum b : DeliveryEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("delivery")
  private DeliveryEnum delivery = null;

  /**
   * Delivery cost rate value
   */
  public enum DeliveryCostEnum {
    NUMBER_1(1),
    
    NUMBER_2(2),
    
    NUMBER_3(3),
    
    NUMBER_4(4),
    
    NUMBER_5(5);

    private Integer value;

    DeliveryCostEnum(Integer value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DeliveryCostEnum fromValue(String text) {
      for (DeliveryCostEnum b : DeliveryCostEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("deliveryCost")
  private DeliveryCostEnum deliveryCost = null;

  /**
   * Description rate value
   */
  public enum DescriptionEnum {
    NUMBER_1(1),
    
    NUMBER_2(2),
    
    NUMBER_3(3),
    
    NUMBER_4(4),
    
    NUMBER_5(5);

    private Integer value;

    DescriptionEnum(Integer value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DescriptionEnum fromValue(String text) {
      for (DescriptionEnum b : DescriptionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("description")
  private DescriptionEnum description = null;

  /**
   * Service rate value
   */
  public enum ServiceEnum {
    NUMBER_1(1),
    
    NUMBER_2(2),
    
    NUMBER_3(3),
    
    NUMBER_4(4),
    
    NUMBER_5(5);

    private Integer value;

    ServiceEnum(Integer value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ServiceEnum fromValue(String text) {
      for (ServiceEnum b : ServiceEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("service")
  private ServiceEnum service = null;

  public Rates delivery(DeliveryEnum delivery) {
    this.delivery = delivery;
    return this;
  }

  /**
   * Delivery rate value
   * @return delivery
  **/
  @ApiModelProperty(example = "5", required = true, value = "Delivery rate value")
  @NotNull

  public DeliveryEnum getDelivery() {
    return delivery;
  }

  public void setDelivery(DeliveryEnum delivery) {
    this.delivery = delivery;
  }

  public Rates deliveryCost(DeliveryCostEnum deliveryCost) {
    this.deliveryCost = deliveryCost;
    return this;
  }

  /**
   * Delivery cost rate value
   * @return deliveryCost
  **/
  @ApiModelProperty(example = "5", required = true, value = "Delivery cost rate value")
  @NotNull

  public DeliveryCostEnum getDeliveryCost() {
    return deliveryCost;
  }

  public void setDeliveryCost(DeliveryCostEnum deliveryCost) {
    this.deliveryCost = deliveryCost;
  }

  public Rates description(DescriptionEnum description) {
    this.description = description;
    return this;
  }

  /**
   * Description rate value
   * @return description
  **/
  @ApiModelProperty(example = "5", required = true, value = "Description rate value")
  @NotNull

  public DescriptionEnum getDescription() {
    return description;
  }

  public void setDescription(DescriptionEnum description) {
    this.description = description;
  }

  public Rates service(ServiceEnum service) {
    this.service = service;
    return this;
  }

  /**
   * Service rate value
   * @return service
  **/
  @ApiModelProperty(example = "5", required = true, value = "Service rate value")
  @NotNull

  public ServiceEnum getService() {
    return service;
  }

  public void setService(ServiceEnum service) {
    this.service = service;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Rates rates = (Rates) o;
    return Objects.equals(this.delivery, rates.delivery) &&
        Objects.equals(this.deliveryCost, rates.deliveryCost) &&
        Objects.equals(this.description, rates.description) &&
        Objects.equals(this.service, rates.service);
  }

  @Override
  public int hashCode() {
    return Objects.hash(delivery, deliveryCost, description, service);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Rates {\n");
    
    sb.append("    delivery: ").append(toIndentedString(delivery)).append("\n");
    sb.append("    deliveryCost: ").append(toIndentedString(deliveryCost)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
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
