package com.example.apple.navigate;

import android.content.Intent;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ConvertInto extends AppCompatActivity implements Callback<CurrencyExchange>, CurrencyItemClickListener {

    private ListView lvCurrency;
    private String Country;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convert_into);
        lvCurrency = (ListView) findViewById(R.id.lvCurrency);

        Intent intent = getIntent();
        Country = intent.getStringExtra("Country");
    }

    @Override
    protected void onStart() {
        super.onStart();
        loadCurrencyExchangeData();
    }

    private void loadCurrencyExchangeData(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://api.fixer.io/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        CurrencyExchangeService service = retrofit.create(CurrencyExchangeService.class);
        Call<CurrencyExchange> call = service.loadCurrencyExchange();
        call.enqueue(this);
    }

    @Override
    public void onResponse(Call<CurrencyExchange> call, Response<CurrencyExchange> response) {
        //Toast.makeText(this, response.body().getBase(), Toast.LENGTH_LONG).show();
        CurrencyExchange currencyExchange = response.body();
        lvCurrency.setAdapter(new CurrencyAdapter(this, currencyExchange.getCurrencyList(Country), this));
    }

    @Override
    public void onFailure(Call<CurrencyExchange> call, Throwable t) {
        Toast.makeText(this, t.getMessage(), Toast.LENGTH_LONG).show();
    }

    @Override
    public void onCurrencyItemClick(Currency c) {
        //Toast.makeText(this, c.getName(), Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this, CalculateActivity.class);
        intent.putExtra("currency_name", c.getName());
        intent.putExtra("currency_rate", c.getRate());
        intent.putExtra("Country", Country);

        startActivity(intent);
    }
}

