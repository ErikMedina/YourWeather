package com.erikmedina.yourweather.domain.service;

import com.erikmedina.yourweather.domain.entity.LocationsInfo;
import com.erikmedina.yourweather.domain.entity.Weather;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by erik on 25/03/17.
 */

public interface MyApiEndpointInterface {

  @GET("searchJSON")
  Call<LocationsInfo> getLocationsInfo(
      @Query("q") String city,
      @Query("maxRows") int maxRows,
      @Query("startRow") int startRow,
      @Query("lang") String language,
      @Query("isNameRequired") boolean isNameRequired,
      @Query("style") String style,
      @Query("username") String username
  );

  @GET("weatherJSON")
  Call<Weather> getWeather(
      @Query("north") double north,
      @Query("south") double south,
      @Query("east") double east,
      @Query("west") double west,
      @Query("username") String username
  );
}