package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Cells;
import io.swagger.model.Header;
import io.swagger.model.PublicTableImageDto;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PublicTableDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class PublicTableDto   {
  @JsonProperty("headers")
  @Valid
  private List<Header> headers = new ArrayList<Header>();

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("image")
  private PublicTableImageDto image = null;

  @JsonProperty("name")
  private String name = null;

  /**
   * Gets or Sets orientation
   */
  public enum OrientationEnum {
    HORIZONTAL("HORIZONTAL"),
    
    VERTICAL("VERTICAL");

    private String value;

    OrientationEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OrientationEnum fromValue(String text) {
      for (OrientationEnum b : OrientationEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("orientation")
  private OrientationEnum orientation = null;

  @JsonProperty("values")
  @Valid
  private List<Cells> values = new ArrayList<Cells>();

  public PublicTableDto headers(List<Header> headers) {
    this.headers = headers;
    return this;
  }

  public PublicTableDto addHeadersItem(Header headersItem) {
    this.headers.add(headersItem);
    return this;
  }

  /**
   * Get headers
   * @return headers
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull
  @Valid
  public List<Header> getHeaders() {
    return headers;
  }

  public void setHeaders(List<Header> headers) {
    this.headers = headers;
  }

  public PublicTableDto id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PublicTableDto image(PublicTableImageDto image) {
    this.image = image;
    return this;
  }

  /**
   * Get image
   * @return image
  **/
  @ApiModelProperty(value = "")

  @Valid
  public PublicTableImageDto getImage() {
    return image;
  }

  public void setImage(PublicTableImageDto image) {
    this.image = image;
  }

  public PublicTableDto name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PublicTableDto orientation(OrientationEnum orientation) {
    this.orientation = orientation;
    return this;
  }

  /**
   * Get orientation
   * @return orientation
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  public OrientationEnum getOrientation() {
    return orientation;
  }

  public void setOrientation(OrientationEnum orientation) {
    this.orientation = orientation;
  }

  public PublicTableDto values(List<Cells> values) {
    this.values = values;
    return this;
  }

  public PublicTableDto addValuesItem(Cells valuesItem) {
    this.values.add(valuesItem);
    return this;
  }

  /**
   * Get values
   * @return values
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull
  @Valid
  public List<Cells> getValues() {
    return values;
  }

  public void setValues(List<Cells> values) {
    this.values = values;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublicTableDto publicTableDto = (PublicTableDto) o;
    return Objects.equals(this.headers, publicTableDto.headers) &&
        Objects.equals(this.id, publicTableDto.id) &&
        Objects.equals(this.image, publicTableDto.image) &&
        Objects.equals(this.name, publicTableDto.name) &&
        Objects.equals(this.orientation, publicTableDto.orientation) &&
        Objects.equals(this.values, publicTableDto.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(headers, id, image, name, orientation, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublicTableDto {\n");
    
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    orientation: ").append(toIndentedString(orientation)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
