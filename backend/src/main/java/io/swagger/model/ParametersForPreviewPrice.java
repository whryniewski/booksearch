package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Category;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ParametersForPreviewPrice
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class ParametersForPreviewPrice   {
  @JsonProperty("category")
  private Category category = null;

  /**
   * Offer condition, if is new, used or other.
   */
  public enum ConditionEnum {
    NEW("NEW"),
    
    USED("USED"),
    
    OTHER("OTHER");

    private String value;

    ConditionEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ConditionEnum fromValue(String text) {
      for (ConditionEnum b : ConditionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("condition")
  private ConditionEnum condition = null;

  /**
   * Gets or Sets duration
   */
  public enum DurationEnum {
    PT72H("PT72H"),
    
    PT120H("PT120H"),
    
    PT168H("PT168H"),
    
    PT240H("PT240H"),
    
    PT336H("PT336H"),
    
    PT480H("PT480H"),
    
    PT720H("PT720H");

    private String value;

    DurationEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DurationEnum fromValue(String text) {
      for (DurationEnum b : DurationEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("duration")
  private DurationEnum duration = null;

  @JsonProperty("hasAnyQuantity")
  private Boolean hasAnyQuantity = null;

  @JsonProperty("numberOfBigPhotos")
  private Integer numberOfBigPhotos = null;

  @JsonProperty("numberOfPhotos")
  private Integer numberOfPhotos = null;

  @JsonProperty("quantity")
  private Integer quantity = null;

  @JsonProperty("shop")
  private Boolean shop = null;

  @JsonProperty("soldQuantity")
  private Integer soldQuantity = null;

  /**
   * Offer type. 'type' or 'shop' fields must be provided. Takes precedence over 'shop' field. Note: if type = 'advertisement' then either 'quantity' or 'soldQuantity' field must be set.
   */
  public enum TypeEnum {
    SHOP("shop"),
    
    OFFER("offer"),
    
    ADVERTISEMENT("advertisement");

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

  @JsonProperty("unitPrice")
  private BigDecimal unitPrice = null;

  @JsonProperty("bold")
  private Boolean bold = null;

  @JsonProperty("highlight")
  private Boolean highlight = null;

  @JsonProperty("departmentPage")
  private Boolean departmentPage = null;

  @JsonProperty("emphasized")
  private Boolean emphasized = null;

  @JsonProperty("emphasizedHighlightBoldPackage")
  private Boolean emphasizedHighlightBoldPackage = null;

  @JsonProperty("multiVariant")
  private Boolean multiVariant = null;

  public ParametersForPreviewPrice category(Category category) {
    this.category = category;
    return this;
  }

  /**
   * Get category
   * @return category
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
  public Category getCategory() {
    return category;
  }

  public void setCategory(Category category) {
    this.category = category;
  }

  public ParametersForPreviewPrice condition(ConditionEnum condition) {
    this.condition = condition;
    return this;
  }

  /**
   * Offer condition, if is new, used or other.
   * @return condition
  **/
  @ApiModelProperty(value = "Offer condition, if is new, used or other.")

  public ConditionEnum getCondition() {
    return condition;
  }

  public void setCondition(ConditionEnum condition) {
    this.condition = condition;
  }

  public ParametersForPreviewPrice duration(DurationEnum duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Get duration
   * @return duration
  **/
  @ApiModelProperty(value = "")

  public DurationEnum getDuration() {
    return duration;
  }

  public void setDuration(DurationEnum duration) {
    this.duration = duration;
  }

  public ParametersForPreviewPrice hasAnyQuantity(Boolean hasAnyQuantity) {
    this.hasAnyQuantity = hasAnyQuantity;
    return this;
  }

  /**
   * Get hasAnyQuantity
   * @return hasAnyQuantity
  **/
  @ApiModelProperty(value = "")

  public Boolean isHasAnyQuantity() {
    return hasAnyQuantity;
  }

  public void setHasAnyQuantity(Boolean hasAnyQuantity) {
    this.hasAnyQuantity = hasAnyQuantity;
  }

  public ParametersForPreviewPrice numberOfBigPhotos(Integer numberOfBigPhotos) {
    this.numberOfBigPhotos = numberOfBigPhotos;
    return this;
  }

  /**
   * If set, minimum value 0
   * @return numberOfBigPhotos
  **/
  @ApiModelProperty(value = "If set, minimum value 0")

  public Integer getNumberOfBigPhotos() {
    return numberOfBigPhotos;
  }

  public void setNumberOfBigPhotos(Integer numberOfBigPhotos) {
    this.numberOfBigPhotos = numberOfBigPhotos;
  }

  public ParametersForPreviewPrice numberOfPhotos(Integer numberOfPhotos) {
    this.numberOfPhotos = numberOfPhotos;
    return this;
  }

  /**
   * If set, minimum value 0
   * @return numberOfPhotos
  **/
  @ApiModelProperty(value = "If set, minimum value 0")

  public Integer getNumberOfPhotos() {
    return numberOfPhotos;
  }

  public void setNumberOfPhotos(Integer numberOfPhotos) {
    this.numberOfPhotos = numberOfPhotos;
  }

  public ParametersForPreviewPrice quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Quantity of items to be sold. If set, minimum value 1
   * @return quantity
  **/
  @ApiModelProperty(value = "Quantity of items to be sold. If set, minimum value 1")

  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public ParametersForPreviewPrice shop(Boolean shop) {
    this.shop = shop;
    return this;
  }

  /**
   * Deprecated. Value 'true' sets the 'offer.type' field to 'shop', value 'false' to 'offer'. This field is ignored if 'offer.type' field is set.
   * @return shop
  **/
  @ApiModelProperty(example = "false", value = "Deprecated. Value 'true' sets the 'offer.type' field to 'shop', value 'false' to 'offer'. This field is ignored if 'offer.type' field is set.")

  public Boolean isShop() {
    return shop;
  }

  public void setShop(Boolean shop) {
    this.shop = shop;
  }

  public ParametersForPreviewPrice soldQuantity(Integer soldQuantity) {
    this.soldQuantity = soldQuantity;
    return this;
  }

  /**
   * Quantity of sold items. Relates to commission success fee. If set, minimum value 1
   * @return soldQuantity
  **/
  @ApiModelProperty(value = "Quantity of sold items. Relates to commission success fee. If set, minimum value 1")

  public Integer getSoldQuantity() {
    return soldQuantity;
  }

  public void setSoldQuantity(Integer soldQuantity) {
    this.soldQuantity = soldQuantity;
  }

  public ParametersForPreviewPrice type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Offer type. 'type' or 'shop' fields must be provided. Takes precedence over 'shop' field. Note: if type = 'advertisement' then either 'quantity' or 'soldQuantity' field must be set.
   * @return type
  **/
  @ApiModelProperty(value = "Offer type. 'type' or 'shop' fields must be provided. Takes precedence over 'shop' field. Note: if type = 'advertisement' then either 'quantity' or 'soldQuantity' field must be set.")

  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public ParametersForPreviewPrice unitPrice(BigDecimal unitPrice) {
    this.unitPrice = unitPrice;
    return this;
  }

  /**
   * Get unitPrice
   * @return unitPrice
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
  public BigDecimal getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(BigDecimal unitPrice) {
    this.unitPrice = unitPrice;
  }

  public ParametersForPreviewPrice bold(Boolean bold) {
    this.bold = bold;
    return this;
  }

  /**
   * Get bold
   * @return bold
  **/
  @ApiModelProperty(value = "")

  public Boolean isBold() {
    return bold;
  }

  public void setBold(Boolean bold) {
    this.bold = bold;
  }

  public ParametersForPreviewPrice highlight(Boolean highlight) {
    this.highlight = highlight;
    return this;
  }

  /**
   * Get highlight
   * @return highlight
  **/
  @ApiModelProperty(value = "")

  public Boolean isHighlight() {
    return highlight;
  }

  public void setHighlight(Boolean highlight) {
    this.highlight = highlight;
  }

  public ParametersForPreviewPrice departmentPage(Boolean departmentPage) {
    this.departmentPage = departmentPage;
    return this;
  }

  /**
   * Get departmentPage
   * @return departmentPage
  **/
  @ApiModelProperty(value = "")

  public Boolean isDepartmentPage() {
    return departmentPage;
  }

  public void setDepartmentPage(Boolean departmentPage) {
    this.departmentPage = departmentPage;
  }

  public ParametersForPreviewPrice emphasized(Boolean emphasized) {
    this.emphasized = emphasized;
    return this;
  }

  /**
   * Get emphasized
   * @return emphasized
  **/
  @ApiModelProperty(value = "")

  public Boolean isEmphasized() {
    return emphasized;
  }

  public void setEmphasized(Boolean emphasized) {
    this.emphasized = emphasized;
  }

  public ParametersForPreviewPrice emphasizedHighlightBoldPackage(Boolean emphasizedHighlightBoldPackage) {
    this.emphasizedHighlightBoldPackage = emphasizedHighlightBoldPackage;
    return this;
  }

  /**
   * Get emphasizedHighlightBoldPackage
   * @return emphasizedHighlightBoldPackage
  **/
  @ApiModelProperty(value = "")

  public Boolean isEmphasizedHighlightBoldPackage() {
    return emphasizedHighlightBoldPackage;
  }

  public void setEmphasizedHighlightBoldPackage(Boolean emphasizedHighlightBoldPackage) {
    this.emphasizedHighlightBoldPackage = emphasizedHighlightBoldPackage;
  }

  public ParametersForPreviewPrice multiVariant(Boolean multiVariant) {
    this.multiVariant = multiVariant;
    return this;
  }

  /**
   * Get multiVariant
   * @return multiVariant
  **/
  @ApiModelProperty(value = "")

  public Boolean isMultiVariant() {
    return multiVariant;
  }

  public void setMultiVariant(Boolean multiVariant) {
    this.multiVariant = multiVariant;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParametersForPreviewPrice parametersForPreviewPrice = (ParametersForPreviewPrice) o;
    return Objects.equals(this.category, parametersForPreviewPrice.category) &&
        Objects.equals(this.condition, parametersForPreviewPrice.condition) &&
        Objects.equals(this.duration, parametersForPreviewPrice.duration) &&
        Objects.equals(this.hasAnyQuantity, parametersForPreviewPrice.hasAnyQuantity) &&
        Objects.equals(this.numberOfBigPhotos, parametersForPreviewPrice.numberOfBigPhotos) &&
        Objects.equals(this.numberOfPhotos, parametersForPreviewPrice.numberOfPhotos) &&
        Objects.equals(this.quantity, parametersForPreviewPrice.quantity) &&
        Objects.equals(this.shop, parametersForPreviewPrice.shop) &&
        Objects.equals(this.soldQuantity, parametersForPreviewPrice.soldQuantity) &&
        Objects.equals(this.type, parametersForPreviewPrice.type) &&
        Objects.equals(this.unitPrice, parametersForPreviewPrice.unitPrice) &&
        Objects.equals(this.bold, parametersForPreviewPrice.bold) &&
        Objects.equals(this.highlight, parametersForPreviewPrice.highlight) &&
        Objects.equals(this.departmentPage, parametersForPreviewPrice.departmentPage) &&
        Objects.equals(this.emphasized, parametersForPreviewPrice.emphasized) &&
        Objects.equals(this.emphasizedHighlightBoldPackage, parametersForPreviewPrice.emphasizedHighlightBoldPackage) &&
        Objects.equals(this.multiVariant, parametersForPreviewPrice.multiVariant);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, condition, duration, hasAnyQuantity, numberOfBigPhotos, numberOfPhotos, quantity, shop, soldQuantity, type, unitPrice, bold, highlight, departmentPage, emphasized, emphasizedHighlightBoldPackage, multiVariant);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParametersForPreviewPrice {\n");
    
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    hasAnyQuantity: ").append(toIndentedString(hasAnyQuantity)).append("\n");
    sb.append("    numberOfBigPhotos: ").append(toIndentedString(numberOfBigPhotos)).append("\n");
    sb.append("    numberOfPhotos: ").append(toIndentedString(numberOfPhotos)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    shop: ").append(toIndentedString(shop)).append("\n");
    sb.append("    soldQuantity: ").append(toIndentedString(soldQuantity)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
    sb.append("    bold: ").append(toIndentedString(bold)).append("\n");
    sb.append("    highlight: ").append(toIndentedString(highlight)).append("\n");
    sb.append("    departmentPage: ").append(toIndentedString(departmentPage)).append("\n");
    sb.append("    emphasized: ").append(toIndentedString(emphasized)).append("\n");
    sb.append("    emphasizedHighlightBoldPackage: ").append(toIndentedString(emphasizedHighlightBoldPackage)).append("\n");
    sb.append("    multiVariant: ").append(toIndentedString(multiVariant)).append("\n");
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
