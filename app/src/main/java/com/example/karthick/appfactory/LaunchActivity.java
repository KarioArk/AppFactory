package com.example.karthick.appfactory;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;

public class LaunchActivity extends Activity{
    private static  int SPLASH_SCREEN_TIME_OUT = 5000;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent splashIntent = new Intent(LaunchActivity.this, MainActivity.class);
                startActivity(splashIntent);
                finish();
            }
        },SPLASH_SCREEN_TIME_OUT);
    }
}
