package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.EmailRequest;
import io.swagger.model.PhonesRequest;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ContactRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class ContactRequest   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("emails")
  @Valid
  private List<EmailRequest> emails = null;

  @JsonProperty("phones")
  @Valid
  private List<PhonesRequest> phones = null;

  public ContactRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")

@Size(max=250)   public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ContactRequest emails(List<EmailRequest> emails) {
    this.emails = emails;
    return this;
  }

  public ContactRequest addEmailsItem(EmailRequest emailsItem) {
    if (this.emails == null) {
      this.emails = new ArrayList<EmailRequest>();
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
@Size(max=1)   public List<EmailRequest> getEmails() {
    return emails;
  }

  public void setEmails(List<EmailRequest> emails) {
    this.emails = emails;
  }

  public ContactRequest phones(List<PhonesRequest> phones) {
    this.phones = phones;
    return this;
  }

  public ContactRequest addPhonesItem(PhonesRequest phonesItem) {
    if (this.phones == null) {
      this.phones = new ArrayList<PhonesRequest>();
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
@Size(max=2)   public List<PhonesRequest> getPhones() {
    return phones;
  }

  public void setPhones(List<PhonesRequest> phones) {
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
    ContactRequest contactRequest = (ContactRequest) o;
    return Objects.equals(this.name, contactRequest.name) &&
        Objects.equals(this.emails, contactRequest.emails) &&
        Objects.equals(this.phones, contactRequest.phones);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, emails, phones);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactRequest {\n");
    
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
