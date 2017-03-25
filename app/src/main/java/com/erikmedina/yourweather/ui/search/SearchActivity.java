package com.erikmedina.yourweather.ui.search;

import android.os.Bundle;
import butterknife.OnClick;
import com.erikmedina.yourweather.R;
import com.erikmedina.yourweather.ui.base.BaseActivity;

public class SearchActivity extends BaseActivity
    implements SearchView {

  SearchPresenter searchPresenter;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    searchPresenter = new SearchPresenterImpl();
  }

  @Override
  protected int getLayoutResourceId() {
    return R.layout.activity_main;
  }

  @OnClick(R.id.b_search)
  public void onButtonSearchClicked() {
    searchPresenter.searchLocation("Madrid");
  }
}
