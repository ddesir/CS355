package com.example.sql;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void makeQuery (View view) {
        Intent intent = new Intent(this, ShowResultsRecyclerView.class);
        if (view.equals(findViewById(R.id.allPlayers))) {
            intent.putExtra("query", "select Name, Age, Position, Players.team_name, City from Players, Teams where Players.teamID = Teams.ID;");
        } else if (view.equals(findViewById(R.id.yankees))) {
            intent.putExtra("query", "select Name, Age, Position, Players.team_name, City from Players, Teams where Players.teamID = 1 and Teams.ID = 1;");
        } else if (view.equals(findViewById(R.id.thirtyPlus))) {
            intent.putExtra("query", "select Name, team_name from Players where Age >= 30;");
        }
        startActivity(intent);
    }
}
