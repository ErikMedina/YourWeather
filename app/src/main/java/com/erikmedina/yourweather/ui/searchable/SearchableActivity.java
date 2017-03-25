package com.erikmedina.yourweather.ui.searchable;

import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.erikmedina.yourweather.R;

public class SearchableActivity extends FragmentActivity
    implements SearchableView {

  SearchablePresenter searchablePresenter;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_searchable);
    searchablePresenter = new SearchablePresenterImpl(this);
    handleIntent(getIntent());
  }

  @Override
  protected void onNewIntent(Intent intent) {
    handleIntent(intent);
  }

  private void handleIntent(Intent intent) {
    if (Intent.ACTION_SEARCH.equals(intent.getAction())) {
      String query = intent.getStringExtra(SearchManager.QUERY);
      searchablePresenter.searchLocation(query);
    }
  }
}
