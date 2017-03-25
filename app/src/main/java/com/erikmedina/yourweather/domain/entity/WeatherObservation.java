package com.erikmedina.yourweather.domain.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by erik on 25/03/17.
 */

public class WeatherObservation {

  @SerializedName("lng")
  @Expose
  private double lng;
  @SerializedName("observation")
  @Expose
  private String observation;
  @SerializedName("ICAO")
  @Expose
  private String iCAO;
  @SerializedName("clouds")
  @Expose
  private String clouds;
  @SerializedName("dewPoint")
  @Expose
  private String dewPoint;
  @SerializedName("datetime")
  @Expose
  private String datetime;
  @SerializedName("temperature")
  @Expose
  private String temperature;
  @SerializedName("humidity")
  @Expose
  private int humidity;
  @SerializedName("stationName")
  @Expose
  private String stationName;
  @SerializedName("weatherCondition")
  @Expose
  private String weatherCondition;
  @SerializedName("windDirection")
  @Expose
  private int windDirection;
  @SerializedName("windSpeed")
  @Expose
  private String windSpeed;
  @SerializedName("lat")
  @Expose
  private double lat;
  @SerializedName("weatherConditionCode")
  @Expose
  private String weatherConditionCode;
  @SerializedName("cloudsCode")
  @Expose
  private String cloudsCode;

  public double getLng() {
    return lng;
  }

  public void setLng(double lng) {
    this.lng = lng;
  }

  public String getObservation() {
    return observation;
  }

  public void setObservation(String observation) {
    this.observation = observation;
  }

  public String getiCAO() {
    return iCAO;
  }

  public void setiCAO(String iCAO) {
    this.iCAO = iCAO;
  }

  public String getClouds() {
    return clouds;
  }

  public void setClouds(String clouds) {
    this.clouds = clouds;
  }

  public String getDewPoint() {
    return dewPoint;
  }

  public void setDewPoint(String dewPoint) {
    this.dewPoint = dewPoint;
  }

  public String getDatetime() {
    return datetime;
  }

  public void setDatetime(String datetime) {
    this.datetime = datetime;
  }

  public String getTemperature() {
    return temperature;
  }

  public void setTemperature(String temperature) {
    this.temperature = temperature;
  }

  public int getHumidity() {
    return humidity;
  }

  public void setHumidity(int humidity) {
    this.humidity = humidity;
  }

  public String getStationName() {
    return stationName;
  }

  public void setStationName(String stationName) {
    this.stationName = stationName;
  }

  public String getWeatherCondition() {
    return weatherCondition;
  }

  public void setWeatherCondition(String weatherCondition) {
    this.weatherCondition = weatherCondition;
  }

  public int getWindDirection() {
    return windDirection;
  }

  public void setWindDirection(int windDirection) {
    this.windDirection = windDirection;
  }

  public String getWindSpeed() {
    return windSpeed;
  }

  public void setWindSpeed(String windSpeed) {
    this.windSpeed = windSpeed;
  }

  public double getLat() {
    return lat;
  }

  public void setLat(double lat) {
    this.lat = lat;
  }

  public String getWeatherConditionCode() {
    return weatherConditionCode;
  }

  public void setWeatherConditionCode(String weatherConditionCode) {
    this.weatherConditionCode = weatherConditionCode;
  }

  public String getCloudsCode() {
    return cloudsCode;
  }

  public void setCloudsCode(String cloudsCode) {
    this.cloudsCode = cloudsCode;
  }
}
