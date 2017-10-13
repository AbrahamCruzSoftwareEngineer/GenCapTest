package com.example.myapplication;

import com.example.myapplication.entities.ResultApus;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

/**
 * Created by Albrtx on 13/10/2017.
 */

public interface RetrofitManager {
    String API_URL = "https://api.spacexdata.com/";

    @GET("/v1/launches")
    Call<List<ResultApus>> getLaunches();

    class Factory {
        RetrofitManager generateRetrofitManager() {
            return new Retrofit.Builder()
                    .baseUrl(API_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
                    .create(RetrofitManager.class);
        }
    }
}
