package com.erikmedina.yourweather.domain.service;

import com.erikmedina.yourweather.BuildConfig;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by erik on 25/03/17.
 */

public class ServiceManager {

  public static MyApiEndpointInterface createWebService() {
    Retrofit retrofit = new Retrofit.Builder()
        .baseUrl(BuildConfig.API_ENDPOINT)
        .addConverterFactory(GsonConverterFactory.create())
        .build();
    return retrofit.create(MyApiEndpointInterface.class);
  }
}
