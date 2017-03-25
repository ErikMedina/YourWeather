package com.erikmedina.yourweather.ui.launch;

import android.app.SearchManager;
import android.content.Context;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuInflater;
import com.erikmedina.yourweather.R;
import com.erikmedina.yourweather.ui.base.BaseActivity;

/**
 * Created by erik on 25/03/17.
 */

public class LaunchActivity extends BaseActivity {

  @Override
  protected int getLayoutResourceId() {
    return R.layout.activity_search;
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    MenuInflater inflater = getMenuInflater();
    inflater.inflate(R.menu.options_menu, menu);

    SearchManager searchManager =
        (SearchManager) getSystemService(Context.SEARCH_SERVICE);
    SearchView searchView =
        (SearchView) menu.findItem(R.id.search).getActionView();
    searchView.setSearchableInfo(
        searchManager.getSearchableInfo(getComponentName()));
    return true;
  }
}
