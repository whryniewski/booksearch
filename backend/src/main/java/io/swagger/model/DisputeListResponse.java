package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Dispute;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DisputeListResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class DisputeListResponse   {
  @JsonProperty("disputes")
  @Valid
  private List<Dispute> disputes = null;

  public DisputeListResponse disputes(List<Dispute> disputes) {
    this.disputes = disputes;
    return this;
  }

  public DisputeListResponse addDisputesItem(Dispute disputesItem) {
    if (this.disputes == null) {
      this.disputes = new ArrayList<Dispute>();
    }
    this.disputes.add(disputesItem);
    return this;
  }

  /**
   * Get disputes
   * @return disputes
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<Dispute> getDisputes() {
    return disputes;
  }

  public void setDisputes(List<Dispute> disputes) {
    this.disputes = disputes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisputeListResponse disputeListResponse = (DisputeListResponse) o;
    return Objects.equals(this.disputes, disputeListResponse.disputes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disputes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisputeListResponse {\n");
    
    sb.append("    disputes: ").append(toIndentedString(disputes)).append("\n");
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
