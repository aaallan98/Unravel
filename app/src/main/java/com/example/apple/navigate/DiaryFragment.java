package com.example.apple.navigate;


import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class DiaryFragment extends Fragment {
    //FloatingActionButton DateButton;
   // int year_x, month_x,day_x;
    //static final int Dialog_ID =0;


    public DiaryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_diary, container, false);
    }

    //public void showDialog(){
       // DateButton = (FloatingActionButton)
    //}

}
