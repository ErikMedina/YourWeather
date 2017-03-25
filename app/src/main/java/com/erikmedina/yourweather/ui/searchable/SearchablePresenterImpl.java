package com.erikmedina.yourweather.ui.searchable;

import com.erikmedina.yourweather.domain.entity.LocationsInfo;
import com.erikmedina.yourweather.domain.interactor.GetLocationsInfoInteractor;
import com.erikmedina.yourweather.domain.interactor.GetLocationsInfoInteractor.OnGetLocationsInfoListener;
import com.erikmedina.yourweather.domain.interactor.GetLocationsInfoInteractorImpl;

/**
 * Created by erik on 25/03/17.
 */

class SearchablePresenterImpl implements SearchablePresenter {

  private final int MAX_ROWS = 20;
  private final int START_ROW = 0;
  private final String LANG = "en";
  private final String STYLE = "FULL";
  private final String USERNAME_1 = "ilgeonamessample";
  private final String USERNAME_2 = "demo";

  private SearchableView view;
  private GetLocationsInfoInteractor getLocationsInfoInteractor;

  public SearchablePresenterImpl(SearchableView view) {
    this.view = view;
    getLocationsInfoInteractor = new GetLocationsInfoInteractorImpl();
  }

  @Override
  public void searchLocation(String location) {
    getLocationsInfoInteractor
        .execute(location, MAX_ROWS, START_ROW, LANG, true, STYLE, USERNAME_1,
            new OnGetLocationsInfoListener() {
              @Override
              public void onGetLocationsInfoSuccess(LocationsInfo locationsInfo) {
//               getWeather(locationsInfo.getGeonames().g);
              }

              @Override
              public void onGetLocationsInfoError(String error) {

              }
            });
  }
}
