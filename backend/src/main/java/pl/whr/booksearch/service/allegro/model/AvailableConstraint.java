package pl.whr.booksearch.service.allegro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * AvailableConstraint
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class AvailableConstraint   {
  @JsonProperty("type")
  private String type = null;

  @JsonProperty("availableDeliveryMethods")
  @Valid
  private List<String> availableDeliveryMethods = null;

  public AvailableConstraint type(String type) {
    this.type = type;
    return this;
  }

  /**
   * One of the type COUNTRY_SAME_QUANTITY or COUNTRY_DELIVERY_SAME_QUANTITY
   * @return type
  **/
  @ApiModelProperty(value = "One of the type COUNTRY_SAME_QUANTITY or COUNTRY_DELIVERY_SAME_QUANTITY")

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public AvailableConstraint availableDeliveryMethods(List<String> availableDeliveryMethods) {
    this.availableDeliveryMethods = availableDeliveryMethods;
    return this;
  }

  public AvailableConstraint addAvailableDeliveryMethodsItem(String availableDeliveryMethodsItem) {
    if (this.availableDeliveryMethods == null) {
      this.availableDeliveryMethods = new ArrayList<String>();
    }
    this.availableDeliveryMethods.add(availableDeliveryMethodsItem);
    return this;
  }

  /**
   * Get availableDeliveryMethods
   * @return availableDeliveryMethods
  **/
  @ApiModelProperty(value = "")

  public List<String> getAvailableDeliveryMethods() {
    return availableDeliveryMethods;
  }

  public void setAvailableDeliveryMethods(List<String> availableDeliveryMethods) {
    this.availableDeliveryMethods = availableDeliveryMethods;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvailableConstraint availableConstraint = (AvailableConstraint) o;
    return Objects.equals(this.type, availableConstraint.type) &&
        Objects.equals(this.availableDeliveryMethods, availableConstraint.availableDeliveryMethods);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, availableDeliveryMethods);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailableConstraint {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    availableDeliveryMethods: ").append(toIndentedString(availableDeliveryMethods)).append("\n");
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
