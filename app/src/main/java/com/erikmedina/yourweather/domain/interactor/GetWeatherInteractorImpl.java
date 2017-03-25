package com.erikmedina.yourweather.domain.interactor;

import com.erikmedina.yourweather.domain.entity.Weather;
import com.erikmedina.yourweather.domain.service.MyApiEndpointInterface;
import com.erikmedina.yourweather.domain.service.ServiceManager;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by erik on 25/03/17.
 */

class GetWeatherInteractorImpl implements GetWeatherInteractor {

  private MyApiEndpointInterface myApiEndpointInterface;

  public GetWeatherInteractorImpl() {
    myApiEndpointInterface = ServiceManager.createWebService();
  }

  @Override
  public void execute(double north, double south, double east, double west, String username,
      final OnGetWeatherListener listener) {
    Call<Weather> call = myApiEndpointInterface
        .getWeather(north, south, east, west, username);
    call.enqueue(new Callback<Weather>() {
      @Override
      public void onResponse(Call<Weather> call, Response<Weather> response) {
        if (response.isSuccessful()) {
          listener.onGetWeatherSuccess(response.body());
        }
      }

      @Override
      public void onFailure(Call<Weather> call, Throwable t) {
        listener.onGetWeatherError(t.toString());
      }
    });
  }
}
