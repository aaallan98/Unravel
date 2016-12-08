package com.example.apple.navigate;

/**
 * Created by bolei on 12/7/2016.
 */
import retrofit2.Call;
import retrofit2.http.GET;


public interface CurrencyExchangeService {
    @GET("latest")
    Call<CurrencyExchange> loadCurrencyExchange();
}
