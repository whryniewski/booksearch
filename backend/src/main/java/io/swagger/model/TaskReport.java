package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.CommandTask;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Contains list of task results
 */
@ApiModel(description = "Contains list of task results")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class TaskReport   {
  @JsonProperty("tasks")
  @Valid
  private List<CommandTask> tasks = null;

  public TaskReport tasks(List<CommandTask> tasks) {
    this.tasks = tasks;
    return this;
  }

  public TaskReport addTasksItem(CommandTask tasksItem) {
    if (this.tasks == null) {
      this.tasks = new ArrayList<CommandTask>();
    }
    this.tasks.add(tasksItem);
    return this;
  }

  /**
   * List of task results
   * @return tasks
  **/
  @ApiModelProperty(value = "List of task results")
  @Valid
  public List<CommandTask> getTasks() {
    return tasks;
  }

  public void setTasks(List<CommandTask> tasks) {
    this.tasks = tasks;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskReport taskReport = (TaskReport) o;
    return Objects.equals(this.tasks, taskReport.tasks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tasks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskReport {\n");
    
    sb.append("    tasks: ").append(toIndentedString(tasks)).append("\n");
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
