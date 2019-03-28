package io.swagger.model;

import java.time.OffsetDateTime;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AfterSalesServices;
import io.swagger.model.Category;
import io.swagger.model.CompatibilityList;
import io.swagger.model.Delivery;
import io.swagger.model.ImageUrl;
import io.swagger.model.JustId;
import io.swagger.model.Location;
import io.swagger.model.OfferDescription;
import io.swagger.model.Parameter;
import io.swagger.model.Payments;
import io.swagger.model.Promotion;
import io.swagger.model.Publication;
import io.swagger.model.SellingMode;
import io.swagger.model.Stock;
import io.swagger.model.Validation;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Single offer data
 */
@ApiModel(description = "Single offer data")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class Offer   {
  @JsonProperty("additionalServices")
  private JustId additionalServices = null;

  @JsonProperty("afterSalesServices")
  private AfterSalesServices afterSalesServices = null;

  @JsonProperty("category")
  private Category category = null;

  @JsonProperty("compatibilityList")
  private CompatibilityList compatibilityList = null;

  @JsonProperty("contact")
  private JustId contact = null;

  @JsonProperty("createdAt")
  private OffsetDateTime createdAt = null;

  @JsonProperty("delivery")
  private Delivery delivery = null;

  @JsonProperty("description")
  private OfferDescription description = null;

  @JsonProperty("ean")
  private String ean = null;

  @JsonProperty("external")
  private JustId external = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("images")
  @Valid
  private List<ImageUrl> images = null;

  @JsonProperty("location")
  private Location location = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("parameters")
  @Valid
  private List<Parameter> parameters = null;

  @JsonProperty("payments")
  private Payments payments = null;

  @JsonProperty("product")
  private JustId product = null;

  @JsonProperty("promotion")
  private Promotion promotion = null;

  @JsonProperty("publication")
  private Publication publication = null;

  @JsonProperty("sellingMode")
  private SellingMode sellingMode = null;

  @JsonProperty("sizeTable")
  private JustId sizeTable = null;

  @JsonProperty("stock")
  private Stock stock = null;

  @JsonProperty("updatedAt")
  private OffsetDateTime updatedAt = null;

  @JsonProperty("validation")
  private Validation validation = null;

  public Offer additionalServices(JustId additionalServices) {
    this.additionalServices = additionalServices;
    return this;
  }

  /**
   * Get additionalServices
   * @return additionalServices
  **/
  @ApiModelProperty(value = "")

  @Valid
  public JustId getAdditionalServices() {
    return additionalServices;
  }

  public void setAdditionalServices(JustId additionalServices) {
    this.additionalServices = additionalServices;
  }

  public Offer afterSalesServices(AfterSalesServices afterSalesServices) {
    this.afterSalesServices = afterSalesServices;
    return this;
  }

  /**
   * Get afterSalesServices
   * @return afterSalesServices
  **/
  @ApiModelProperty(value = "")

  @Valid
  public AfterSalesServices getAfterSalesServices() {
    return afterSalesServices;
  }

  public void setAfterSalesServices(AfterSalesServices afterSalesServices) {
    this.afterSalesServices = afterSalesServices;
  }

  public Offer category(Category category) {
    this.category = category;
    return this;
  }

  /**
   * Get category
   * @return category
  **/
  @ApiModelProperty(value = "")

  @Valid
  public Category getCategory() {
    return category;
  }

  public void setCategory(Category category) {
    this.category = category;
  }

  public Offer compatibilityList(CompatibilityList compatibilityList) {
    this.compatibilityList = compatibilityList;
    return this;
  }

  /**
   * Get compatibilityList
   * @return compatibilityList
  **/
  @ApiModelProperty(value = "")

  @Valid
  public CompatibilityList getCompatibilityList() {
    return compatibilityList;
  }

  public void setCompatibilityList(CompatibilityList compatibilityList) {
    this.compatibilityList = compatibilityList;
  }

  public Offer contact(JustId contact) {
    this.contact = contact;
    return this;
  }

  /**
   * Get contact
   * @return contact
  **/
  @ApiModelProperty(value = "")

  @Valid
  public JustId getContact() {
    return contact;
  }

  public void setContact(JustId contact) {
    this.contact = contact;
  }

  public Offer createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Creation date: Format (ISO 8601) - yyyy-MM-dd'T'HH:mm:ss.SSSZ. Cannot be modified
   * @return createdAt
  **/
  @ApiModelProperty(value = "Creation date: Format (ISO 8601) - yyyy-MM-dd'T'HH:mm:ss.SSSZ. Cannot be modified")

  @Valid
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public Offer delivery(Delivery delivery) {
    this.delivery = delivery;
    return this;
  }

  /**
   * Get delivery
   * @return delivery
  **/
  @ApiModelProperty(value = "")

  @Valid
  public Delivery getDelivery() {
    return delivery;
  }

  public void setDelivery(Delivery delivery) {
    this.delivery = delivery;
  }

  public Offer description(OfferDescription description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OfferDescription getDescription() {
    return description;
  }

  public void setDescription(OfferDescription description) {
    this.description = description;
  }

  public Offer ean(String ean) {
    this.ean = ean;
    return this;
  }

  /**
   * Get ean
   * @return ean
  **/
  @ApiModelProperty(value = "")

@Size(max=18)   public String getEan() {
    return ean;
  }

  public void setEan(String ean) {
    this.ean = ean;
  }

  public Offer external(JustId external) {
    this.external = external;
    return this;
  }

  /**
   * Get external
   * @return external
  **/
  @ApiModelProperty(value = "")

  @Valid
  public JustId getExternal() {
    return external;
  }

  public void setExternal(JustId external) {
    this.external = external;
  }

  public Offer id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Offer images(List<ImageUrl> images) {
    this.images = images;
    return this;
  }

  public Offer addImagesItem(ImageUrl imagesItem) {
    if (this.images == null) {
      this.images = new ArrayList<ImageUrl>();
    }
    this.images.add(imagesItem);
    return this;
  }

  /**
   * Get images
   * @return images
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<ImageUrl> getImages() {
    return images;
  }

  public void setImages(List<ImageUrl> images) {
    this.images = images;
  }

  public Offer location(Location location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
  **/
  @ApiModelProperty(value = "")

  @Valid
  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  public Offer name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the offer. Words used in the name field cannot be longer than 30 characters.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the offer. Words used in the name field cannot be longer than 30 characters.")
  @NotNull

@Size(max=50)   public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Offer parameters(List<Parameter> parameters) {
    this.parameters = parameters;
    return this;
  }

  public Offer addParametersItem(Parameter parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<Parameter>();
    }
    this.parameters.add(parametersItem);
    return this;
  }

  /**
   * Get parameters
   * @return parameters
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<Parameter> getParameters() {
    return parameters;
  }

  public void setParameters(List<Parameter> parameters) {
    this.parameters = parameters;
  }

  public Offer payments(Payments payments) {
    this.payments = payments;
    return this;
  }

  /**
   * Get payments
   * @return payments
  **/
  @ApiModelProperty(value = "")

  @Valid
  public Payments getPayments() {
    return payments;
  }

  public void setPayments(Payments payments) {
    this.payments = payments;
  }

  public Offer product(JustId product) {
    this.product = product;
    return this;
  }

  /**
   * Get product
   * @return product
  **/
  @ApiModelProperty(value = "")

  @Valid
  public JustId getProduct() {
    return product;
  }

  public void setProduct(JustId product) {
    this.product = product;
  }

  public Offer promotion(Promotion promotion) {
    this.promotion = promotion;
    return this;
  }

  /**
   * Get promotion
   * @return promotion
  **/
  @ApiModelProperty(value = "")

  @Valid
  public Promotion getPromotion() {
    return promotion;
  }

  public void setPromotion(Promotion promotion) {
    this.promotion = promotion;
  }

  public Offer publication(Publication publication) {
    this.publication = publication;
    return this;
  }

  /**
   * Get publication
   * @return publication
  **/
  @ApiModelProperty(value = "")

  @Valid
  public Publication getPublication() {
    return publication;
  }

  public void setPublication(Publication publication) {
    this.publication = publication;
  }

  public Offer sellingMode(SellingMode sellingMode) {
    this.sellingMode = sellingMode;
    return this;
  }

  /**
   * Get sellingMode
   * @return sellingMode
  **/
  @ApiModelProperty(value = "")

  @Valid
  public SellingMode getSellingMode() {
    return sellingMode;
  }

  public void setSellingMode(SellingMode sellingMode) {
    this.sellingMode = sellingMode;
  }

  public Offer sizeTable(JustId sizeTable) {
    this.sizeTable = sizeTable;
    return this;
  }

  /**
   * Get sizeTable
   * @return sizeTable
  **/
  @ApiModelProperty(value = "")

  @Valid
  public JustId getSizeTable() {
    return sizeTable;
  }

  public void setSizeTable(JustId sizeTable) {
    this.sizeTable = sizeTable;
  }

  public Offer stock(Stock stock) {
    this.stock = stock;
    return this;
  }

  /**
   * Get stock
   * @return stock
  **/
  @ApiModelProperty(value = "")

  @Valid
  public Stock getStock() {
    return stock;
  }

  public void setStock(Stock stock) {
    this.stock = stock;
  }

  public Offer updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Last update date: Format (ISO 8601) - yyyy-MM-dd'T'HH:mm:ss.SSSZ. Cannot be modified
   * @return updatedAt
  **/
  @ApiModelProperty(value = "Last update date: Format (ISO 8601) - yyyy-MM-dd'T'HH:mm:ss.SSSZ. Cannot be modified")

  @Valid
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public Offer validation(Validation validation) {
    this.validation = validation;
    return this;
  }

  /**
   * Get validation
   * @return validation
  **/
  @ApiModelProperty(value = "")

  @Valid
  public Validation getValidation() {
    return validation;
  }

  public void setValidation(Validation validation) {
    this.validation = validation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Offer offer = (Offer) o;
    return Objects.equals(this.additionalServices, offer.additionalServices) &&
        Objects.equals(this.afterSalesServices, offer.afterSalesServices) &&
        Objects.equals(this.category, offer.category) &&
        Objects.equals(this.compatibilityList, offer.compatibilityList) &&
        Objects.equals(this.contact, offer.contact) &&
        Objects.equals(this.createdAt, offer.createdAt) &&
        Objects.equals(this.delivery, offer.delivery) &&
        Objects.equals(this.description, offer.description) &&
        Objects.equals(this.ean, offer.ean) &&
        Objects.equals(this.external, offer.external) &&
        Objects.equals(this.id, offer.id) &&
        Objects.equals(this.images, offer.images) &&
        Objects.equals(this.location, offer.location) &&
        Objects.equals(this.name, offer.name) &&
        Objects.equals(this.parameters, offer.parameters) &&
        Objects.equals(this.payments, offer.payments) &&
        Objects.equals(this.product, offer.product) &&
        Objects.equals(this.promotion, offer.promotion) &&
        Objects.equals(this.publication, offer.publication) &&
        Objects.equals(this.sellingMode, offer.sellingMode) &&
        Objects.equals(this.sizeTable, offer.sizeTable) &&
        Objects.equals(this.stock, offer.stock) &&
        Objects.equals(this.updatedAt, offer.updatedAt) &&
        Objects.equals(this.validation, offer.validation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalServices, afterSalesServices, category, compatibilityList, contact, createdAt, delivery, description, ean, external, id, images, location, name, parameters, payments, product, promotion, publication, sellingMode, sizeTable, stock, updatedAt, validation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Offer {\n");
    
    sb.append("    additionalServices: ").append(toIndentedString(additionalServices)).append("\n");
    sb.append("    afterSalesServices: ").append(toIndentedString(afterSalesServices)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    compatibilityList: ").append(toIndentedString(compatibilityList)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    delivery: ").append(toIndentedString(delivery)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    ean: ").append(toIndentedString(ean)).append("\n");
    sb.append("    external: ").append(toIndentedString(external)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    payments: ").append(toIndentedString(payments)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    promotion: ").append(toIndentedString(promotion)).append("\n");
    sb.append("    publication: ").append(toIndentedString(publication)).append("\n");
    sb.append("    sellingMode: ").append(toIndentedString(sellingMode)).append("\n");
    sb.append("    sizeTable: ").append(toIndentedString(sizeTable)).append("\n");
    sb.append("    stock: ").append(toIndentedString(stock)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    validation: ").append(toIndentedString(validation)).append("\n");
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
