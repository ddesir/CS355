package com.example.sql;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.text.MessageFormat;
import java.util.ArrayList;

public class ProductsAdapter extends RecyclerView.Adapter<ProductsAdapter.ViewHolder> {
    // Store a member variable for the product
    private ArrayList<String> mDataset;

    // Pass in the product array into the constructor
    public ProductsAdapter(ArrayList<String> products) {
        mDataset = products;
    }

    // Class ViewHolder provide a reference to the views for each data item
    public class ViewHolder extends RecyclerView.ViewHolder {
        // Your holder should contain a member variable
        // for any view that will be set as you render a row
        public TextView textView;
        public TextView textView2;
        public ImageView imageView;

        // Constructor accepts the entire item row
        public ViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.imageView);
            textView = (TextView) itemView.findViewById(R.id.textView);
            textView2 = (TextView) itemView.findViewById(R.id.textView2);
        }
    }

    @Override
    public ProductsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View productView = inflater.inflate(R.layout.row_layout, parent, false);

        // Return a new holder instance
        return new ViewHolder(productView);
    }

    // Involves populating data into the item through holder
    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull ProductsAdapter.ViewHolder viewHolder, int position) {
        // Get the data row based on position
        String datarow = mDataset.get(position);

        int count = 0;
        char someChar = ':';

        for (int i = 0; i < datarow.length(); i++) {
            if (datarow.charAt(i) == someChar) {
                count++;
            }
        }

        if (count == 2) {

            String FoodType;
            String Price;
            String category;
            String[] QueryList = datarow.split(":");
            category = QueryList[0];
            FoodType = QueryList[1];
            Price = QueryList[2];

            // Set item views for the given data row
            ImageView imageView = viewHolder.imageView;

            switch (category) {
                case "Grains/Cereals":
                    imageView.setImageResource(R.drawable.food_grains);
                    break;
                case "Meat/Poultry":
                    imageView.setImageResource(R.drawable.food_meats);
                    break;
                case "Produce":
                    imageView.setImageResource(R.drawable.food_produce);
                    break;
                case "Seafood":
                    imageView.setImageResource(R.drawable.food_crab);
                    break;
            }

            TextView textView = viewHolder.textView;
            textView.setText(FoodType);
            TextView textView2 = viewHolder.textView2;
            textView2.setText("$" + Price);
        } else if (count == 1) {

            String category;
            String FoodType;
            ImageView imageView = viewHolder.imageView;

            String[] QueryList = datarow.split(":");
            category = QueryList[0];
            FoodType = QueryList[1];

            switch (category) {
                case "Grains/Cereals":
                    imageView.setImageResource(R.drawable.food_grains);
                    break;
                case "Meat/Poultry":
                    imageView.setImageResource(R.drawable.food_meats);
                    break;
                case "Produce":
                    imageView.setImageResource(R.drawable.food_produce);
                    break;
                case "Seafood":
                    imageView.setImageResource(R.drawable.food_crab);
                    break;
            }


            TextView textView = viewHolder.textView;
            textView.setText(category);
            TextView textView2 = viewHolder.textView2;
            textView2.setText(MessageFormat.format("{0} Products", FoodType));

        }



}

// Returns the total count of items in the list
@Override
public int getItemCount() {
    return mDataset.size();
}
}
