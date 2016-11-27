package com.example.apple.navigate;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import static android.R.attr.fragment;
import static com.example.apple.navigate.R.id.map;


/**
 * Created by seoye on 2016-11-25.
 */

public class GMapFragment extends Fragment implements OnMapReadyCallback{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.fragment_gmap, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        MapFragment fragment =(MapFragment) getChildFragmentManager().findFragmentById(map);
        fragment.getMapAsync(this);




    }



    @Override
    public void onMapReady(GoogleMap googleMap) {
        LatLng marker = new LatLng(0,0);
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(marker,0));
        googleMap.addMarker(new MarkerOptions().title("Hello").position(marker));
    }
}

