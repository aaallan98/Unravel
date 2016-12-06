package com.example.apple.navigate;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class CountryFragment extends Fragment implements View.OnClickListener{
    public CountryFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_country, container, false);

        ImageView koreaiv = (ImageView) v.findViewById(R.id.imageKorea);
        koreaiv.setOnClickListener(this);
        ImageView usaiv = (ImageView) v.findViewById(R.id.imageUsa);
        usaiv.setOnClickListener(this);
        ImageView chinaiv = (ImageView) v.findViewById(R.id.imageChina);
        chinaiv.setOnClickListener(this);


        return v;
    }


    @Override

    public void onClick(View v) {
        if(v.getId() == R.id.imageKorea) {
            ExploreKoreaFragment fragment1 = new ExploreKoreaFragment();
            android.support.v4.app.FragmentTransaction fragmentTransaction =
                    getFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, fragment1);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
        else if (v.getId() == R.id.imageUsa) {

            ExploreUsaFragment fragment2 = new ExploreUsaFragment();
            android.support.v4.app.FragmentTransaction fragmentTransaction =
                    getFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, fragment2);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
        else if(v.getId() == R.id.imageChina) {
            ExploreChinaFragment fragment3 = new ExploreChinaFragment();
            android.support.v4.app.FragmentTransaction fragmentTransaction =
                    getFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, fragment3);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

}

