package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private static int SPLASH_TIMEOUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intentHome = new Intent(MainActivity.this, FirstActivity.class);
                startActivity(intentHome);
                finish();
            }
        },SPLASH_TIMEOUT);

        Toast.makeText(this, "Opening calculator...!", Toast.LENGTH_SHORT).show();
    }


}