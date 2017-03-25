package com.erikmedina.yourweather.ui.searchable;

import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import com.erikmedina.yourweather.R;
import com.erikmedina.yourweather.ui.base.BaseActivity;

public class SearchableActivity extends BaseActivity
    implements SearchableView {

  SearchablePresenter searchablePresenter;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    searchablePresenter = new SearchablePresenterImpl(this);
    handleIntent(getIntent());
  }

  @Override
  protected int getLayoutResourceId() {
    return R.layout.activity_searchable;
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
