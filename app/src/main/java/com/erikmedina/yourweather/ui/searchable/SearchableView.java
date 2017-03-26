package com.erikmedina.yourweather.ui.searchable;

/**
 * Created by erik on 25/03/17.
 */

public interface SearchableView {

  void setName(String name);

  void setCountryName(String countryName);

  void setMapPosition(double lat, double lng);

  void setTemperature(int mediumTemperature);
}
