package pl.whr.booksearch.service.allegro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DisputeAuthor
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class DisputeAuthor   {
  @JsonProperty("login")
  private String login = null;

  @JsonProperty("role")
  private DisputeAuthorRole role = null;

  public DisputeAuthor login(String login) {
    this.login = login;
    return this;
  }

  /**
   * Not present if role is ADMIN
   * @return login
  **/
  @ApiModelProperty(value = "Not present if role is ADMIN")

  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public DisputeAuthor role(DisputeAuthorRole role) {
    this.role = role;
    return this;
  }

  /**
   * Get role
   * @return role
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
  public DisputeAuthorRole getRole() {
    return role;
  }

  public void setRole(DisputeAuthorRole role) {
    this.role = role;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisputeAuthor disputeAuthor = (DisputeAuthor) o;
    return Objects.equals(this.login, disputeAuthor.login) &&
        Objects.equals(this.role, disputeAuthor.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(login, role);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisputeAuthor {\n");
    
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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
