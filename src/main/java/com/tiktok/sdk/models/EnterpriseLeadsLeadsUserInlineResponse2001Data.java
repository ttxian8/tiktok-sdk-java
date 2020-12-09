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
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.ArrayList;
import java.util.List;
/**
 * EnterpriseLeadsLeadsUserInlineResponse2001Data
 */
public class EnterpriseLeadsLeadsUserInlineResponse2001Data {
  @JsonProperty("error_code")
  private Integer errorCode = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("open_id")
  private String openId = null;

  @JsonProperty("nickname")
  private String nickname = null;

  @JsonProperty("avatar")
  private String avatar = null;

  @JsonProperty("telephone")
  private String telephone = null;

  @JsonProperty("wechat")
  private String wechat = null;

  @JsonProperty("city")
  private String city = null;

  /**
   * 性别 * &#x60;0&#x60; - 未知 * &#x60;1&#x60; - 男 * &#x60;2&#x60; - 女 
   */
  @JsonProperty("gender")
  private String gender = null;

  @JsonProperty("age")
  private Integer age = null;

  /**
   * 用户状态 * &#x60;-1&#x60; - 没兴趣 * &#x60;0&#x60; - 了解 * &#x60;1&#x60; - 有兴趣 * &#x60;2&#x60; - 有意愿 * &#x60;10&#x60; - 已转化 
   */
  public enum LeadsLevelEnum {
    NUMBER_MINUS_1(-1),
    NUMBER_0(0),
    NUMBER_1(1),
    NUMBER_2(2),
    NUMBER_10(10);

    private Integer value;

