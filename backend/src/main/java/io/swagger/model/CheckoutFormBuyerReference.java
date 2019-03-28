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
 * Buyer data
 */
@ApiModel(description = "Buyer data")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class CheckoutFormBuyerReference   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("login")
  private String login = null;

  @JsonProperty("guest")
  private Boolean guest = null;

  @JsonProperty("personalIdentity")
  private String personalIdentity = null;

  @JsonProperty("phoneNumber")
  private String phoneNumber = null;

  public CheckoutFormBuyerReference id(String id) {
    this.id = id;
    return this;
  }

  /**
   * buyer id
   * @return id
  **/
  @ApiModelProperty(example = "23123123", required = true, value = "buyer id")
  @NotNull

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CheckoutFormBuyerReference email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(example = "user-email@allegro.pl", required = true, value = "")
  @NotNull

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public CheckoutFormBuyerReference login(String login) {
    this.login = login;
    return this;
  }

  /**
   * Get login
   * @return login
  **/
  @ApiModelProperty(example = "User_Login", required = true, value = "")
  @NotNull

  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public CheckoutFormBuyerReference guest(Boolean guest) {
    this.guest = guest;
    return this;
  }

  /**
   * is a guest account?
   * @return guest
  **/
  @ApiModelProperty(example = "false", required = true, value = "is a guest account?")
  @NotNull

  public Boolean isGuest() {
    return guest;
  }

  public void setGuest(Boolean guest) {
    this.guest = guest;
  }

  public CheckoutFormBuyerReference personalIdentity(String personalIdentity) {
    this.personalIdentity = personalIdentity;
    return this;
  }

  /**
   * Buyer's personal identity number (PESEL)
   * @return personalIdentity
  **/
  @ApiModelProperty(example = "67062589524", value = "Buyer's personal identity number (PESEL)")

  public String getPersonalIdentity() {
    return personalIdentity;
  }

  public void setPersonalIdentity(String personalIdentity) {
    this.personalIdentity = personalIdentity;
  }

  public CheckoutFormBuyerReference phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * Phone number
   * @return phoneNumber
  **/
  @ApiModelProperty(example = "+48999999999", value = "Phone number")

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckoutFormBuyerReference checkoutFormBuyerReference = (CheckoutFormBuyerReference) o;
    return Objects.equals(this.id, checkoutFormBuyerReference.id) &&
        Objects.equals(this.email, checkoutFormBuyerReference.email) &&
        Objects.equals(this.login, checkoutFormBuyerReference.login) &&
        Objects.equals(this.guest, checkoutFormBuyerReference.guest) &&
        Objects.equals(this.personalIdentity, checkoutFormBuyerReference.personalIdentity) &&
        Objects.equals(this.phoneNumber, checkoutFormBuyerReference.phoneNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, email, login, guest, personalIdentity, phoneNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckoutFormBuyerReference {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    guest: ").append(toIndentedString(guest)).append("\n");
    sb.append("    personalIdentity: ").append(toIndentedString(personalIdentity)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
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
