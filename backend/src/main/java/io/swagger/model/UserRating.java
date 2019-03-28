package io.swagger.model;

import java.time.OffsetDateTime;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Answer;
import io.swagger.model.Order;
import io.swagger.model.Rates;
import io.swagger.model.Removal;
import io.swagger.model.User;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UserRating
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class UserRating   {
  @JsonProperty("answer")
  private Answer answer = null;

  @JsonProperty("buyer")
  private User buyer = null;

  @JsonProperty("comment")
  private String comment = null;

  @JsonProperty("createdAt")
  private OffsetDateTime createdAt = null;

  @JsonProperty("excludedFromAverageRates")
  private Boolean excludedFromAverageRates = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("order")
  private Order order = null;

  @JsonProperty("rates")
  private Rates rates = null;

  @JsonProperty("recommended")
  private Boolean recommended = null;

  @JsonProperty("removal")
  private Removal removal = null;

  public UserRating answer(Answer answer) {
    this.answer = answer;
    return this;
  }

  /**
   * Get answer
   * @return answer
  **/
  @ApiModelProperty(value = "")

  @Valid
  public Answer getAnswer() {
    return answer;
  }

  public void setAnswer(Answer answer) {
    this.answer = answer;
  }

  public UserRating buyer(User buyer) {
    this.buyer = buyer;
    return this;
  }

  /**
   * Get buyer
   * @return buyer
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
  public User getBuyer() {
    return buyer;
  }

  public void setBuyer(User buyer) {
    this.buyer = buyer;
  }

  public UserRating comment(String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * Buyer's text comment
   * @return comment
  **/
  @ApiModelProperty(required = true, value = "Buyer's text comment")
  @NotNull

  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public UserRating createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Creation datetime in ISO 8601 format
   * @return createdAt
  **/
  @ApiModelProperty(required = true, value = "Creation datetime in ISO 8601 format")
  @NotNull

  @Valid
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public UserRating excludedFromAverageRates(Boolean excludedFromAverageRates) {
    this.excludedFromAverageRates = excludedFromAverageRates;
    return this;
  }

  /**
   * If true this rating was not included in calculating average user rates
   * @return excludedFromAverageRates
  **/
  @ApiModelProperty(example = "false", value = "If true this rating was not included in calculating average user rates")

  public Boolean isExcludedFromAverageRates() {
    return excludedFromAverageRates;
  }

  public void setExcludedFromAverageRates(Boolean excludedFromAverageRates) {
    this.excludedFromAverageRates = excludedFromAverageRates;
  }

  public UserRating id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Rating id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Rating id")
  @NotNull

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public UserRating order(Order order) {
    this.order = order;
    return this;
  }

  /**
   * Get order
   * @return order
  **/
  @ApiModelProperty(value = "")

  @Valid
  public Order getOrder() {
    return order;
  }

  public void setOrder(Order order) {
    this.order = order;
  }

  public UserRating rates(Rates rates) {
    this.rates = rates;
    return this;
  }

  /**
   * Get rates
   * @return rates
  **/
  @ApiModelProperty(value = "")

  @Valid
  public Rates getRates() {
    return rates;
  }

  public void setRates(Rates rates) {
    this.rates = rates;
  }

  public UserRating recommended(Boolean recommended) {
    this.recommended = recommended;
    return this;
  }

  /**
   * Whether buyer recommends the order
   * @return recommended
  **/
  @ApiModelProperty(example = "false", required = true, value = "Whether buyer recommends the order")
  @NotNull

  public Boolean isRecommended() {
    return recommended;
  }

  public void setRecommended(Boolean recommended) {
    this.recommended = recommended;
  }

  public UserRating removal(Removal removal) {
    this.removal = removal;
    return this;
  }

  /**
   * Get removal
   * @return removal
  **/
  @ApiModelProperty(value = "")

  @Valid
  public Removal getRemoval() {
    return removal;
  }

  public void setRemoval(Removal removal) {
    this.removal = removal;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserRating userRating = (UserRating) o;
    return Objects.equals(this.answer, userRating.answer) &&
        Objects.equals(this.buyer, userRating.buyer) &&
        Objects.equals(this.comment, userRating.comment) &&
        Objects.equals(this.createdAt, userRating.createdAt) &&
        Objects.equals(this.excludedFromAverageRates, userRating.excludedFromAverageRates) &&
        Objects.equals(this.id, userRating.id) &&
        Objects.equals(this.order, userRating.order) &&
        Objects.equals(this.rates, userRating.rates) &&
        Objects.equals(this.recommended, userRating.recommended) &&
        Objects.equals(this.removal, userRating.removal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(answer, buyer, comment, createdAt, excludedFromAverageRates, id, order, rates, recommended, removal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserRating {\n");
    
    sb.append("    answer: ").append(toIndentedString(answer)).append("\n");
    sb.append("    buyer: ").append(toIndentedString(buyer)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    excludedFromAverageRates: ").append(toIndentedString(excludedFromAverageRates)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    rates: ").append(toIndentedString(rates)).append("\n");
    sb.append("    recommended: ").append(toIndentedString(recommended)).append("\n");
    sb.append("    removal: ").append(toIndentedString(removal)).append("\n");
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
