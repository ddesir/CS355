package com.example.bmicalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((EditText) findViewById(R.id.editText4)).getText().clear();
        ((EditText) findViewById(R.id.editText)).getText().clear();
        ((EditText) findViewById(R.id.editText2)).getText().clear();

    }

    public void displayResult (View view) {
        Intent intent = new Intent (this, DisplayMessageActivity.class);

        EditText name = (EditText) findViewById(R.id.editText4);
        String user = name.getText().toString();
        EditText ht = (EditText) findViewById(R.id.editText);
        float height = Float.parseFloat(ht.getText().toString());
        EditText wt = (EditText) findViewById(R.id.editText2);
        float weight = Float.parseFloat(wt.getText().toString());

        String message = user + "'s BMI and Health Report\n\n" + BMICalc.calcultateBMI(height, weight);

        intent.putExtra("msg1", message);
        startActivity(intent);
    }
}
