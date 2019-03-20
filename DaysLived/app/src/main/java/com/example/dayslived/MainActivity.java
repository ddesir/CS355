package com.example.dayslived;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayCalcDaysLived (View view) {
        // Get name
        EditText n = (EditText) findViewById(R.id.editTextName);
        String name = n.getText().toString();
        // Get password
        EditText p = (EditText) findViewById(R.id.editText2Pwd);
        String pwd = n.getText().toString();


    }
}
