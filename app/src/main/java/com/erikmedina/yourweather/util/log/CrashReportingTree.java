package com.erikmedina.yourweather.util.log;

import android.util.Log;
import timber.log.Timber;

/**
 * Created by erik on 25/03/17.
 */

public class CrashReportingTree extends Timber.Tree {

  @Override
  protected void log(int priority, String tag, String message, Throwable t) {
    if (priority == Log.VERBOSE || priority == Log.DEBUG) {
      return;
    }
  }
}
