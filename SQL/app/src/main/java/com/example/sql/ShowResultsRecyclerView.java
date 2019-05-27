package com.example.sql;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;

public class ShowResultsRecyclerView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_results_recycler_view);

        // getProducts: you should query from database here instead of having a fixed list
        ArrayList<String> plist = new ArrayList<String>(Arrays.asList(products));

        // Lookup the recyclerview in activity layout
        RecyclerView rvProducts = (RecyclerView) findViewById(R.id.productsList);
        // Set layout manager to position the items
        rvProducts.setLayoutManager(new LinearLayoutManager(this));

        // Create adapter passing in the products list
        ProductsAdapter adapter = new ProductsAdapter(plist);
        rvProducts.setAdapter(adapter);
    }
}
