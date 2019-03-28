package pl.whr.booksearch.service.allegro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * Buyer data
 */
@ApiModel(description = "Buyer data")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class BuyerReference   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("login")
  private String login = null;

  @JsonProperty("guest")
  private Boolean guest = null;

  public BuyerReference id(String id) {
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

  public BuyerReference email(String email) {
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

  public BuyerReference login(String login) {
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

  public BuyerReference guest(Boolean guest) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuyerReference buyerReference = (BuyerReference) o;
    return Objects.equals(this.id, buyerReference.id) &&
        Objects.equals(this.email, buyerReference.email) &&
        Objects.equals(this.login, buyerReference.login) &&
        Objects.equals(this.guest, buyerReference.guest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, email, login, guest);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuyerReference {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    guest: ").append(toIndentedString(guest)).append("\n");
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
