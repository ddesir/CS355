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

    public void displayFortune (View v) {
        // Intent
        Intent intent = new Intent(this, Games.class)
        // Retrieve text from EditText
        EditText txt = (EditText) findViewById(R.id.editText);
        String userinput = txt.getText().toString();
        intent.putExtra("deon", userinput);
        startActivity(intent);
    }
}
