package com.example.toastanddialogs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class GreetingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greeting);
    }

    public void close (View view) {
        this.finish();
    }
}