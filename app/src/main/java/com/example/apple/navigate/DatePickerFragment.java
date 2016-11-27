package com.example.apple.navigate;


import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;


/**
 * A simple {@link Fragment} subclass.
 */
public class DatePickerFragment extends DialogFragment implements DatePickerDialog.OnDateSetListener {

    public DatePickerFragment() {
        // Required empty public constructor
    }

    @Override
    public Dialog onCreateDialog (Bundle savedInstanceState){

        final Calendar c = Calendar.getInstance();
        int year= c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c. get(Calendar.DAY_OF_MONTH);

        return new DatePickerDialog(getActivity(), this, year, month, day);
    }

    public void onDateSet(DatePicker view , int year, int month, int day){
        TextView Date = (TextView) getActivity().findViewById(R.id.Date);
        Date.setText(view.getDayOfMonth() + "," + view.getMonth() + "," + view.getYear() );
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return this.getView();
    }

}
