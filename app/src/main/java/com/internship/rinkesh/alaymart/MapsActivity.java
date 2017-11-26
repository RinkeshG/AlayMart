package com.internship.rinkesh.alaymart;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback, GoogleMap.OnInfoWindowClickListener {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);


        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Added a marker in Chennai

        LatLng pointer = new LatLng(13.081763, 80.276327);
        mMap.addMarker(new MarkerOptions().position(pointer).title("Click to get Nearest Restaurants"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(pointer));
        mMap.setOnInfoWindowClickListener(this);
    }



    @Override
    public void onInfoWindowClick(Marker marker) {

        Intent intent = new Intent(this, MenuList.class);
        startActivity(intent);

    }
}
