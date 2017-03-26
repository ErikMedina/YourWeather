package com.erikmedina.yourweather.ui.searchable;

import com.erikmedina.yourweather.domain.entity.Bbox;
import com.erikmedina.yourweather.domain.entity.LocationsInfo;
import com.erikmedina.yourweather.domain.entity.Weather;
import com.erikmedina.yourweather.domain.entity.WeatherObservation;
import com.erikmedina.yourweather.domain.interactor.GetLocationsInfoInteractor;
import com.erikmedina.yourweather.domain.interactor.GetLocationsInfoInteractor.OnGetLocationsInfoListener;
import com.erikmedina.yourweather.domain.interactor.GetLocationsInfoInteractorImpl;
import com.erikmedina.yourweather.domain.interactor.GetWeatherInteractor;
import com.erikmedina.yourweather.domain.interactor.GetWeatherInteractor.OnGetWeatherListener;
import com.erikmedina.yourweather.domain.interactor.GetWeatherInteractorImpl;
import timber.log.Timber;

/**
 * Created by erik on 25/03/17.
 */

class SearchablePresenterImpl implements SearchablePresenter {

  private final int FIRST_ITEM = 0;
  private final int MAX_ROWS = 20;
  private final int START_ROW = 0;
  private final String LANG = "en";
  private final String STYLE = "FULL";
  private final String USERNAME_1 = "ilgeonamessample";
  private final String USERNAME_2 = "demo";

  private SearchableView view;
  private GetLocationsInfoInteractor getLocationsInfoInteractor;
  private GetWeatherInteractor getWeatherInteractor;

  public SearchablePresenterImpl(SearchableView view) {
    this.view = view;
    getLocationsInfoInteractor = new GetLocationsInfoInteractorImpl();
    getWeatherInteractor = new GetWeatherInteractorImpl();
  }

  @Override
  public void searchLocation(String location) {
    getLocationsInfoInteractor
        .execute(location, MAX_ROWS, START_ROW, LANG, true, STYLE, USERNAME_1,
            new OnGetLocationsInfoListener() {
              @Override
              public void onGetLocationsInfoSuccess(LocationsInfo locationsInfo) {
                initView(locationsInfo);
                getWeather(locationsInfo.getGeonames().get(FIRST_ITEM).getBbox());
              }

              @Override
              public void onGetLocationsInfoError(String error) {

              }
            });
  }

  private void initView(LocationsInfo locationsInfo) {
    if (view != null) {
      view.setName(locationsInfo.getGeonames().get(FIRST_ITEM).getName());
      view.setCountryName(locationsInfo.getGeonames().get(FIRST_ITEM).getCountryName());
      view.setMapPosition(Double.parseDouble(locationsInfo.getGeonames().get(FIRST_ITEM).getLat()),
          Double.parseDouble(locationsInfo.getGeonames().get(FIRST_ITEM).getLng()));
    }
  }

  private void getWeather(Bbox bbox) {
    getWeatherInteractor.execute(bbox.getNorth(), bbox.getSouth(), bbox.getEast(), bbox.getWest(),
        USERNAME_1, new OnGetWeatherListener() {
          @Override
          public void onGetWeatherSuccess(Weather weather) {
            getMediumTemperature(weather);
          }

          @Override
          public void onGetWeatherError(String error) {

          }
        });
  }

  private int getMediumTemperature(Weather weather) {
    int mediumTemperature = 0;
    int div = 0;
    for (WeatherObservation weatherObservation : weather.getWeatherObservations()) {
      try {
        int temperature = Integer.parseInt(weatherObservation.getTemperature());
        if (temperature != 0) {
          mediumTemperature += temperature;
          ++div;
        }
      } catch (NumberFormatException e) {
        Timber.e("No se pudo parsear la temperatura");
      }
    }
    return mediumTemperature / div;
  }
}
