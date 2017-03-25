package com.erikmedina.yourweather.domain.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * Created by erik on 25/03/17.
 */

public class LocationInfo {

  @SerializedName("totalResultsCount")
  @Expose
  public int totalResultsCount;
  @SerializedName("geonames")
  @Expose
  public List<Geoname> geonames;

  public int getTotalResultsCount() {
    return totalResultsCount;
  }

  public void setTotalResultsCount(int totalResultsCount) {
    this.totalResultsCount = totalResultsCount;
  }

  public List<Geoname> getGeonames() {
    return geonames;
  }

  public void setGeonames(List<Geoname> geonames) {
    this.geonames = geonames;
  }
}