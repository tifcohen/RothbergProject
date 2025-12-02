package com.example.layoutexample.repository;

import com.example.layoutexample.model.JokeResponseData;
import com.example.layoutexample.retrofit.RetrofitJokeInstance;

import retrofit2.Call;

public class JokesRepository {

    private static JokesRepository instance;

    private JokesRepository() { }

    public static synchronized JokesRepository getInstance() {
        if (instance == null) {
            instance = new JokesRepository();
        }
        return instance;
    }

    public Call<JokeResponseData> getAJoke() {
        return RetrofitJokeInstance.getApiInterface().getJoke();
    }

    // step 4 - convert json response into app model

}

//public JokeModel {
//
//
//}
