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
 * ExternalDataItemExternalDataItemExternalItemPlay
 */

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class ExternalDataItemExternalDataItemExternalItemPlay {
  @JsonProperty("date")
  private String date = null;

  @JsonProperty("play")
  private Integer play = null;

  public ExternalDataItemExternalDataItemExternalItemPlay date(String date) {
    this.date = date;
    return this;
  }

   /**
   * 日期
   * @return date
  **/
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public ExternalDataItemExternalDataItemExternalItemPlay play(Integer play) {
    this.play = play;
    return this;
  }

   /**
   * 每日播放数
   * @return play
  **/
  public Integer getPlay() {
    return play;
  }

  public void setPlay(Integer play) {
    this.play = play;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalDataItemExternalDataItemExternalItemPlay externalItemPlay = (ExternalDataItemExternalDataItemExternalItemPlay) o;
    return Objects.equals(this.date, externalItemPlay.date) &&
        Objects.equals(this.play, externalItemPlay.play);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, play);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalDataItemExternalDataItemExternalItemPlay {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    play: ").append(toIndentedString(play)).append("\n");
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