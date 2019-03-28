package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.EmailResponse;
import io.swagger.model.PhonesResponse;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ContactResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class ContactResponse   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("emails")
  @Valid
  private List<EmailResponse> emails = null;

  @JsonProperty("phones")
  @Valid
  private List<PhonesResponse> phones = null;

  public ContactResponse id(String id) {
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

  public ContactResponse name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ContactResponse emails(List<EmailResponse> emails) {
    this.emails = emails;
    return this;
  }

  public ContactResponse addEmailsItem(EmailResponse emailsItem) {
    if (this.emails == null) {
      this.emails = new ArrayList<EmailResponse>();
    }
    this.emails.add(emailsItem);
    return this;
  }

  /**
   * Get emails
   * @return emails
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<EmailResponse> getEmails() {
    return emails;
  }

  public void setEmails(List<EmailResponse> emails) {
    this.emails = emails;
  }

  public ContactResponse phones(List<PhonesResponse> phones) {
    this.phones = phones;
    return this;
  }

  public ContactResponse addPhonesItem(PhonesResponse phonesItem) {
    if (this.phones == null) {
      this.phones = new ArrayList<PhonesResponse>();
    }
    this.phones.add(phonesItem);
    return this;
  }

  /**
   * Get phones
   * @return phones
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<PhonesResponse> getPhones() {
    return phones;
  }

  public void setPhones(List<PhonesResponse> phones) {
    this.phones = phones;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactResponse contactResponse = (ContactResponse) o;
    return Objects.equals(this.id, contactResponse.id) &&
        Objects.equals(this.name, contactResponse.name) &&
        Objects.equals(this.emails, contactResponse.emails) &&
        Objects.equals(this.phones, contactResponse.phones);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, emails, phones);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
    sb.append("    phones: ").append(toIndentedString(phones)).append("\n");
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
