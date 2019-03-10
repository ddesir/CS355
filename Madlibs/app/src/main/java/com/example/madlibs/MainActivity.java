package com.example.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayMadlibs (View v) {
        String[] response = new String[10];
        // Intent
        Intent intent = new Intent(this, DisplayMadlibsActivity.class);
        // Retrieve text from EditText
        EditText adj1 = (EditText) findViewById(R.id.editText);
        response[0] = adj1.getText().toString();
        EditText pnoun1 = (EditText) findViewById(R.id.editText2);
        response[1] = pnoun1.getText().toString();
        EditText num1 = (EditText) findViewById(R.id.editText3);
        response[2] = num1.getText().toString();
        EditText pnoun2 = (EditText) findViewById(R.id.editText4);
        response[3] = pnoun2.getText().toString();
        EditText adj2 = (EditText) findViewById(R.id.editText5);
        response[4] = adj2.getText().toString();
        EditText adv1 = (EditText) findViewById(R.id.editText6);
        response[5] = adv1.getText().toString();
        EditText adj3 = (EditText) findViewById(R.id.editText7);
        response[6] = adj3.getText().toString();
        EditText noun1 = (EditText) findViewById(R.id.editText8);
        response[7] = noun1.getText().toString();
        EditText verb1 = (EditText) findViewById(R.id.editText9);
        response[8] = verb1.getText().toString();
        EditText body_part1 = (EditText) findViewById(R.id.editText10);
        response[9] = body_part1.getText().toString();

        String message = Games.madlibs(response);
        intent.putExtra("msg", message);
        startActivity(intent);
    }
}
