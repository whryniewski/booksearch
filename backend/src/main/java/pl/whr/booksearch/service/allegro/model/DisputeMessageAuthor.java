package pl.whr.booksearch.service.allegro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Author of the message
 */
@ApiModel(description = "Author of the message")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class DisputeMessageAuthor   {
  @JsonProperty("login")
  private String login = null;

  @JsonProperty("role")
  private MessageAuthorRole role = null;

  public DisputeMessageAuthor login(String login) {
    this.login = login;
    return this;
  }

  /**
   * Not present if role is ADMIN or SYSTEM
   * @return login
  **/
  @ApiModelProperty(value = "Not present if role is ADMIN or SYSTEM")

  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public DisputeMessageAuthor role(MessageAuthorRole role) {
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
  public MessageAuthorRole getRole() {
    return role;
  }

  public void setRole(MessageAuthorRole role) {
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
    DisputeMessageAuthor disputeMessageAuthor = (DisputeMessageAuthor) o;
    return Objects.equals(this.login, disputeMessageAuthor.login) &&
        Objects.equals(this.role, disputeMessageAuthor.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(login, role);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisputeMessageAuthor {\n");
    
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
