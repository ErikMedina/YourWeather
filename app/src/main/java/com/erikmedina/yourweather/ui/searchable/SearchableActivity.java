package com.erikmedina.yourweather.ui.searchable;

import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.erikmedina.yourweather.R;
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
            .bearing(90)
            .tilt(30)
            .build();
        googleMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));

      }
    });
  }
}
