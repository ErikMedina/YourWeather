package com.erikmedina.yourweather.ui.search;

import android.os.Bundle;
import com.erikmedina.yourweather.R;
import com.erikmedina.yourweather.ui.base.BaseActivity;

public class SearchActivity extends BaseActivity
    implements SearchView {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }
}
