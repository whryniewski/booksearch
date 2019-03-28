package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.OfferCategory;
import io.swagger.model.OfferDelivery;
import io.swagger.model.OfferImages;
import io.swagger.model.OfferPromotion;
import io.swagger.model.OfferPublication;
import io.swagger.model.OfferSeller;
import io.swagger.model.OfferSellingMode;
import io.swagger.model.OfferStock;
import io.swagger.model.OfferVendor;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ListingOffer
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class ListingOffer   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("seller")
  private OfferSeller seller = null;

  @JsonProperty("promotion")
  private OfferPromotion promotion = null;

  @JsonProperty("delivery")
  private OfferDelivery delivery = null;

  @JsonProperty("images")
  @Valid
  private List<OfferImages> images = null;

  @JsonProperty("sellingMode")
  private OfferSellingMode sellingMode = null;

  @JsonProperty("stock")
  private OfferStock stock = null;

  @JsonProperty("vendor")
  private OfferVendor vendor = null;

  @JsonProperty("category")
  private OfferCategory category = null;

  @JsonProperty("publication")
  private OfferPublication publication = null;

  public ListingOffer id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Identifier of the item.
   * @return id
  **/
  @ApiModelProperty(value = "Identifier of the item.")

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ListingOffer name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the item.
   * @return name
  **/
  @ApiModelProperty(value = "Name of the item.")

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ListingOffer seller(OfferSeller seller) {
    this.seller = seller;
    return this;
  }

  /**
   * Get seller
   * @return seller
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OfferSeller getSeller() {
    return seller;
  }

  public void setSeller(OfferSeller seller) {
    this.seller = seller;
  }

  public ListingOffer promotion(OfferPromotion promotion) {
    this.promotion = promotion;
    return this;
  }

  /**
   * Get promotion
   * @return promotion
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OfferPromotion getPromotion() {
    return promotion;
  }

  public void setPromotion(OfferPromotion promotion) {
    this.promotion = promotion;
  }

  public ListingOffer delivery(OfferDelivery delivery) {
    this.delivery = delivery;
    return this;
  }

  /**
   * Get delivery
   * @return delivery
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OfferDelivery getDelivery() {
    return delivery;
  }

  public void setDelivery(OfferDelivery delivery) {
    this.delivery = delivery;
  }

  public ListingOffer images(List<OfferImages> images) {
    this.images = images;
    return this;
  }

  public ListingOffer addImagesItem(OfferImages imagesItem) {
    if (this.images == null) {
      this.images = new ArrayList<OfferImages>();
    }
    this.images.add(imagesItem);
    return this;
  }

  /**
   * Gallery of images. Only URL of original size image is provided. First image should be considered as a thumbnail on listing.
   * @return images
  **/
  @ApiModelProperty(value = "Gallery of images. Only URL of original size image is provided. First image should be considered as a thumbnail on listing.")
  @Valid
  public List<OfferImages> getImages() {
    return images;
  }

  public void setImages(List<OfferImages> images) {
    this.images = images;
  }

  public ListingOffer sellingMode(OfferSellingMode sellingMode) {
    this.sellingMode = sellingMode;
    return this;
  }

  /**
   * Get sellingMode
   * @return sellingMode
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OfferSellingMode getSellingMode() {
    return sellingMode;
  }

  public void setSellingMode(OfferSellingMode sellingMode) {
    this.sellingMode = sellingMode;
  }

  public ListingOffer stock(OfferStock stock) {
    this.stock = stock;
    return this;
  }

  /**
   * Get stock
   * @return stock
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OfferStock getStock() {
    return stock;
  }

  public void setStock(OfferStock stock) {
    this.stock = stock;
  }

  public ListingOffer vendor(OfferVendor vendor) {
    this.vendor = vendor;
    return this;
  }

  /**
   * Get vendor
   * @return vendor
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OfferVendor getVendor() {
    return vendor;
  }

  public void setVendor(OfferVendor vendor) {
    this.vendor = vendor;
  }

  public ListingOffer category(OfferCategory category) {
    this.category = category;
    return this;
  }

  /**
   * Get category
   * @return category
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OfferCategory getCategory() {
    return category;
  }

  public void setCategory(OfferCategory category) {
    this.category = category;
  }

  public ListingOffer publication(OfferPublication publication) {
    this.publication = publication;
    return this;
  }

  /**
   * Get publication
   * @return publication
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OfferPublication getPublication() {
    return publication;
  }

  public void setPublication(OfferPublication publication) {
    this.publication = publication;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListingOffer listingOffer = (ListingOffer) o;
    return Objects.equals(this.id, listingOffer.id) &&
        Objects.equals(this.name, listingOffer.name) &&
        Objects.equals(this.seller, listingOffer.seller) &&
        Objects.equals(this.promotion, listingOffer.promotion) &&
        Objects.equals(this.delivery, listingOffer.delivery) &&
        Objects.equals(this.images, listingOffer.images) &&
        Objects.equals(this.sellingMode, listingOffer.sellingMode) &&
        Objects.equals(this.stock, listingOffer.stock) &&
        Objects.equals(this.vendor, listingOffer.vendor) &&
        Objects.equals(this.category, listingOffer.category) &&
        Objects.equals(this.publication, listingOffer.publication);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, seller, promotion, delivery, images, sellingMode, stock, vendor, category, publication);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListingOffer {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    seller: ").append(toIndentedString(seller)).append("\n");
    sb.append("    promotion: ").append(toIndentedString(promotion)).append("\n");
    sb.append("    delivery: ").append(toIndentedString(delivery)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    sellingMode: ").append(toIndentedString(sellingMode)).append("\n");
    sb.append("    stock: ").append(toIndentedString(stock)).append("\n");
    sb.append("    vendor: ").append(toIndentedString(vendor)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    publication: ").append(toIndentedString(publication)).append("\n");
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
