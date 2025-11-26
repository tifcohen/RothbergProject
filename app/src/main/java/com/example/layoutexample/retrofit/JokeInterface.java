package com.example.layoutexample.retrofit;

import com.example.layoutexample.model.JokeResponseData;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JokeInterface {
    @GET("Programming")
    Call<JokeResponseData> getJoke();
}
