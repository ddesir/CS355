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
        if (view.equals(findViewById(R.id.button))) {
            intent.putExtra("query", "SELECT categoryName, ProductName, UnitPrice FROM products, categories WHERE categories.categoryID=Products.categoryID ORDER BY categoryName;");
        } else if (view.equals(findViewById(R.id.button2))) {
            intent.putExtra("query", "SELECT categoryName, COUNT(ProductID) FROM products, categories WHERE categories.categoryID=Products.categoryID GROUP BY categoryName;");
        }
        startActivity(intent);
    }
}
