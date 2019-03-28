package pl.whr.booksearch.service.allegro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PublicTablesDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-27T20:38:15.652504+01:00[Europe/Warsaw]")
public class PublicTablesDto   {
  @JsonProperty("tables")
  @Valid
  private List<PublicTableDto> tables = new ArrayList<PublicTableDto>();

  public PublicTablesDto tables(List<PublicTableDto> tables) {
    this.tables = tables;
    return this;
  }

  public PublicTablesDto addTablesItem(PublicTableDto tablesItem) {
    this.tables.add(tablesItem);
    return this;
  }

  /**
   * Get tables
   * @return tables
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull
  @Valid
  public List<PublicTableDto> getTables() {
    return tables;
  }

  public void setTables(List<PublicTableDto> tables) {
    this.tables = tables;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublicTablesDto publicTablesDto = (PublicTablesDto) o;
    return Objects.equals(this.tables, publicTablesDto.tables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tables);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublicTablesDto {\n");
    
    sb.append("    tables: ").append(toIndentedString(tables)).append("\n");
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