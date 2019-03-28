package pl.whr.booksearch.service.allegro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Product data
 */
@ApiModel(description = "Product data")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class SaleProductResponseDto   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("category")
  private Category category = null;

  @JsonProperty("ean")
  private String ean = null;

  @JsonProperty("eans")
  @Valid
  private List<String> eans = null;

  @JsonProperty("images")
  @Valid
  private List<ImageUrl> images = null;

  @JsonProperty("parameters")
  @Valid
  private List<ProductParameter> parameters = null;

  public SaleProductResponseDto id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SaleProductResponseDto name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the product.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the product.")
  @NotNull

@Size(max=50)   public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SaleProductResponseDto category(Category category) {
    this.category = category;
    return this;
  }

  /**
   * Get category
   * @return category
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
  public Category getCategory() {
    return category;
  }

  public void setCategory(Category category) {
    this.category = category;
  }

  public SaleProductResponseDto ean(String ean) {
    this.ean = ean;
    return this;
  }

  /**
   * Get ean
   * @return ean
  **/
  @ApiModelProperty(value = "")

@Size(max=18)   public String getEan() {
    return ean;
  }

  public void setEan(String ean) {
    this.ean = ean;
  }

  public SaleProductResponseDto eans(List<String> eans) {
    this.eans = eans;
    return this;
  }

  public SaleProductResponseDto addEansItem(String eansItem) {
    if (this.eans == null) {
      this.eans = new ArrayList<String>();
    }
    this.eans.add(eansItem);
    return this;
  }

  /**
   * A list of codes that identify this product. Currently this can include EAN, ISBN, and UPC identifier types.
   * @return eans
  **/
  @ApiModelProperty(value = "A list of codes that identify this product. Currently this can include EAN, ISBN, and UPC identifier types.")

  public List<String> getEans() {
    return eans;
  }

  public void setEans(List<String> eans) {
    this.eans = eans;
  }

  public SaleProductResponseDto images(List<ImageUrl> images) {
    this.images = images;
    return this;
  }

  public SaleProductResponseDto addImagesItem(ImageUrl imagesItem) {
    if (this.images == null) {
      this.images = new ArrayList<ImageUrl>();
    }
    this.images.add(imagesItem);
    return this;
  }

  /**
   * Get images
   * @return images
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<ImageUrl> getImages() {
    return images;
  }

  public void setImages(List<ImageUrl> images) {
    this.images = images;
  }

  public SaleProductResponseDto parameters(List<ProductParameter> parameters) {
    this.parameters = parameters;
    return this;
  }

  public SaleProductResponseDto addParametersItem(ProductParameter parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<ProductParameter>();
    }
    this.parameters.add(parametersItem);
    return this;
  }

  /**
   * Get parameters
   * @return parameters
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<ProductParameter> getParameters() {
    return parameters;
  }

  public void setParameters(List<ProductParameter> parameters) {
    this.parameters = parameters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SaleProductResponseDto saleProductResponseDto = (SaleProductResponseDto) o;
    return Objects.equals(this.id, saleProductResponseDto.id) &&
        Objects.equals(this.name, saleProductResponseDto.name) &&
        Objects.equals(this.category, saleProductResponseDto.category) &&
        Objects.equals(this.ean, saleProductResponseDto.ean) &&
        Objects.equals(this.eans, saleProductResponseDto.eans) &&
        Objects.equals(this.images, saleProductResponseDto.images) &&
        Objects.equals(this.parameters, saleProductResponseDto.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, category, ean, eans, images, parameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SaleProductResponseDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    ean: ").append(toIndentedString(ean)).append("\n");
    sb.append("    eans: ").append(toIndentedString(eans)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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
