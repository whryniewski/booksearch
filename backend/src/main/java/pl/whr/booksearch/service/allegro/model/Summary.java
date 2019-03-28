package pl.whr.booksearch.service.allegro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * Summary
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class Summary   {
  @JsonProperty("total")
  private Long total = null;

  @JsonProperty("unique")
  private Long unique = null;

  public Summary total(Long total) {
    this.total = total;
    return this;
  }

  /**
   * Number of total users
   * @return total
  **/
  @ApiModelProperty(example = "100", required = true, value = "Number of total users")
  @NotNull

  public Long getTotal() {
    return total;
  }

  public void setTotal(Long total) {
    this.total = total;
  }

  public Summary unique(Long unique) {
    this.unique = unique;
    return this;
  }

  /**
   * Number of unique users
   * @return unique
  **/
  @ApiModelProperty(example = "100", required = true, value = "Number of unique users")
  @NotNull

  public Long getUnique() {
    return unique;
  }

  public void setUnique(Long unique) {
    this.unique = unique;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Summary summary = (Summary) o;
    return Objects.equals(this.total, summary.total) &&
        Objects.equals(this.unique, summary.unique);
  }

  @Override
  public int hashCode() {
    return Objects.hash(total, unique);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Summary {\n");
    
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    unique: ").append(toIndentedString(unique)).append("\n");
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
