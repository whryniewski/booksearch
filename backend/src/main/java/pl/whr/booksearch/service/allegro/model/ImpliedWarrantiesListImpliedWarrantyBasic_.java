package pl.whr.booksearch.service.allegro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * ImpliedWarrantiesListImpliedWarrantyBasic_
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class ImpliedWarrantiesListImpliedWarrantyBasic_   {
  @JsonProperty("count")
  private Integer count = null;

  @JsonProperty("impliedWarranties")
  @Valid
  private List<ImpliedWarrantyBasic> impliedWarranties = null;

  public ImpliedWarrantiesListImpliedWarrantyBasic_ count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Get count
   * @return count
  **/
  @ApiModelProperty(value = "")

  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public ImpliedWarrantiesListImpliedWarrantyBasic_ impliedWarranties(List<ImpliedWarrantyBasic> impliedWarranties) {
    this.impliedWarranties = impliedWarranties;
    return this;
  }

  public ImpliedWarrantiesListImpliedWarrantyBasic_ addImpliedWarrantiesItem(ImpliedWarrantyBasic impliedWarrantiesItem) {
    if (this.impliedWarranties == null) {
      this.impliedWarranties = new ArrayList<ImpliedWarrantyBasic>();
    }
    this.impliedWarranties.add(impliedWarrantiesItem);
    return this;
  }

  /**
   * Get impliedWarranties
   * @return impliedWarranties
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<ImpliedWarrantyBasic> getImpliedWarranties() {
    return impliedWarranties;
  }

  public void setImpliedWarranties(List<ImpliedWarrantyBasic> impliedWarranties) {
    this.impliedWarranties = impliedWarranties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImpliedWarrantiesListImpliedWarrantyBasic_ impliedWarrantiesListImpliedWarrantyBasic_ = (ImpliedWarrantiesListImpliedWarrantyBasic_) o;
    return Objects.equals(this.count, impliedWarrantiesListImpliedWarrantyBasic_.count) &&
        Objects.equals(this.impliedWarranties, impliedWarrantiesListImpliedWarrantyBasic_.impliedWarranties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, impliedWarranties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImpliedWarrantiesListImpliedWarrantyBasic_ {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    impliedWarranties: ").append(toIndentedString(impliedWarranties)).append("\n");
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
