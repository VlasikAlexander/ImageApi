package com.example.imageapi.components.network;

import android.util.Log;

import com.example.imageapi.dto.Hit;
import com.example.imageapi.dto.Images;

import java.util.List;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class NetworkManager implements INetworkManager {

    private final IRetrofitApi[] service = new IRetrofitApi[1];
    private final OkHttpClient httpClient;
    private String currentMainUrl;

    public NetworkManager() {
        final HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        final OkHttpClient.Builder clientBuilder = new OkHttpClient.Builder();
        clientBuilder.addInterceptor(logging);
        clientBuilder.readTimeout(30, TimeUnit.SECONDS);
        clientBuilder.writeTimeout(30, TimeUnit.SECONDS);
        clientBuilder.connectTimeout(30, TimeUnit.SECONDS);
        httpClient = clientBuilder.build();

        service[0] = setupRetrofit(IRetrofitApi.API_MAIN_URL);
    }

    private IRetrofitApi setupRetrofit(String mainUrl) {
        currentMainUrl = mainUrl;

        final Retrofit retrofit = new Retrofit.Builder()
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .client(httpClient)
                .baseUrl(mainUrl)
                .build();
        return retrofit.create(IRetrofitApi.class);
    }

    private IRetrofitApi getService() {
        return service[0];
    }


    @Override
    public void getImages(String query, int page, ICallback<List<Hit>> callback) {
         getService().getImages(query, IRetrofitApi.KEY, page).enqueue(new Callback<Images>() {
            @Override
            public void onResponse(Call<Images> call, Response<Images> response) {

                List<Hit> hits = response.body().getHits();
                callback.onResult(new Result<>(hits));

            }

            @Override
            public void onFailure(Call<Images> call, Throwable t) {
                Log.d("HITS","fail");
                t.printStackTrace();
            }
        });
    }
}
