package com.example.oss_app;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.core.app.ActivityCompat;

public class MainActivity extends Activity {

    public static Context mainActivityContext;
    static String postUrl = "http://192.168.0.92:8000/ai";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.INTERNET}, 0);

        mainActivityContext = this;
    }

    public void login(View v) {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivityForResult(intent, 2);
    }

    public void register(View v) {
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }

    public void sample(View v) {
        Intent intent = new Intent(this, SampleHttpConnection.class);
        startActivity(intent);
    }

    public void skip(View v) {
        Intent intent = new Intent(this, CategoryPage.class);
        startActivity(intent);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }
}