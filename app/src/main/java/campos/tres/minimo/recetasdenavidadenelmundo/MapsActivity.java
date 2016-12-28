package campos.tres.minimo.recetasdenavidadenelmundo;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback,GoogleMap.OnMarkerClickListener{

    private GoogleMap mMap;
    private Marker mSydney;
    private Marker mBerlin;
    private Marker mBolivia;
    private Marker mItalia;
    private Marker mHaiti;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
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

        mSydney = mMap.addMarker(new MarkerOptions().position(new LatLng(-34, 151)).title("sydney"));
        mBerlin = mMap.addMarker(new MarkerOptions().position(new LatLng(52.5068323,13.3454594)).title("berlin"));
        mBolivia = mMap.addMarker(new MarkerOptions().position(new LatLng(-16.236275,-68.0438126)).title("bolivia"));
        mItalia = mMap.addMarker(new MarkerOptions().position(new LatLng(41.2053063,8.0859585)).title("italia"));
        mHaiti = mMap.addMarker(new MarkerOptions().position(new LatLng(18.5748693,-76.7884958)).title("haiti"));

        googleMap.setOnMarkerClickListener(this);

    }

    @Override
    public boolean onMarkerClick(Marker marker) {
        Intent intent = new Intent(this,MisRecetas.class);
        if(marker.getTitle().equals("sydney"))
        {
            /*Toast.makeText(getApplicationContext(),"hola",Toast.LENGTH_SHORT).show();*/
            intent.putExtra("DATO",1);
            startActivity(intent);
        }
        if(marker.getTitle().equals("berlin"))
        {
            intent.putExtra("DATO",2);
            startActivity(intent);

        }
        if(marker.getTitle().equals("bolivia"))
        {
            intent.putExtra("DATO",3);
            startActivity(intent);

        }
        if(marker.getTitle().equals("italia"))
        {
            intent.putExtra("DATO",4);
            startActivity(intent);

        }
        if(marker.getTitle().equals("haiti"))
        {
            intent.putExtra("DATO",5);
            startActivity(intent);

        }
        return false;
    }

}