    LeadsLevelEnum(Integer value) {
      this.value = value;
    }
    @JsonValue
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static LeadsLevelEnum fromValue(String text) {
      for (LeadsLevelEnum b : LeadsLevelEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("leads_level")
  private LeadsLevelEnum leadsLevel = null;

  @JsonProperty("tag_list")
  private List<EnterpriseLeadsLeadsUserInlineResponse200DataTagList> tagList = null;

  @JsonProperty("is_follow")
  private Boolean isFollow = null;

  public EnterpriseLeadsLeadsUserInlineResponse2001Data errorCode(Integer errorCode) {
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

  public EnterpriseLeadsLeadsUserInlineResponse2001Data description(String description) {
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

  public EnterpriseLeadsLeadsUserInlineResponse2001Data openId(String openId) {
    this.openId = openId;
    return this;
  }

   /**
   * 用户在当前应用的唯一标识
   * @return openId
  **/
  public String getOpenId() {
    return openId;
  }

  public void setOpenId(String openId) {
    this.openId = openId;
  }

  public EnterpriseLeadsLeadsUserInlineResponse2001Data nickname(String nickname) {
    this.nickname = nickname;
    return this;
  }

   /**
   * Get nickname
   * @return nickname
  **/
  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public EnterpriseLeadsLeadsUserInlineResponse2001Data avatar(String avatar) {
    this.avatar = avatar;
    return this;
  }

   /**
   * Get avatar
   * @return avatar
  **/
  public String getAvatar() {
    return avatar;
  }

  public void setAvatar(String avatar) {
    this.avatar = avatar;
  }

  public EnterpriseLeadsLeadsUserInlineResponse2001Data telephone(String telephone) {
    this.telephone = telephone;
    return this;
  }

   /**
   * Get telephone
   * @return telephone
  **/
  public String getTelephone() {
    return telephone;
  }

  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }

  public EnterpriseLeadsLeadsUserInlineResponse2001Data wechat(String wechat) {
    this.wechat = wechat;
    return this;
  }

   /**
   * Get wechat
   * @return wechat
  **/
  public String getWechat() {
    return wechat;
  }

  public void setWechat(String wechat) {
    this.wechat = wechat;
  }

  public EnterpriseLeadsLeadsUserInlineResponse2001Data city(String city) {
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public EnterpriseLeadsLeadsUserInlineResponse2001Data gender(String gender) {
    this.gender = gender;
    return this;
  }

   /**
   * 性别 * &#x60;0&#x60; - 未知 * &#x60;1&#x60; - 男 * &#x60;2&#x60; - 女 
   * @return gender
  **/
  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public EnterpriseLeadsLeadsUserInlineResponse2001Data age(Integer age) {
    this.age = age;
    return this;
  }

   /**
   * Get age
   * @return age
  **/
  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public EnterpriseLeadsLeadsUserInlineResponse2001Data leadsLevel(LeadsLevelEnum leadsLevel) {
    this.leadsLevel = leadsLevel;
    return this;
  }

   /**
   * 用户状态 * &#x60;-1&#x60; - 没兴趣 * &#x60;0&#x60; - 了解 * &#x60;1&#x60; - 有兴趣 * &#x60;2&#x60; - 有意愿 * &#x60;10&#x60; - 已转化 
   * @return leadsLevel
  **/
  public LeadsLevelEnum getLeadsLevel() {
    return leadsLevel;
  }

  public void setLeadsLevel(LeadsLevelEnum leadsLevel) {
    this.leadsLevel = leadsLevel;
  }

  public EnterpriseLeadsLeadsUserInlineResponse2001Data tagList(List<EnterpriseLeadsLeadsUserInlineResponse200DataTagList> tagList) {
    this.tagList = tagList;
    return this;
  }

  public EnterpriseLeadsLeadsUserInlineResponse2001Data addTagListItem(EnterpriseLeadsLeadsUserInlineResponse200DataTagList tagListItem) {
    if (this.tagList == null) {
      this.tagList = new ArrayList<>();
    }
    this.tagList.add(tagListItem);
    return this;
  }

   /**
   * 绑定的标签列表
   * @return tagList
  **/
  public List<EnterpriseLeadsLeadsUserInlineResponse200DataTagList> getTagList() {
    return tagList;
  }

  public void setTagList(List<EnterpriseLeadsLeadsUserInlineResponse200DataTagList> tagList) {
    this.tagList = tagList;
  }

  public EnterpriseLeadsLeadsUserInlineResponse2001Data isFollow(Boolean isFollow) {
    this.isFollow = isFollow;
    return this;
  }

   /**
   * 当前指定用户是否已关注本企业号
   * @return isFollow
  **/
  public Boolean isIsFollow() {
    return isFollow;
  }

  public void setIsFollow(Boolean isFollow) {
    this.isFollow = isFollow;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnterpriseLeadsLeadsUserInlineResponse2001Data inlineResponse2001Data = (EnterpriseLeadsLeadsUserInlineResponse2001Data) o;
    return Objects.equals(this.errorCode, inlineResponse2001Data.errorCode) &&
        Objects.equals(this.description, inlineResponse2001Data.description) &&
        Objects.equals(this.openId, inlineResponse2001Data.openId) &&
        Objects.equals(this.nickname, inlineResponse2001Data.nickname) &&
        Objects.equals(this.avatar, inlineResponse2001Data.avatar) &&
        Objects.equals(this.telephone, inlineResponse2001Data.telephone) &&
        Objects.equals(this.wechat, inlineResponse2001Data.wechat) &&
        Objects.equals(this.city, inlineResponse2001Data.city) &&
        Objects.equals(this.gender, inlineResponse2001Data.gender) &&
        Objects.equals(this.age, inlineResponse2001Data.age) &&
        Objects.equals(this.leadsLevel, inlineResponse2001Data.leadsLevel) &&
        Objects.equals(this.tagList, inlineResponse2001Data.tagList) &&
        Objects.equals(this.isFollow, inlineResponse2001Data.isFollow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, description, openId, nickname, avatar, telephone, wechat, city, gender, age, leadsLevel, tagList, isFollow);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnterpriseLeadsLeadsUserInlineResponse2001Data {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    openId: ").append(toIndentedString(openId)).append("\n");
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
    sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
    sb.append("    telephone: ").append(toIndentedString(telephone)).append("\n");
    sb.append("    wechat: ").append(toIndentedString(wechat)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    leadsLevel: ").append(toIndentedString(leadsLevel)).append("\n");
    sb.append("    tagList: ").append(toIndentedString(tagList)).append("\n");
    sb.append("    isFollow: ").append(toIndentedString(isFollow)).append("\n");
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
