package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.DescriptionSectionItemImage;
import io.swagger.model.DescriptionSectionItemText;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * One of: TextItem, ImageItem
 */
@ApiModel(description = "One of: TextItem, ImageItem")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true )
@JsonSubTypes({
  @JsonSubTypes.Type(value = DescriptionSectionItemImage.class, name = "DescriptionSectionItemImage"),
  @JsonSubTypes.Type(value = DescriptionSectionItemText.class, name = "DescriptionSectionItemText"),
})
public class DescriptionSectionItem   {
  @JsonProperty("type")
  private String type = "IMAGE";

  @JsonProperty("content")
  private String content = null;

  @JsonProperty("url")
  private String url = null;

  public DescriptionSectionItem type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public DescriptionSectionItem content(String content) {
    this.content = content;
    return this;
  }

  /**
   * Get content
   * @return content
  **/
  @ApiModelProperty(value = "")

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public DescriptionSectionItem url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(value = "")

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescriptionSectionItem descriptionSectionItem = (DescriptionSectionItem) o;
    return Objects.equals(this.type, descriptionSectionItem.type) &&
        Objects.equals(this.content, descriptionSectionItem.content) &&
        Objects.equals(this.url, descriptionSectionItem.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, content, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescriptionSectionItem {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
