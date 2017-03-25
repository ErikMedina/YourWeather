package com.erikmedina.yourweather.ui.searchable;

import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import butterknife.OnClick;
import com.erikmedina.yourweather.R;
import com.erikmedina.yourweather.ui.base.BaseActivity;

public class SearchableActivity extends BaseActivity
    implements SearchableView {

  SearchablePresenter searchablePresenter;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    searchablePresenter = new SearchablePresenterImpl(this);

    Intent intent = getIntent();
    if (Intent.ACTION_SEARCH.equals(intent.getAction())) {
      String query = intent.getStringExtra(SearchManager.QUERY);
    }

  }





  @Override
  protected int getLayoutResourceId() {
    return R.layout.activity_search;
  }

  @OnClick(R.id.b_search)
  public void onButtonSearchClicked() {
    searchablePresenter.searchLocation("Madrid");
  }
}
