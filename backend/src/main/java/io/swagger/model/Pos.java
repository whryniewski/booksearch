package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Address;
import io.swagger.model.OpenHour;
import io.swagger.model.Payment;
import io.swagger.model.Seller;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Pos
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class Pos   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("externalId")
  private String externalId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("seller")
  private Seller seller = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("address")
  private Address address = null;

  @JsonProperty("phoneNumber")
  private String phoneNumber = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("openHours")
  @Valid
  private List<OpenHour> openHours = new ArrayList<OpenHour>();

  @JsonProperty("serviceTime")
  private String serviceTime = null;

  @JsonProperty("payments")
  @Valid
  private List<Payment> payments = null;

  @JsonProperty("confirmationType")
  private String confirmationType = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("createdAt")
  private String createdAt = null;

  @JsonProperty("updatedAt")
  private String updatedAt = null;

  public Pos id(String id) {
    this.id = id;
    return this;
  }

  /**
   * UUID. When creating a point of service (Post) the field is ignored. It is required when updating (Put) a point of service.
   * @return id
  **/
  @ApiModelProperty(value = "UUID. When creating a point of service (Post) the field is ignored. It is required when updating (Put) a point of service.")

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Pos externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

  /**
   * ID from external client system.
   * @return externalId
  **/
  @ApiModelProperty(value = "ID from external client system.")

@Size(max=80)   public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public Pos name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=80)   public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Pos seller(Seller seller) {
    this.seller = seller;
    return this;
  }

  /**
   * Get seller
   * @return seller
  **/
  @ApiModelProperty(value = "")

  @Valid
  public Seller getSeller() {
    return seller;
  }

  public void setSeller(Seller seller) {
    this.seller = seller;
  }

  public Pos type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Indicates point type. The only valid value so far is PICKUP_POINT.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Indicates point type. The only valid value so far is PICKUP_POINT.")
  @NotNull

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Pos address(Address address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public Pos phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * Get phoneNumber
   * @return phoneNumber
  **/
  @ApiModelProperty(value = "")

@Size(max=16)   public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public Pos email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(value = "")

@Size(max=64)   public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Pos openHours(List<OpenHour> openHours) {
    this.openHours = openHours;
    return this;
  }

  public Pos addOpenHoursItem(OpenHour openHoursItem) {
    this.openHours.add(openHoursItem);
    return this;
  }

  /**
   * Possible empty list of opening hours.
   * @return openHours
  **/
  @ApiModelProperty(required = true, value = "Possible empty list of opening hours.")
  @NotNull
  @Valid
  public List<OpenHour> getOpenHours() {
    return openHours;
  }

  public void setOpenHours(List<OpenHour> openHours) {
    this.openHours = openHours;
  }

  public Pos serviceTime(String serviceTime) {
    this.serviceTime = serviceTime;
    return this;
  }

  /**
   * Delivery time / Time period for receipt. Date format ISO 8601 e.g. 'PT24H'
   * @return serviceTime
  **/
  @ApiModelProperty(value = "Delivery time / Time period for receipt. Date format ISO 8601 e.g. 'PT24H'")

  public String getServiceTime() {
    return serviceTime;
  }

  public void setServiceTime(String serviceTime) {
    this.serviceTime = serviceTime;
  }

  public Pos payments(List<Payment> payments) {
    this.payments = payments;
    return this;
  }

  public Pos addPaymentsItem(Payment paymentsItem) {
    if (this.payments == null) {
      this.payments = new ArrayList<Payment>();
    }
    this.payments.add(paymentsItem);
    return this;
  }

  /**
   * An empty list of payment types is available.
   * @return payments
  **/
  @ApiModelProperty(value = "An empty list of payment types is available.")
  @Valid
  public List<Payment> getPayments() {
    return payments;
  }

  public void setPayments(List<Payment> payments) {
    this.payments = payments;
  }

  public Pos confirmationType(String confirmationType) {
    this.confirmationType = confirmationType;
    return this;
  }

  /**
   * Confirmation method: AWAIT_CONTACT - We will inform you about the time of receipt, CALL_US - Please make an appointment, CONTACT_NOT_REQUIRED - Contact is not required.
   * @return confirmationType
  **/
  @ApiModelProperty(required = true, value = "Confirmation method: AWAIT_CONTACT - We will inform you about the time of receipt, CALL_US - Please make an appointment, CONTACT_NOT_REQUIRED - Contact is not required.")
  @NotNull

  public String getConfirmationType() {
    return confirmationType;
  }

  public void setConfirmationType(String confirmationType) {
    this.confirmationType = confirmationType;
  }

  public Pos status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Point of service status: ACTIVE - active, TEMPORARILY_CLOSED - temporarily closed, CLOSED_DOWN - closed down, DELETED - deleted.
   * @return status
  **/
  @ApiModelProperty(required = true, value = "Point of service status: ACTIVE - active, TEMPORARILY_CLOSED - temporarily closed, CLOSED_DOWN - closed down, DELETED - deleted.")
  @NotNull

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Pos createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Creation date. Date format (ISO 8601) - yyyy-MM-dd'T'HH:mm:ss.SSSZ
   * @return createdAt
  **/
  @ApiModelProperty(value = "Creation date. Date format (ISO 8601) - yyyy-MM-dd'T'HH:mm:ss.SSSZ")

  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public Pos updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Modification date. Date format (ISO 8601) - yyyy-MM-dd'T'HH:mm:ss.SSSZ
   * @return updatedAt
  **/
  @ApiModelProperty(value = "Modification date. Date format (ISO 8601) - yyyy-MM-dd'T'HH:mm:ss.SSSZ")

  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pos pos = (Pos) o;
    return Objects.equals(this.id, pos.id) &&
        Objects.equals(this.externalId, pos.externalId) &&
        Objects.equals(this.name, pos.name) &&
        Objects.equals(this.seller, pos.seller) &&
        Objects.equals(this.type, pos.type) &&
        Objects.equals(this.address, pos.address) &&
        Objects.equals(this.phoneNumber, pos.phoneNumber) &&
        Objects.equals(this.email, pos.email) &&
        Objects.equals(this.openHours, pos.openHours) &&
        Objects.equals(this.serviceTime, pos.serviceTime) &&
        Objects.equals(this.payments, pos.payments) &&
        Objects.equals(this.confirmationType, pos.confirmationType) &&
        Objects.equals(this.status, pos.status) &&
        Objects.equals(this.createdAt, pos.createdAt) &&
        Objects.equals(this.updatedAt, pos.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, externalId, name, seller, type, address, phoneNumber, email, openHours, serviceTime, payments, confirmationType, status, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pos {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    seller: ").append(toIndentedString(seller)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    openHours: ").append(toIndentedString(openHours)).append("\n");
    sb.append("    serviceTime: ").append(toIndentedString(serviceTime)).append("\n");
    sb.append("    payments: ").append(toIndentedString(payments)).append("\n");
    sb.append("    confirmationType: ").append(toIndentedString(confirmationType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
