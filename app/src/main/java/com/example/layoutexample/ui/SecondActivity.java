package com.example.layoutexample.ui;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AppCompatActivity;

import com.example.layoutexample.R;

public class SecondActivity extends AppCompatActivity {
    private static final String TAG  = "MySecondActivity";

//    private Button backButton;

//    OnBackPressedCallback callback = new OnBackPressedCallback(true /* enabled by default */) {
//        @Override
//        public void handleOnBackPressed() {
//            Log.d(TAG, "OnBackPressedCallback");
//            backPressed();
//        }
//    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_second);

        Log.d(TAG, "onCreate");

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

//    private void backPressed() {
//        Log.d(TAG, "call backPressed()");
//        finish();
//    }
}
