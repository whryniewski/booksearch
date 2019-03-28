package pl.whr.booksearch.service.allegro.model;

import java.time.OffsetDateTime;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * OfferQuoteDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class OfferQuoteDto   {
  @JsonProperty("enabled")
  private Boolean enabled = null;

  @JsonProperty("fee")
  private Fee fee = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("nextDate")
  private OffsetDateTime nextDate = null;

  @JsonProperty("offer")
  private Offer offer = null;

  @JsonProperty("type")
  private String type = null;

  public OfferQuoteDto enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Get enabled
   * @return enabled
  **/
  @ApiModelProperty(value = "")

  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public OfferQuoteDto fee(Fee fee) {
    this.fee = fee;
    return this;
  }

  /**
   * Get fee
   * @return fee
  **/
  @ApiModelProperty(value = "")

  @Valid
  public Fee getFee() {
    return fee;
  }

  public void setFee(Fee fee) {
    this.fee = fee;
  }

  public OfferQuoteDto name(String name) {
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

  public OfferQuoteDto nextDate(OffsetDateTime nextDate) {
    this.nextDate = nextDate;
    return this;
  }

  /**
   * Get nextDate
   * @return nextDate
  **/
  @ApiModelProperty(value = "")

  @Valid
  public OffsetDateTime getNextDate() {
    return nextDate;
  }

  public void setNextDate(OffsetDateTime nextDate) {
    this.nextDate = nextDate;
  }

  public OfferQuoteDto offer(Offer offer) {
    this.offer = offer;
    return this;
  }

  /**
   * Get offer
   * @return offer
  **/
  @ApiModelProperty(value = "")

  @Valid
  public Offer getOffer() {
    return offer;
  }

  public void setOffer(Offer offer) {
    this.offer = offer;
  }

  public OfferQuoteDto type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferQuoteDto offerQuoteDto = (OfferQuoteDto) o;
    return Objects.equals(this.enabled, offerQuoteDto.enabled) &&
        Objects.equals(this.fee, offerQuoteDto.fee) &&
        Objects.equals(this.name, offerQuoteDto.name) &&
        Objects.equals(this.nextDate, offerQuoteDto.nextDate) &&
        Objects.equals(this.offer, offerQuoteDto.offer) &&
        Objects.equals(this.type, offerQuoteDto.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, fee, name, nextDate, offer, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferQuoteDto {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nextDate: ").append(toIndentedString(nextDate)).append("\n");
    sb.append("    offer: ").append(toIndentedString(offer)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
