package com.example.imageapi.components.network;

import com.example.imageapi.dto.Images;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface IRetrofitApi {

    String API_MAIN_URL = "https://pixabay.com/";
    String KEY = "12055825-e70cbf6e70297050349021fe0";


    @GET("api/")
    Call<Images> getImages(@Query("q") String query,
                           @Query("key") String key,
                           @Query("page") int page);

}
