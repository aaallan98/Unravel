package com.example.apple.navigate;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivityCurrency extends AppCompatActivity {

    private ListView lvCurrencyNames;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String[] currencyNames = {"AUD",
                "BGN", "BRL", "CAD", "CHF", "CNY", "CZK", "DKK", "EUR", "GBP",
                "HKD", "HRK", "HUF", "IDR", "ILS", "INR", "JPY", "KRW",
                "MXN", "MYR", "NOK", "NZD", "PHP", "PLN", "RON", "RUB",
                "SEK", "SGD", "THB", "TRY", "USD", "ZAR" };
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_currency);
        ListView lvCurrencyNames = (ListView) findViewById(R.id.inputCurrency);
        try {
            final ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, currencyNames);
            lvCurrencyNames.setAdapter(adapter);
            lvCurrencyNames.setOnItemClickListener(new AdapterView.OnItemClickListener(){


                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    String currencyName =(String) adapterView.getItemAtPosition(i);
                    Toast.makeText(view.getContext(), "plan to convert " + currencyName + ".", Toast.LENGTH_SHORT).show();
                    Intent a = new Intent(view.getContext(), ConvertInto.class);
                    a.putExtra("Country", currencyName);
                    startActivity(a);
                }
            });
        }
        catch (Exception e){
            e.printStackTrace();
        }


    }








}
