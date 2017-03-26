package com.erikmedina.yourweather.util.suggestion;

import android.content.SearchRecentSuggestionsProvider;

/**
 * Created by erik on 26/03/17.
 */

public class MySuggestionProvider extends SearchRecentSuggestionsProvider {

  public final static String AUTHORITY = "com.example.MySuggestionProvider";
  public final static int MODE = DATABASE_MODE_QUERIES;

  public MySuggestionProvider() {
    setupSuggestions(AUTHORITY, MODE);
  }
}
