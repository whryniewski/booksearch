package pl.whr.booksearch.service.allegro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * ContactResponseList
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class ContactResponseList   {
  @JsonProperty("contacts")
  @Valid
  private List<ContactResponse> contacts = null;

  public ContactResponseList contacts(List<ContactResponse> contacts) {
    this.contacts = contacts;
    return this;
  }

  public ContactResponseList addContactsItem(ContactResponse contactsItem) {
    if (this.contacts == null) {
      this.contacts = new ArrayList<ContactResponse>();
    }
    this.contacts.add(contactsItem);
    return this;
  }

  /**
   * Get contacts
   * @return contacts
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<ContactResponse> getContacts() {
    return contacts;
  }

  public void setContacts(List<ContactResponse> contacts) {
    this.contacts = contacts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactResponseList contactResponseList = (ContactResponseList) o;
    return Objects.equals(this.contacts, contactResponseList.contacts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contacts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactResponseList {\n");
    
    sb.append("    contacts: ").append(toIndentedString(contacts)).append("\n");
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
