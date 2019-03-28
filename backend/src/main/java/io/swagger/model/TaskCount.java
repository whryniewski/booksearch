package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Offers updates summary
 */
@ApiModel(description = "Offers updates summary")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class TaskCount   {
  @JsonProperty("failed")
  private Integer failed = null;

  @JsonProperty("success")
  private Integer success = null;

  @JsonProperty("total")
  private Integer total = null;

  public TaskCount failed(Integer failed) {
    this.failed = failed;
    return this;
  }

  /**
   * Current number of failed offers updates
   * @return failed
  **/
  @ApiModelProperty(value = "Current number of failed offers updates")

  public Integer getFailed() {
    return failed;
  }

  public void setFailed(Integer failed) {
    this.failed = failed;
  }

  public TaskCount success(Integer success) {
    this.success = success;
    return this;
  }

  /**
   * Current number of success offers updates
   * @return success
  **/
  @ApiModelProperty(value = "Current number of success offers updates")

  public Integer getSuccess() {
    return success;
  }

  public void setSuccess(Integer success) {
    this.success = success;
  }

  public TaskCount total(Integer total) {
    this.total = total;
    return this;
  }

  /**
   * Total number of scheduled offers updates
   * @return total
  **/
  @ApiModelProperty(value = "Total number of scheduled offers updates")

  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskCount taskCount = (TaskCount) o;
    return Objects.equals(this.failed, taskCount.failed) &&
        Objects.equals(this.success, taskCount.success) &&
        Objects.equals(this.total, taskCount.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(failed, success, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskCount {\n");
    
    sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
