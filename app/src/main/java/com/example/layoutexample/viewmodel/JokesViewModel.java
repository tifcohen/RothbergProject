package com.example.layoutexample.viewmodel;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.layoutexample.model.JokeResponseData;
import com.example.layoutexample.repository.JokesRepository;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class JokesViewModel extends ViewModel {

    private static final String TAG  = "ExamplesApp: JokesViewModel";
    private final JokesRepository jokesRepo = JokesRepository.getInstance();
    private final MutableLiveData<JokeResponseData> _jokeLiveData = new MutableLiveData<>();
    public final LiveData<JokeResponseData> jokeLiveData = _jokeLiveData;

    @Override
    public void onCleared() {
        Log.d(TAG, "onCleared");
    }

    public void getJoke() {
        jokesRepo.getAJoke().enqueue(new Callback<JokeResponseData>() {
            @Override
            public void onResponse(Call<JokeResponseData> call, Response<JokeResponseData> response) {
                Log.d(TAG, "got the joke!" + response.body());
                if (response.body() != null) {
                    _jokeLiveData.postValue(response.body());
                } else {
                    Log.e(TAG, "error getting the joke, received null" + response.message());
                    _jokeLiveData.postValue(null);
                }
            }

            @Override
            public void onFailure(Call<JokeResponseData> call, Throwable t) {
                Log.e(TAG, "error getting the joke", t);
                _jokeLiveData.postValue(null);
            }
        });
    }

}
