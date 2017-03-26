package com.erikmedina.yourweather.domain.service;

import com.erikmedina.yourweather.BuildConfig;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import okhttp3.logging.HttpLoggingInterceptor.Level;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by erik on 25/03/17.
 */

public class ServiceManager {

  public static MyApiEndpointInterface createWebService() {
    HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
    logging.setLevel(Level.BODY);
    OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
    httpClient.addInterceptor(logging);

    Retrofit retrofit = new Retrofit.Builder()
        .baseUrl(BuildConfig.API_ENDPOINT)
        .addConverterFactory(GsonConverterFactory.create())
        .client(httpClient.build())
        .build();
    return retrofit.create(MyApiEndpointInterface.class);
  }
}
