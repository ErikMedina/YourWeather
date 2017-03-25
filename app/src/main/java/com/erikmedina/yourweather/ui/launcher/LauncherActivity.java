package com.erikmedina.yourweather.ui.launcher;

import android.app.SearchManager;
import android.content.ComponentName;
import android.content.Context;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuInflater;
import com.erikmedina.yourweather.R;
import com.erikmedina.yourweather.ui.base.BaseActivity;
import com.erikmedina.yourweather.ui.searchable.SearchableActivity;
import timber.log.Timber;

/**
 * Created by erik on 25/03/17.
 */

public class LauncherActivity extends BaseActivity {

  @Override
  protected int getLayoutResourceId() {
    return R.layout.activity_launcher;
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
        searchManager.getSearchableInfo(new ComponentName(this, SearchableActivity.class)));
    searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
      @Override
      public boolean onQueryTextSubmit(String query) {
        Timber.i("he cliackado buscar");
        return false;
      }

      @Override
      public boolean onQueryTextChange(String newText) {
        return false;
      }
    });
    return true;
  }
}
