package pl.whr.booksearch.service.allegro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * InlineResponse2001
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class InlineResponse2001   {
  @JsonProperty("deliveryMethods")
  @Valid
  private List<InlineResponse2001DeliveryMethods> deliveryMethods = null;

  public InlineResponse2001 deliveryMethods(List<InlineResponse2001DeliveryMethods> deliveryMethods) {
    this.deliveryMethods = deliveryMethods;
    return this;
  }

  public InlineResponse2001 addDeliveryMethodsItem(InlineResponse2001DeliveryMethods deliveryMethodsItem) {
    if (this.deliveryMethods == null) {
      this.deliveryMethods = new ArrayList<InlineResponse2001DeliveryMethods>();
    }
    this.deliveryMethods.add(deliveryMethodsItem);
    return this;
  }

  /**
   * Get deliveryMethods
   * @return deliveryMethods
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<InlineResponse2001DeliveryMethods> getDeliveryMethods() {
    return deliveryMethods;
  }

  public void setDeliveryMethods(List<InlineResponse2001DeliveryMethods> deliveryMethods) {
    this.deliveryMethods = deliveryMethods;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2001 inlineResponse2001 = (InlineResponse2001) o;
    return Objects.equals(this.deliveryMethods, inlineResponse2001.deliveryMethods);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliveryMethods);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2001 {\n");
    
    sb.append("    deliveryMethods: ").append(toIndentedString(deliveryMethods)).append("\n");
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
