package com.erikmedina.yourweather.domain.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by erik on 25/03/17.
 */

public class AlternateName {

  @SerializedName("name")
  @Expose
  public String name;
  @SerializedName("lang")
  @Expose
  public String lang;
  @SerializedName("isShortName")
  @Expose
  public boolean isShortName;
  @SerializedName("isPreferredName")
  @Expose
  public boolean isPreferredName;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLang() {
    return lang;
  }

  public void setLang(String lang) {
    this.lang = lang;
  }

  public boolean isShortName() {
    return isShortName;
  }

  public void setShortName(boolean shortName) {
    isShortName = shortName;
  }

  public boolean isPreferredName() {
    return isPreferredName;
  }

  public void setPreferredName(boolean preferredName) {
    isPreferredName = preferredName;
  }
}
