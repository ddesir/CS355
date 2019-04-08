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
        Intent intent = new Intent(this, Listing.class);
        intent.putExtra("query", "SELECT categoryName, ProductName, UnitPrice FROM products, categories WHERE categories.categoryID=Products.categoryID ORDER BY categoryName;");
        startActivity(intent);
    }
}
