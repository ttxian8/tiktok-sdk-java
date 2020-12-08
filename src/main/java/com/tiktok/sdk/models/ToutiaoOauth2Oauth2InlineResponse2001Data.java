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
 * ToutiaoOauth2Oauth2InlineResponse2001Data
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:03:07.108677+08:00[Asia/Shanghai]")
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class ToutiaoOauth2Oauth2InlineResponse2001Data {
  @JsonProperty("error_code")
  private Integer errorCode = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("access_token")
  private String accessToken = null;

  @JsonProperty("expires_in")
  private String expiresIn = null;

  @JsonProperty("refresh_token")
  private String refreshToken = null;

  @JsonProperty("open_id")
  private String openId = null;

  @JsonProperty("scope")
  private String scope = null;

  public ToutiaoOauth2Oauth2InlineResponse2001Data errorCode(Integer errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Get errorCode
   * @return errorCode
  **/
  public Integer getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
  }

  public ToutiaoOauth2Oauth2InlineResponse2001Data description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ToutiaoOauth2Oauth2InlineResponse2001Data accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

   /**
   * 接口调用凭证
   * @return accessToken
  **/
  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  public ToutiaoOauth2Oauth2InlineResponse2001Data expiresIn(String expiresIn) {
    this.expiresIn = expiresIn;
    return this;
  }

   /**
   * 过期时间，单位（秒）
   * @return expiresIn
  **/
  public String getExpiresIn() {
    return expiresIn;
  }

  public void setExpiresIn(String expiresIn) {
    this.expiresIn = expiresIn;
  }

  public ToutiaoOauth2Oauth2InlineResponse2001Data refreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
    return this;
  }

   /**
   * 用户刷新
   * @return refreshToken
  **/
  public String getRefreshToken() {
    return refreshToken;
  }

  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }

  public ToutiaoOauth2Oauth2InlineResponse2001Data openId(String openId) {
    this.openId = openId;
    return this;
  }

   /**
   * 当前应用下，授权用户唯一标识
   * @return openId
  **/
  public String getOpenId() {
    return openId;
  }

  public void setOpenId(String openId) {
    this.openId = openId;
  }

  public ToutiaoOauth2Oauth2InlineResponse2001Data scope(String scope) {
    this.scope = scope;
    return this;
  }

   /**
   * 用户授权的作用域
   * @return scope
  **/
  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToutiaoOauth2Oauth2InlineResponse2001Data inlineResponse2001Data = (ToutiaoOauth2Oauth2InlineResponse2001Data) o;
    return Objects.equals(this.errorCode, inlineResponse2001Data.errorCode) &&
        Objects.equals(this.description, inlineResponse2001Data.description) &&
        Objects.equals(this.accessToken, inlineResponse2001Data.accessToken) &&
        Objects.equals(this.expiresIn, inlineResponse2001Data.expiresIn) &&
        Objects.equals(this.refreshToken, inlineResponse2001Data.refreshToken) &&
        Objects.equals(this.openId, inlineResponse2001Data.openId) &&
        Objects.equals(this.scope, inlineResponse2001Data.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, description, accessToken, expiresIn, refreshToken, openId, scope);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToutiaoOauth2Oauth2InlineResponse2001Data {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
    sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
    sb.append("    openId: ").append(toIndentedString(openId)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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
