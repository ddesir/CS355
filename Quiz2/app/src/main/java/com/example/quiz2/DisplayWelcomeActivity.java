package com.example.quiz2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayWelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_welcome);

        Intent intent = getIntent();
        String message = intent.getStringExtra("msg");


        TextView tv = (TextView) findViewById(R.id.textView);
        tv.setText(message);
    }
}
