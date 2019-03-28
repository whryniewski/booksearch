package pl.whr.booksearch.service.allegro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * AverageRates
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class AverageRates   {
  @JsonProperty("delivery")
  private Double delivery = null;

  @JsonProperty("deliveryCost")
  private Double deliveryCost = null;

  @JsonProperty("description")
  private Double description = null;

  @JsonProperty("service")
  private Double service = null;

  public AverageRates delivery(Double delivery) {
    this.delivery = delivery;
    return this;
  }

  /**
   * Average value of delivery rate
   * minimum: 0
   * maximum: 5
   * @return delivery
  **/
  @ApiModelProperty(example = "4.7", value = "Average value of delivery rate")

@DecimalMin("0") @DecimalMax("5")   public Double getDelivery() {
    return delivery;
  }

  public void setDelivery(Double delivery) {
    this.delivery = delivery;
  }

  public AverageRates deliveryCost(Double deliveryCost) {
    this.deliveryCost = deliveryCost;
    return this;
  }

  /**
   * Average value of delivery cost rate
   * minimum: 0
   * maximum: 5
   * @return deliveryCost
  **/
  @ApiModelProperty(example = "5", value = "Average value of delivery cost rate")

@DecimalMin("0") @DecimalMax("5")   public Double getDeliveryCost() {
    return deliveryCost;
  }

  public void setDeliveryCost(Double deliveryCost) {
    this.deliveryCost = deliveryCost;
  }

  public AverageRates description(Double description) {
    this.description = description;
    return this;
  }

  /**
   * Average value of description rate
   * minimum: 0
   * maximum: 5
   * @return description
  **/
  @ApiModelProperty(example = "4.5", value = "Average value of description rate")

@DecimalMin("0") @DecimalMax("5")   public Double getDescription() {
    return description;
  }

  public void setDescription(Double description) {
    this.description = description;
  }

  public AverageRates service(Double service) {
    this.service = service;
    return this;
  }

  /**
   * Average value of service rate
   * minimum: 0
   * maximum: 5
   * @return service
  **/
  @ApiModelProperty(example = "4.8", value = "Average value of service rate")

@DecimalMin("0") @DecimalMax("5")   public Double getService() {
    return service;
  }

  public void setService(Double service) {
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
    AverageRates averageRates = (AverageRates) o;
    return Objects.equals(this.delivery, averageRates.delivery) &&
        Objects.equals(this.deliveryCost, averageRates.deliveryCost) &&
        Objects.equals(this.description, averageRates.description) &&
        Objects.equals(this.service, averageRates.service);
  }

  @Override
  public int hashCode() {
    return Objects.hash(delivery, deliveryCost, description, service);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AverageRates {\n");
    
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
