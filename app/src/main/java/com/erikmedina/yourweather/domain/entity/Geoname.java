package com.erikmedina.yourweather.domain.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * Created by erik on 25/03/17.
 */

public class Geoname {

  @SerializedName("timezone")
  @Expose
  public Timezone timezone;
  @SerializedName("bbox")
  @Expose
  public Bbox bbox;
  @SerializedName("asciiName")
  @Expose
  public String asciiName;
  @SerializedName("countryId")
  @Expose
  public String countryId;
  @SerializedName("fcl")
  @Expose
  public String fcl;
  @SerializedName("score")
  @Expose
  public double score;
  @SerializedName("adminId2")
  @Expose
  public String adminId2;
  @SerializedName("adminId3")
  @Expose
  public String adminId3;
  @SerializedName("countryCode")
  @Expose
  public String countryCode;
  @SerializedName("adminId1")
  @Expose
  public String adminId1;
  @SerializedName("lat")
  @Expose
  public String lat;
  @SerializedName("fcode")
  @Expose
  public String fcode;
  @SerializedName("continentCode")
  @Expose
  public String continentCode;
  @SerializedName("adminCode2")
  @Expose
  public String adminCode2;
  @SerializedName("adminCode3")
  @Expose
  public String adminCode3;
  @SerializedName("adminCode1")
  @Expose
  public String adminCode1;
  @SerializedName("lng")
  @Expose
  public String lng;
  @SerializedName("geonameId")
  @Expose
  public int geonameId;
  @SerializedName("toponymName")
  @Expose
  public String toponymName;
  @SerializedName("population")
  @Expose
  public int population;
  @SerializedName("adminName5")
  @Expose
  public String adminName5;
  @SerializedName("adminName4")
  @Expose
  public String adminName4;
  @SerializedName("adminName3")
  @Expose
  public String adminName3;
  @SerializedName("alternateNames")
  @Expose
  public List<AlternateName> alternateNames = null;
  @SerializedName("adminName2")
  @Expose
  public String adminName2;
  @SerializedName("name")
  @Expose
  public String name;
  @SerializedName("fclName")
  @Expose
  public String fclName;
  @SerializedName("countryName")
  @Expose
  public String countryName;
  @SerializedName("fcodeName")
  @Expose
  public String fcodeName;
  @SerializedName("adminName1")
  @Expose
  public String adminName1;
  @SerializedName("adminTypeName")
  @Expose
  public String adminTypeName;
  @SerializedName("elevation")
  @Expose
  public int elevation;
  @SerializedName("cc2")
  @Expose
  public String cc2;

  public Timezone getTimezone() {
    return timezone;
  }

  public void setTimezone(Timezone timezone) {
    this.timezone = timezone;
  }

  public Bbox getBbox() {
    return bbox;
  }

  public void setBbox(Bbox bbox) {
    this.bbox = bbox;
  }

  public String getAsciiName() {
    return asciiName;
  }

  public void setAsciiName(String asciiName) {
    this.asciiName = asciiName;
  }

  public String getCountryId() {
    return countryId;
  }

  public void setCountryId(String countryId) {
    this.countryId = countryId;
  }

  public String getFcl() {
    return fcl;
  }

  public void setFcl(String fcl) {
    this.fcl = fcl;
  }

  public double getScore() {
    return score;
  }

  public void setScore(double score) {
    this.score = score;
  }

  public String getAdminId2() {
    return adminId2;
  }

  public void setAdminId2(String adminId2) {
    this.adminId2 = adminId2;
  }

  public String getAdminId3() {
    return adminId3;
  }

  public void setAdminId3(String adminId3) {
    this.adminId3 = adminId3;
  }

  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public String getAdminId1() {
    return adminId1;
  }

  public void setAdminId1(String adminId1) {
    this.adminId1 = adminId1;
  }

  public String getLat() {
    return lat;
  }

  public void setLat(String lat) {
    this.lat = lat;
  }

  public String getFcode() {
    return fcode;
  }

  public void setFcode(String fcode) {
    this.fcode = fcode;
  }

  public String getContinentCode() {
    return continentCode;
  }

  public void setContinentCode(String continentCode) {
    this.continentCode = continentCode;
  }

  public String getAdminCode2() {
    return adminCode2;
  }

  public void setAdminCode2(String adminCode2) {
    this.adminCode2 = adminCode2;
  }

  public String getAdminCode3() {
    return adminCode3;
  }

  public void setAdminCode3(String adminCode3) {
    this.adminCode3 = adminCode3;
  }

  public String getAdminCode1() {
    return adminCode1;
  }

  public void setAdminCode1(String adminCode1) {
    this.adminCode1 = adminCode1;
  }

  public String getLng() {
    return lng;
  }

  public void setLng(String lng) {
    this.lng = lng;
  }

  public int getGeonameId() {
    return geonameId;
  }

  public void setGeonameId(int geonameId) {
    this.geonameId = geonameId;
  }

  public String getToponymName() {
    return toponymName;
  }

  public void setToponymName(String toponymName) {
    this.toponymName = toponymName;
  }

  public int getPopulation() {
    return population;
  }

  public void setPopulation(int population) {
    this.population = population;
  }

  public String getAdminName5() {
    return adminName5;
  }

  public void setAdminName5(String adminName5) {
    this.adminName5 = adminName5;
  }

  public String getAdminName4() {
    return adminName4;
  }

  public void setAdminName4(String adminName4) {
    this.adminName4 = adminName4;
  }

  public String getAdminName3() {
    return adminName3;
  }

  public void setAdminName3(String adminName3) {
    this.adminName3 = adminName3;
  }

  public List<AlternateName> getAlternateNames() {
    return alternateNames;
  }

  public void setAlternateNames(
      List<AlternateName> alternateNames) {
    this.alternateNames = alternateNames;
  }

  public String getAdminName2() {
    return adminName2;
  }

  public void setAdminName2(String adminName2) {
    this.adminName2 = adminName2;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getFclName() {
    return fclName;
  }

  public void setFclName(String fclName) {
    this.fclName = fclName;
  }

  public String getCountryName() {
    return countryName;
  }

  public void setCountryName(String countryName) {
    this.countryName = countryName;
  }

  public String getFcodeName() {
    return fcodeName;
  }

  public void setFcodeName(String fcodeName) {
    this.fcodeName = fcodeName;
  }

  public String getAdminName1() {
    return adminName1;
  }

  public void setAdminName1(String adminName1) {
    this.adminName1 = adminName1;
  }

  public String getAdminTypeName() {
    return adminTypeName;
  }

  public void setAdminTypeName(String adminTypeName) {
    this.adminTypeName = adminTypeName;
  }

  public int getElevation() {
    return elevation;
  }

  public void setElevation(int elevation) {
    this.elevation = elevation;
  }

  public String getCc2() {
    return cc2;
  }

  public void setCc2(String cc2) {
    this.cc2 = cc2;
  }
}
