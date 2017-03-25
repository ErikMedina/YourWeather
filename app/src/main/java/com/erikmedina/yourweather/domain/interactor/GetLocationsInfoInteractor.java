package com.erikmedina.yourweather.domain.interactor;

import com.erikmedina.yourweather.domain.entity.LocationsInfo;

/**
 * Created by erik on 25/03/17.
 */

public interface GetLocationsInfoInteractor {

  interface OnGetLocationsInfoListener {

    void onGetLocationsInfoSuccess(LocationsInfo locationsInfo);

    void onGetLocationsInfoError(String error);
  }

  void execute(String location, int maxRows, int startRow, String lang, boolean isNameRequired,
      String style, String username, OnGetLocationsInfoListener listener);
}
