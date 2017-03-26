package com.erikmedina.yourweather;

import android.app.Application;
import android.content.Context;
import com.erikmedina.yourweather.util.log.CrashReportingTree;
import timber.log.Timber;

/**
 * Created by erik on 25/03/17.
 */

public class MyApplication extends Application {

  private static Context context;

  @Override
  public void onCreate() {
    super.onCreate();
    context = this;
    configTimber();
  }

  private void configTimber() {
    if (BuildConfig.DEBUG) {
      Timber.plant(new Timber.DebugTree());
    } else {
      Timber.plant(new CrashReportingTree());
    }
  }

  public static Context getContext() {
    return context;
  }
}
