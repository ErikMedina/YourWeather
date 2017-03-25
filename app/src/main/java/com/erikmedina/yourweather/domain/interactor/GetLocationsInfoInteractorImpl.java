package com.erikmedina.yourweather.domain.interactor;

import com.erikmedina.yourweather.domain.entity.LocationsInfo;
import com.erikmedina.yourweather.domain.service.MyApiEndpointInterface;
import com.erikmedina.yourweather.domain.service.ServiceManager;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by erik on 25/03/17.
 */

public class GetLocationsInfoInteractorImpl implements GetLocationsInfoInteractor {

  private MyApiEndpointInterface myApiEndpointInterface;

  public GetLocationsInfoInteractorImpl() {
    myApiEndpointInterface = ServiceManager.createWebService();
  }

  @Override
  public void execute(String location, int maxRows, int startRow, String lang,
      boolean isNameRequired, String style, String username,
      final OnGetLocationsInfoListener listener) {
    Call<LocationsInfo> call = myApiEndpointInterface
        .getLocationsInfo(location, maxRows, startRow, lang, isNameRequired, style, username);
    call.enqueue(new Callback<LocationsInfo>() {
      @Override
      public void onResponse(Call<LocationsInfo> call, Response<LocationsInfo> response) {
        if (response.isSuccessful()) {
          listener.onGetLocationsInfoSuccess(response.body());
        }
      }

      @Override
      public void onFailure(Call<LocationsInfo> call, Throwable t) {
        listener.onGetLocationsInfoError(t.toString());
      }
    });
  }
}
