/*
 * 企业号意向用户管理
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

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
/**
 * EnterpriseLeadsLeadsUserInlineResponse2001
 */

public class EnterpriseLeadsLeadsUserInlineResponse2001 {
  @JsonProperty("extra")
  private EnterpriseLeadsLeadsUserExtraBody extra = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("data")
  private EnterpriseLeadsLeadsUserInlineResponse2001Data data = null;

  public EnterpriseLeadsLeadsUserInlineResponse2001 extra(EnterpriseLeadsLeadsUserExtraBody extra) {
    this.extra = extra;
    return this;
  }

   /**
   * Get extra
   * @return extra
  **/
  public EnterpriseLeadsLeadsUserExtraBody getExtra() {
    return extra;
  }

  public void setExtra(EnterpriseLeadsLeadsUserExtraBody extra) {
    this.extra = extra;
  }

  public EnterpriseLeadsLeadsUserInlineResponse2001 message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public EnterpriseLeadsLeadsUserInlineResponse2001 data(EnterpriseLeadsLeadsUserInlineResponse2001Data data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  public EnterpriseLeadsLeadsUserInlineResponse2001Data getData() {
    return data;
  }

  public void setData(EnterpriseLeadsLeadsUserInlineResponse2001Data data) {
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
    EnterpriseLeadsLeadsUserInlineResponse2001 inlineResponse2001 = (EnterpriseLeadsLeadsUserInlineResponse2001) o;
    return Objects.equals(this.extra, inlineResponse2001.extra) &&
        Objects.equals(this.message, inlineResponse2001.message) &&
        Objects.equals(this.data, inlineResponse2001.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extra, message, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnterpriseLeadsLeadsUserInlineResponse2001 {\n");
    
    sb.append("    extra: ").append(toIndentedString(extra)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
