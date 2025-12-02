package com.example.layoutexample.ui;

import static android.view.View.GONE;
import static android.view.View.VISIBLE;
import static android.widget.Toast.LENGTH_LONG;
import static android.widget.Toast.LENGTH_SHORT;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.layoutexample.R;
import com.example.layoutexample.model.JokeResponseData;
import com.example.layoutexample.retrofit.RetrofitJokeInstance;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SecondActivity extends AppCompatActivity {
    private static final String TAG  = "ExamplesApp: MySecondActivity";

    // step 1
//    private Button backButton;

//    OnBackPressedCallback callback = new OnBackPressedCallback(true /* enabled by default */) {
//        @Override
//        public void handleOnBackPressed() {
//            Log.d(TAG, "OnBackPressedCallback");
//            backPressed();
//        }
//    };

    // step 2
//    private Button jokeBtn;
//    private TextView tvJoke;
//    private TextView tvJokeDelivery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_second);

        Log.d(TAG, "onCreate");

        // step 1
//        getOnBackPressedDispatcher().addCallback(this, callback); // connects the back press callback to the back press action
//
//        backButton = findViewById(R.id.backBtn);
//
//        backButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.d(TAG, "backButton clicked");
//                backPressed();
//            }
//        });

        // step 2
//        jokeBtn = findViewById(R.id.jokeBtn);
//        tvJoke = findViewById(R.id.tvJoke);
//        tvJokeDelivery = findViewById(R.id.tvJokeDelivery);
//
//        jokeBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (tvJokeDelivery.getVisibility() == VISIBLE) {
//                    tvJokeDelivery.setText(R.string.tap_to_reveal);
//                    tvJokeDelivery.setVisibility(GONE);
//                }
//                getJoke();
//            }
//        });
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d(TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d(TAG, "onDestroy");
    }

//    step 1
//    private void backPressed() {
//        Log.d(TAG, "call backPressed()");
//        finish();
//    }

    // step 2
//    private void getJoke() {
//        RetrofitJokeInstance.getApiInterface().getJoke().enqueue(new Callback<JokeResponseData>() {
//            @Override
//            public void onResponse(Call<JokeResponseData> call, Response<JokeResponseData> response) {
//                Log.d(TAG, "got the joke!" + response.body());
//                if (response.body() != null) {
//                    handleJoke(response.body());
//                } else {
//                    Log.e(TAG, "error getting the joke, received null" + response.message());
//                }
//            }
//
//            @Override
//            public void onFailure(Call<JokeResponseData> call, Throwable t) {
//                Log.e(TAG, "error getting the joke", t);
//                Toast.makeText(SecondActivity.this, "Sorry, error getting the joke", LENGTH_LONG).show();
//            }
//        });
////    }
//
//    private void handleJoke(JokeResponseData joke) {
//        switch (joke.getType()) {
//            case SINGLE:
//                handleSingleJoke(joke);
//                break;
//            case TWO_PART:
//                handleTwoPartJoke(joke);
//                break;
//            default:
//                Toast.makeText(SecondActivity.this, "Can't handle that type of joke", LENGTH_SHORT).show();
//        }
//    }
//
//    private void handleSingleJoke(JokeResponseData joke) {
//        tvJoke.setText(joke.getJoke());
//    }
//
//    private void handleTwoPartJoke(JokeResponseData joke) {
//        tvJoke.setText(joke.getSetup());
//        tvJokeDelivery.setVisibility(VISIBLE);
//        tvJokeDelivery.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                tvJokeDelivery.setText(joke.getDelivery());
//            }
//        });
//    }

}
