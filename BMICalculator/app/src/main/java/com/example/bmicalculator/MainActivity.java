package com.example.bmicalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static com.example.bmicalculator.BMICalc.calcultateBMI;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayResult (View view) {
        Intent intent = new Intent (this, DisplayMessageActivity.class);
        EditText ht = (EditText) findViewById(R.id.editText);
        EditText wt = (EditText) findViewById(R.id.editText2);
        float height = ht.getText().toString();
        float weight = wt.getText().toString();
        String message = BMICalc.calcultateBMI(height, weight);
        intent.putExtra("msg1", message);
        startActivity(intent);
    }
}
