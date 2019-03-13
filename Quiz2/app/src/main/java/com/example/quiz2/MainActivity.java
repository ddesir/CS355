package com.example.quiz2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static com.example.quiz2.LoginManager.isKnownUser;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayWelcome (View view) {
        Intent intent = new Intent(this, DisplayWelcomeActivity.class);
        EditText uname = (EditText) findViewById(R.id.editTextUserName);
        EditText pword = (EditText) findViewById(R.id.editTextPsswd);
        String name = uname.getText().toString();
        String psswd = pword.getText().toString();

        Boolean isValid = isKnownUser(name, psswd);

        if (isValid == true) {
            intent.putExtra("msg", "Welcome " + name);
            startActivity(intent);
        } else {
            Toast.makeText(getApplicationContext(), "Wrong Credentials. Try Again", Toast.LENGTH_LONG).show();
        }
    }
}
