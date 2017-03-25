package com.erikmedina.yourweather.domain.interactor;

import com.erikmedina.yourweather.domain.entity.Weather;

/**
 * Created by erik on 25/03/17.
 */

public interface GetWeatherInteractor {

  interface OnGetWeatherListener {

    void onGetWeatherSuccess(Weather weather);

    void onGetWeatherError(String error);
  }

  void execute(double north, double south, double east, double west, String username,
      OnGetWeatherListener listener);
}
