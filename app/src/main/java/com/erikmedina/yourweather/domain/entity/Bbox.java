package com.erikmedina.yourweather.domain.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by erik on 25/03/17.
 */

public class Bbox {

  @SerializedName("east")
  @Expose
  private double east;
  @SerializedName("south")
  @Expose
  private double south;
  @SerializedName("north")
  @Expose
  private double north;
  @SerializedName("west")
  @Expose
  private double west;
  @SerializedName("accuracyLevel")
  @Expose
  private int accuracyLevel;

  public double getEast() {
    return east;
  }

  public void setEast(double east) {
    this.east = east;
  }

  public double getSouth() {
    return south;
  }

  public void setSouth(double south) {
    this.south = south;
  }

  public double getNorth() {
    return north;
  }

  public void setNorth(double north) {
    this.north = north;
  }

  public double getWest() {
    return west;
  }

  public void setWest(double west) {
    this.west = west;
  }

  public int getAccuracyLevel() {
    return accuracyLevel;
  }

  public void setAccuracyLevel(int accuracyLevel) {
    this.accuracyLevel = accuracyLevel;
  }
}
