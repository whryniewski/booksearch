package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TaskCount;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Command execution summary
 */
@ApiModel(description = "Command execution summary")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class GeneralReport   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("taskCount")
  private TaskCount taskCount = null;

  public GeneralReport id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Command ID
   * @return id
  **/
  @ApiModelProperty(value = "Command ID")

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public GeneralReport taskCount(TaskCount taskCount) {
    this.taskCount = taskCount;
    return this;
  }

  /**
   * Get taskCount
   * @return taskCount
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TaskCount getTaskCount() {
    return taskCount;
  }

  public void setTaskCount(TaskCount taskCount) {
    this.taskCount = taskCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeneralReport generalReport = (GeneralReport) o;
    return Objects.equals(this.id, generalReport.id) &&
        Objects.equals(this.taskCount, generalReport.taskCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, taskCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeneralReport {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    taskCount: ").append(toIndentedString(taskCount)).append("\n");
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
