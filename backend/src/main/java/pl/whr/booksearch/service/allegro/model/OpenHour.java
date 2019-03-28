package pl.whr.booksearch.service.allegro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * OpenHour
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class OpenHour   {
  @JsonProperty("dayOfWeek")
  private String dayOfWeek = null;

  @JsonProperty("from")
  private String from = null;

  @JsonProperty("to")
  private String to = null;

  public OpenHour dayOfWeek(String dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
    return this;
  }

  /**
   * Days of the week: MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY. Date format ISO 8601
   * @return dayOfWeek
  **/
  @ApiModelProperty(required = true, value = "Days of the week: MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY. Date format ISO 8601")
  @NotNull

  public String getDayOfWeek() {
    return dayOfWeek;
  }

  public void setDayOfWeek(String dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
  }

  public OpenHour from(String from) {
    this.from = from;
    return this;
  }

  /**
   * Date format (ISO 8601) - HH:mm:ss.SSS
   * @return from
  **/
  @ApiModelProperty(required = true, value = "Date format (ISO 8601) - HH:mm:ss.SSS")
  @NotNull

  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public OpenHour to(String to) {
    this.to = to;
    return this;
  }

  /**
   * Date format (ISO 8601) - HH:mm:ss.SSS
   * @return to
  **/
  @ApiModelProperty(required = true, value = "Date format (ISO 8601) - HH:mm:ss.SSS")
  @NotNull

  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenHour openHour = (OpenHour) o;
    return Objects.equals(this.dayOfWeek, openHour.dayOfWeek) &&
        Objects.equals(this.from, openHour.from) &&
        Objects.equals(this.to, openHour.to);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dayOfWeek, from, to);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenHour {\n");
    
    sb.append("    dayOfWeek: ").append(toIndentedString(dayOfWeek)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
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
