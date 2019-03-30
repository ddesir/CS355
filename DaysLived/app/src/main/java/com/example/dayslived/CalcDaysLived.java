package com.example.dayslived;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;

public class CalcDaysLived extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc_days_lived);
    }

    public void calculateDays(View view) {
        // Retrieve values from date picker
        DatePicker p = (DatePicker) findViewById(R.id.datePicker);
        int bDay = p.getDayOfMonth();
        int bMonth = p.getMonth() + 1;
        int bYear = p.getYear();

        // Get current date
        Calendar c = Calendar.getInstance();
        int thisDay = c.get(Calendar.DAY_OF_MONTH);
        int thisMonth = c.get(Calendar.MONTH) + 1;
        int thisYear = c.get(Calendar.YEAR);

        GFG.Date dt1 = new GFG.Date(bDay, bMonth, bYear);
        GFG.Date dt2 = new GFG.Date(thisDay, thisMonth, thisYear);
        int lived = GFG.getDifference(dt1, dt2);

        String currentDate = String.format("Today is %d/%d/%d.", thisMonth, thisDay, thisYear);
        String birthDate = String.format("\nYou were born on %d/%d/%d.", bMonth, bDay, bYear);
        String alive = String.format("\nYou have been alive for %d days.", lived);

        // Change text on TextView
        TextView tv = (TextView) findViewById(R.id.textView2);
        tv.setText(currentDate + birthDate + alive);
    }
}
