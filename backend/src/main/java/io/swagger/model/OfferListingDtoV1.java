package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AfterSalesServices;
import io.swagger.model.JustId;
import io.swagger.model.OfferListingDtoV1Category;
import io.swagger.model.OfferListingDtoV1Image;
import io.swagger.model.OfferListingDtoV1Publication;
import io.swagger.model.OfferListingDtoV1SaleInfo;
import io.swagger.model.OfferListingDtoV1SellingMode;
import io.swagger.model.OfferListingDtoV1Stats;
import io.swagger.model.OfferListingDtoV1Stock;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OfferListingDtoV1
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class OfferListingDtoV1   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("category")
  private OfferListingDtoV1Category category = null;

  @JsonProperty("primaryImage")
  private OfferListingDtoV1Image primaryImage = null;

  @JsonProperty("sellingMode")
  private OfferListingDtoV1SellingMode sellingMode = null;

  @JsonProperty("saleInfo")
  private OfferListingDtoV1SaleInfo saleInfo = null;

  @JsonProperty("stock")
  private OfferListingDtoV1Stock stock = null;

  @JsonProperty("stats")
  private OfferListingDtoV1Stats stats = null;

  @JsonProperty("publication")
  private OfferListingDtoV1Publication publication = null;

  @JsonProperty("afterSalesServices")
  private AfterSalesServices afterSalesServices = null;

  @JsonProperty("additionalServices")
  private JustId additionalServices = null;

  @JsonProperty("external")
  private JustId external = null;

  public OfferListingDtoV1 id(String id) {
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

  public OfferListingDtoV1 name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OfferListingDtoV1 category(OfferListingDtoV1Category category) {
    this.category = category;
    return this;
  }

  /**
   * Get category
   * @return category
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OfferListingDtoV1Category getCategory() {
    return category;
  }

  public void setCategory(OfferListingDtoV1Category category) {
    this.category = category;
  }

  public OfferListingDtoV1 primaryImage(OfferListingDtoV1Image primaryImage) {
    this.primaryImage = primaryImage;
    return this;
  }

  /**
   * Get primaryImage
   * @return primaryImage
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OfferListingDtoV1Image getPrimaryImage() {
    return primaryImage;
  }

  public void setPrimaryImage(OfferListingDtoV1Image primaryImage) {
    this.primaryImage = primaryImage;
  }

  public OfferListingDtoV1 sellingMode(OfferListingDtoV1SellingMode sellingMode) {
    this.sellingMode = sellingMode;
    return this;
  }

  /**
   * Get sellingMode
   * @return sellingMode
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OfferListingDtoV1SellingMode getSellingMode() {
    return sellingMode;
  }

  public void setSellingMode(OfferListingDtoV1SellingMode sellingMode) {
    this.sellingMode = sellingMode;
  }

  public OfferListingDtoV1 saleInfo(OfferListingDtoV1SaleInfo saleInfo) {
    this.saleInfo = saleInfo;
    return this;
  }

  /**
   * Get saleInfo
   * @return saleInfo
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OfferListingDtoV1SaleInfo getSaleInfo() {
    return saleInfo;
  }

  public void setSaleInfo(OfferListingDtoV1SaleInfo saleInfo) {
    this.saleInfo = saleInfo;
  }

  public OfferListingDtoV1 stock(OfferListingDtoV1Stock stock) {
    this.stock = stock;
    return this;
  }

  /**
   * Get stock
   * @return stock
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OfferListingDtoV1Stock getStock() {
    return stock;
  }

  public void setStock(OfferListingDtoV1Stock stock) {
    this.stock = stock;
  }

  public OfferListingDtoV1 stats(OfferListingDtoV1Stats stats) {
    this.stats = stats;
    return this;
  }

  /**
   * Get stats
   * @return stats
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OfferListingDtoV1Stats getStats() {
    return stats;
  }

  public void setStats(OfferListingDtoV1Stats stats) {
    this.stats = stats;
  }

  public OfferListingDtoV1 publication(OfferListingDtoV1Publication publication) {
    this.publication = publication;
    return this;
  }

  /**
   * Get publication
   * @return publication
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OfferListingDtoV1Publication getPublication() {
    return publication;
  }

  public void setPublication(OfferListingDtoV1Publication publication) {
    this.publication = publication;
  }

  public OfferListingDtoV1 afterSalesServices(AfterSalesServices afterSalesServices) {
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

  public OfferListingDtoV1 additionalServices(JustId additionalServices) {
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

  public OfferListingDtoV1 external(JustId external) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferListingDtoV1 offerListingDtoV1 = (OfferListingDtoV1) o;
    return Objects.equals(this.id, offerListingDtoV1.id) &&
        Objects.equals(this.name, offerListingDtoV1.name) &&
        Objects.equals(this.category, offerListingDtoV1.category) &&
        Objects.equals(this.primaryImage, offerListingDtoV1.primaryImage) &&
        Objects.equals(this.sellingMode, offerListingDtoV1.sellingMode) &&
        Objects.equals(this.saleInfo, offerListingDtoV1.saleInfo) &&
        Objects.equals(this.stock, offerListingDtoV1.stock) &&
        Objects.equals(this.stats, offerListingDtoV1.stats) &&
        Objects.equals(this.publication, offerListingDtoV1.publication) &&
        Objects.equals(this.afterSalesServices, offerListingDtoV1.afterSalesServices) &&
        Objects.equals(this.additionalServices, offerListingDtoV1.additionalServices) &&
        Objects.equals(this.external, offerListingDtoV1.external);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, category, primaryImage, sellingMode, saleInfo, stock, stats, publication, afterSalesServices, additionalServices, external);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferListingDtoV1 {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    primaryImage: ").append(toIndentedString(primaryImage)).append("\n");
    sb.append("    sellingMode: ").append(toIndentedString(sellingMode)).append("\n");
    sb.append("    saleInfo: ").append(toIndentedString(saleInfo)).append("\n");
    sb.append("    stock: ").append(toIndentedString(stock)).append("\n");
    sb.append("    stats: ").append(toIndentedString(stats)).append("\n");
    sb.append("    publication: ").append(toIndentedString(publication)).append("\n");
    sb.append("    afterSalesServices: ").append(toIndentedString(afterSalesServices)).append("\n");
    sb.append("    additionalServices: ").append(toIndentedString(additionalServices)).append("\n");
    sb.append("    external: ").append(toIndentedString(external)).append("\n");
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
