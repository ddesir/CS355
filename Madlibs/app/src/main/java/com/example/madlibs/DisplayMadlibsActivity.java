package com.example.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMadlibsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_madlibs);

        Intent intent = getIntent();
        String message = intent.getStringExtra("msg");

        // Display the message in text view
        TextView tv = (TextView) findViewById(R.id.textView);
        tv.setText(message);
    }
}
