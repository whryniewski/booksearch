package pl.whr.booksearch.service.allegro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * ConstraintCriteria
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class ConstraintCriteria   {
  @JsonProperty("country")
  private String country = null;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    SAME_QUANTITY("COUNTRY_SAME_QUANTITY"),
    
    DELIVERY_SAME_QUANTITY("COUNTRY_DELIVERY_SAME_QUANTITY");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("type")
  private TypeEnum type = null;

  @JsonProperty("deliveryMethods")
  @Valid
  private List<JustId> deliveryMethods = null;

  public ConstraintCriteria country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Get country
   * @return country
  **/
  @ApiModelProperty(value = "")

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public ConstraintCriteria type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")

  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public ConstraintCriteria deliveryMethods(List<JustId> deliveryMethods) {
    this.deliveryMethods = deliveryMethods;
    return this;
  }

  public ConstraintCriteria addDeliveryMethodsItem(JustId deliveryMethodsItem) {
    if (this.deliveryMethods == null) {
      this.deliveryMethods = new ArrayList<JustId>();
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
  public List<JustId> getDeliveryMethods() {
    return deliveryMethods;
  }

  public void setDeliveryMethods(List<JustId> deliveryMethods) {
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
    ConstraintCriteria constraintCriteria = (ConstraintCriteria) o;
    return Objects.equals(this.country, constraintCriteria.country) &&
        Objects.equals(this.type, constraintCriteria.type) &&
        Objects.equals(this.deliveryMethods, constraintCriteria.deliveryMethods);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, type, deliveryMethods);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConstraintCriteria {\n");
    
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
