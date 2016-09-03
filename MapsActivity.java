package com.example.admin.pokemongo;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        //Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.mapView);
       mapFragment.getMapAsync(this);
        createMapView();
        addMarker();
        setTitle(getString(R.string. p_name));
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        //LatLng sydney = new LatLng(-34, 151);
        // mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }

    private void createMapView() {
        try{
            if(null == mMap){
                //mMap = ((MapFragment)getFragmentManager().findFragmentById(R.id.mapView)).getMapAsync(this);
                if( null == mMap ) {
                    Toast. makeText(getApplicationContext(),
                            "Error creating map",Toast. LENGTH_SHORT).show();
                }
            }
        } catch (NullPointerException exception){
            Log.e( "mapApp" , exception.toString());
        }
            }
    private void addMarker()
    {
        double lat = CameraViewActivity.TARGET_LATITUDE;
        double lng = CameraViewActivity.TARGET_LONGITUDE;

        CameraPosition cameraPosition = new CameraPosition.Builder()
                .target(new LatLng(lat, lng))
                .zoom(15)
                .build();
        CameraUpdate cameraUpdate = CameraUpdateFactory.newCameraPosition(cameraPosition);
        mMap.animateCamera(cameraUpdate);

        if( null != mMap ){
            mMap.addMarker( new MarkerOptions()
                    .position( new LatLng(lat, lng))
                    .title(getString(R.string. p_name ))
                    .draggable( false )
            );
        }
    }
}
