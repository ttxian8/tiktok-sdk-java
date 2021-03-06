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
 * EnterpriseLeadsLeadsUserBody3
 */
public class EnterpriseLeadsLeadsUserBody3 {
  @JsonProperty("tag_id")
  private Integer tagId = null;

  @JsonProperty("user_id")
  private String userId = null;

  @JsonProperty("bind")
  private Boolean bind = null;

  public EnterpriseLeadsLeadsUserBody3 tagId(Integer tagId) {
    this.tagId = tagId;
    return this;
  }

   /**
   * 标签id
   * @return tagId
  **/
  public Integer getTagId() {
    return tagId;
  }

  public void setTagId(Integer tagId) {
    this.tagId = tagId;
  }

  public EnterpriseLeadsLeadsUserBody3 userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * 用户openid
   * @return userId
  **/
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public EnterpriseLeadsLeadsUserBody3 bind(Boolean bind) {
    this.bind = bind;
    return this;
  }

   /**
   * 是否绑定
   * @return bind
  **/
  public Boolean isBind() {
    return bind;
  }

  public void setBind(Boolean bind) {
    this.bind = bind;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnterpriseLeadsLeadsUserBody3 body3 = (EnterpriseLeadsLeadsUserBody3) o;
    return Objects.equals(this.tagId, body3.tagId) &&
        Objects.equals(this.userId, body3.userId) &&
        Objects.equals(this.bind, body3.bind);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tagId, userId, bind);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnterpriseLeadsLeadsUserBody3 {\n");
    
    sb.append("    tagId: ").append(toIndentedString(tagId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    bind: ").append(toIndentedString(bind)).append("\n");
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
