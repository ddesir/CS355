package com.example.dayslived;

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

    public void displayCalcDaysLived (View view) {
        // Create Intent instance
        Intent intent = new Intent(this, CalcDaysLived.class);

        // Get name
        EditText n = (EditText) findViewById(R.id.editTextName);
        String name = n.getText().toString();
        // Get password
        EditText p = (EditText) findViewById(R.id.editText2Pwd);
        String pwd = p.getText().toString();

        // Checks name and password
        Boolean isValid = LoginManager.isKnownUser(name, pwd);

        // If valid, start activity
        if (isValid) {
            // intent.putExtra("msg", "Welcome " + name);
            startActivity(intent);
        } else {
            Toast.makeText(getApplicationContext(), "Wrong Credentials. Try Again", Toast.LENGTH_LONG).show();
        }

        this.finish();
    }
}
