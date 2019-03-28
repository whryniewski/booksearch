package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.DescribesListingFee;
import io.swagger.model.DescribesSuccessCommissionFee;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * WrapsListingAndCommissionsFees
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class WrapsListingAndCommissionsFees   {
  @JsonProperty("commissions")
  @Valid
  private List<DescribesSuccessCommissionFee> commissions = new ArrayList<DescribesSuccessCommissionFee>();

  @JsonProperty("quotes")
  @Valid
  private List<DescribesListingFee> quotes = new ArrayList<DescribesListingFee>();

  public WrapsListingAndCommissionsFees commissions(List<DescribesSuccessCommissionFee> commissions) {
    this.commissions = commissions;
    return this;
  }

  public WrapsListingAndCommissionsFees addCommissionsItem(DescribesSuccessCommissionFee commissionsItem) {
    this.commissions.add(commissionsItem);
    return this;
  }

  /**
   * Get commissions
   * @return commissions
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull
  @Valid
  public List<DescribesSuccessCommissionFee> getCommissions() {
    return commissions;
  }

  public void setCommissions(List<DescribesSuccessCommissionFee> commissions) {
    this.commissions = commissions;
  }

  public WrapsListingAndCommissionsFees quotes(List<DescribesListingFee> quotes) {
    this.quotes = quotes;
    return this;
  }

  public WrapsListingAndCommissionsFees addQuotesItem(DescribesListingFee quotesItem) {
    this.quotes.add(quotesItem);
    return this;
  }

  /**
   * Get quotes
   * @return quotes
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull
  @Valid
  public List<DescribesListingFee> getQuotes() {
    return quotes;
  }

  public void setQuotes(List<DescribesListingFee> quotes) {
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
    WrapsListingAndCommissionsFees wrapsListingAndCommissionsFees = (WrapsListingAndCommissionsFees) o;
    return Objects.equals(this.commissions, wrapsListingAndCommissionsFees.commissions) &&
        Objects.equals(this.quotes, wrapsListingAndCommissionsFees.quotes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commissions, quotes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WrapsListingAndCommissionsFees {\n");
    
    sb.append("    commissions: ").append(toIndentedString(commissions)).append("\n");
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
