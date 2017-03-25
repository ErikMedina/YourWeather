package com.erikmedina.yourweather.domain.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * Created by erik on 25/03/17.
 */

public class Weather {

  @SerializedName("weatherObservations")
  @Expose
  private List<WeatherObservation> weatherObservations;

  public List<WeatherObservation> getWeatherObservations() {
    return weatherObservations;
  }

  public void setWeatherObservations(
      List<WeatherObservation> weatherObservations) {
    this.weatherObservations = weatherObservations;
  }
}
