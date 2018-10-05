package com.amikom.simpleapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.logging.Handler;
import java.util.prefs.Preferences;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        PreferencesHelper Instance;
        @Override
         protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Instance = PreferencesHelper.getInstance(getApplicationContext());
        int splashInterval = 10;
        new Handler().postDelayed(new Runnable())

            if (!Instance.isLogin()) {
                startActivity(new Intent(SplashActivity.this, LoginActivityy.class));
        } else {
                startActivity(new Intent(SplashActivity.this, MainActivity.class));
            }
        } , SplashInterval;

    }


}
