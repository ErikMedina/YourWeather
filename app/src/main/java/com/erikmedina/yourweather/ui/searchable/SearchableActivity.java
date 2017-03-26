package com.erikmedina.yourweather.ui.searchable;

import android.animation.ObjectAnimator;
import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.provider.SearchRecentSuggestions;
import android.support.v4.app.FragmentActivity;
import android.view.animation.LinearInterpolator;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.erikmedina.yourweather.R;
import com.erikmedina.yourweather.util.suggestion.MySuggestionProvider;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;

public class SearchableActivity extends FragmentActivity
    implements SearchableView {

  SearchablePresenter searchablePresenter;
  @BindView(R.id.tv_name)
  TextView tvName;
  @BindView(R.id.tv_country_name)
  TextView tvCountryName;
  SupportMapFragment mapFragment;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_searchable);
    ButterKnife.bind(this);
    searchablePresenter = new SearchablePresenterImpl(this);
    handleIntent(getIntent());
    mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
  }

  @Override
  protected void onNewIntent(Intent intent) {
    handleIntent(intent);
  }

  private void handleIntent(Intent intent) {
    if (Intent.ACTION_SEARCH.equals(intent.getAction())) {
      String query = intent.getStringExtra(SearchManager.QUERY);
      SearchRecentSuggestions suggestions = new SearchRecentSuggestions(this,
          MySuggestionProvider.AUTHORITY, MySuggestionProvider.MODE);
      suggestions.saveRecentQuery(query, null);
      searchablePresenter.searchLocation(query);
    }
  }

  @Override
  public void setName(String name) {
    tvName.setText(name);
  }

  @Override
  public void setCountryName(String countryName) {
    tvCountryName.setText(countryName);
  }

  @Override
  public void setMapPosition(final double lat, final double lng) {
    mapFragment.getMapAsync(new OnMapReadyCallback() {
      @Override
      public void onMapReady(GoogleMap googleMap) {

        googleMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
        final LatLng LOCATION_1 = new LatLng(lat, lng);
        CameraPosition cameraPosition = new CameraPosition.Builder()
            .target(LOCATION_1)
            .zoom(15)
            .tilt(30)
            .build();
        googleMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
      }
    });
  }

  @Override
  public void setTemperature(int mediumTemperature) {
    ProgressBar mProgressBar = (ProgressBar) findViewById(R.id.pb_loading);
    ObjectAnimator progressAnimator = ObjectAnimator
        .ofInt(mProgressBar, "progress", 0, mediumTemperature);
    progressAnimator.setDuration(1000);
    progressAnimator.setInterpolator(new LinearInterpolator());
    progressAnimator.start();
  }

  @Override
  public void showMessage(String message) {
    Toast.makeText(this, message, Toast.LENGTH_LONG).show();
  }
}
