package com.example.myfirstapp;

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

    public void displayFortune (View v) {
        // Retrieve text from EditText
        EditText txt = (EditText) findViewById(R.id.editText);
        String userinput = txt.getText().toString();
        Toast.makeText(getApplicationContext(), Games.fortune_teller(userinput),
                Toast.LENGTH_LONG).show();
    }


}
