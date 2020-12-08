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
 * EnterpriseLeadsLeadsUserExtraBody
 */
public class EnterpriseLeadsLeadsUserExtraBody {
  @JsonProperty("logid")
  private String logid = null;

  @JsonProperty("now")
  private Long now = null;

  public EnterpriseLeadsLeadsUserExtraBody logid(String logid) {
    this.logid = logid;
    return this;
  }

   /**
   * 标识请求的唯一id
   * @return logid
  **/
  public String getLogid() {
    return logid;
  }

  public void setLogid(String logid) {
    this.logid = logid;
  }

  public EnterpriseLeadsLeadsUserExtraBody now(Long now) {
    this.now = now;
    return this;
  }

   /**
   * 毫秒级时间戳
   * @return now
  **/
  public Long getNow() {
    return now;
  }

  public void setNow(Long now) {
    this.now = now;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnterpriseLeadsLeadsUserExtraBody extraBody = (EnterpriseLeadsLeadsUserExtraBody) o;
    return Objects.equals(this.logid, extraBody.logid) &&
        Objects.equals(this.now, extraBody.now);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logid, now);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnterpriseLeadsLeadsUserExtraBody {\n");
    
    sb.append("    logid: ").append(toIndentedString(logid)).append("\n");
    sb.append("    now: ").append(toIndentedString(now)).append("\n");
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