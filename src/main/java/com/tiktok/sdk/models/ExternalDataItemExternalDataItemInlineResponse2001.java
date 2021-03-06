/*
 * 
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.tiktok.sdk.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.Objects;

/**
 * ExternalDataItemExternalDataItemInlineResponse2001
 */

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class ExternalDataItemExternalDataItemInlineResponse2001 {
  @JsonProperty("extra")
  private ExternalDataItemExternalDataItemExtraBody extra = null;

  @JsonProperty("data")
  private ExternalDataItemExternalDataItemInlineResponse2001Data data = null;

  public ExternalDataItemExternalDataItemInlineResponse2001 extra(ExternalDataItemExternalDataItemExtraBody extra) {
    this.extra = extra;
    return this;
  }

   /**
   * Get extra
   * @return extra
  **/
  public ExternalDataItemExternalDataItemExtraBody getExtra() {
    return extra;
  }

  public void setExtra(ExternalDataItemExternalDataItemExtraBody extra) {
    this.extra = extra;
  }

  public ExternalDataItemExternalDataItemInlineResponse2001 data(ExternalDataItemExternalDataItemInlineResponse2001Data data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  public ExternalDataItemExternalDataItemInlineResponse2001Data getData() {
    return data;
  }

  public void setData(ExternalDataItemExternalDataItemInlineResponse2001Data data) {
    this.data = data;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalDataItemExternalDataItemInlineResponse2001 inlineResponse2001 = (ExternalDataItemExternalDataItemInlineResponse2001) o;
    return Objects.equals(this.extra, inlineResponse2001.extra) &&
        Objects.equals(this.data, inlineResponse2001.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extra, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalDataItemExternalDataItemInlineResponse2001 {\n");
    
    sb.append("    extra: ").append(toIndentedString(extra)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
