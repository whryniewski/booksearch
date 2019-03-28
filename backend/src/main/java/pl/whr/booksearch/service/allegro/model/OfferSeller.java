package pl.whr.booksearch.service.allegro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

/**
 * Information about the seller of the item.
 */
@ApiModel(description = "Information about the seller of the item.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class OfferSeller   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("company")
  private Boolean company = null;

  @JsonProperty("superSeller")
  private Boolean superSeller = null;

  public OfferSeller id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Identifier of the seller.
   * @return id
  **/
  @ApiModelProperty(value = "Identifier of the seller.")

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public OfferSeller company(Boolean company) {
    this.company = company;
    return this;
  }

  /**
   * Indicates whether the seller is a company.
   * @return company
  **/
  @ApiModelProperty(value = "Indicates whether the seller is a company.")

  public Boolean isCompany() {
    return company;
  }

  public void setCompany(Boolean company) {
    this.company = company;
  }

  public OfferSeller superSeller(Boolean superSeller) {
    this.superSeller = superSeller;
    return this;
  }

  /**
   * Indicates whether the item has Super Seller option.
   * @return superSeller
  **/
  @ApiModelProperty(value = "Indicates whether the item has Super Seller option.")

  public Boolean isSuperSeller() {
    return superSeller;
  }

  public void setSuperSeller(Boolean superSeller) {
    this.superSeller = superSeller;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferSeller offerSeller = (OfferSeller) o;
    return Objects.equals(this.id, offerSeller.id) &&
        Objects.equals(this.company, offerSeller.company) &&
        Objects.equals(this.superSeller, offerSeller.superSeller);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, company, superSeller);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferSeller {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    superSeller: ").append(toIndentedString(superSeller)).append("\n");
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
