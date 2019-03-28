package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.OfferQuoteDto;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OfferQuotesDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class OfferQuotesDto   {
  @JsonProperty("count")
  private Integer count = null;

  @JsonProperty("quotes")
  @Valid
  private List<OfferQuoteDto> quotes = null;

  public OfferQuotesDto count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Get count
   * @return count
  **/
  @ApiModelProperty(value = "")

  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public OfferQuotesDto quotes(List<OfferQuoteDto> quotes) {
    this.quotes = quotes;
    return this;
  }

  public OfferQuotesDto addQuotesItem(OfferQuoteDto quotesItem) {
    if (this.quotes == null) {
      this.quotes = new ArrayList<OfferQuoteDto>();
    }
    this.quotes.add(quotesItem);
    return this;
  }

  /**
   * Get quotes
   * @return quotes
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<OfferQuoteDto> getQuotes() {
    return quotes;
  }

  public void setQuotes(List<OfferQuoteDto> quotes) {
    this.quotes = quotes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferQuotesDto offerQuotesDto = (OfferQuotesDto) o;
    return Objects.equals(this.count, offerQuotesDto.count) &&
        Objects.equals(this.quotes, offerQuotesDto.quotes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, quotes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferQuotesDto {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    quotes: ").append(toIndentedString(quotes)).append("\n");
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
