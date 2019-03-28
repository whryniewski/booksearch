package pl.whr.booksearch.service.allegro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UserRatingListResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class UserRatingListResponse   {
  @JsonProperty("ratings")
  @Valid
  private List<UserRating> ratings = new ArrayList<UserRating>();

  public UserRatingListResponse ratings(List<UserRating> ratings) {
    this.ratings = ratings;
    return this;
  }

  public UserRatingListResponse addRatingsItem(UserRating ratingsItem) {
    this.ratings.add(ratingsItem);
    return this;
  }

  /**
   * List of ratings that match requested filter. Empty when no rating matched.
   * @return ratings
  **/
  @ApiModelProperty(required = true, value = "List of ratings that match requested filter. Empty when no rating matched.")
  @NotNull
  @Valid
  public List<UserRating> getRatings() {
    return ratings;
  }

  public void setRatings(List<UserRating> ratings) {
    this.ratings = ratings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserRatingListResponse userRatingListResponse = (UserRatingListResponse) o;
    return Objects.equals(this.ratings, userRatingListResponse.ratings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ratings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserRatingListResponse {\n");
    
    sb.append("    ratings: ").append(toIndentedString(ratings)).append("\n");
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
