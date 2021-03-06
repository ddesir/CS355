package com.example.sql;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Listing extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listing);

        // Retrieve argument sent from MainActivity
        Intent intent = getIntent();
        String q = intent.getStringExtra("query");

        // Query the DB and store the results in an ArrayList
        ArrayList<String> values = queryDB(q);

        // Get RecyclerView component and display the results of the query
        RecyclerView rv = (RecyclerView) findViewById(R.id.listView);
        // ArrayAdapter<String> adp = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, values);
        ArrayList<String> adp
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(adp);
    }

    ArrayList<String> queryDB (String query) {
        ArrayList<String> list = new ArrayList<String>();

        try {
            SQLiteDatabase db = openOrCreateDatabase("players.db", Context.MODE_PRIVATE, null);
            Cursor cursor = db.rawQuery(query, null);

            while (cursor.moveToNext()) {
                StringBuilder data = new StringBuilder();

                for (int i = 0; i < cursor.getColumnCount(); i++) {
                    if (i > 0) data.append(" || ");
                    String colvalue = cursor.getString(i);
                    data.append(colvalue);
                }
                list.add(data.toString());
            }
            cursor.close();
            db.close();
        } catch (Exception e) {
            Toast.makeText(getApplicationContext(), "Error opening / querying Database", Toast.LENGTH_LONG).show();
        }

        return list;
    }

}
