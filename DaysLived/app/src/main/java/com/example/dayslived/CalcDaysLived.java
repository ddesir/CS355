package com.example.dayslived;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;

public class CalcDaysLived extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc_days_lived);
    }

    public void calculateDays(View view) {
        // Retrieve values from date picker
        DatePicker p = (DatePicker) findViewById(R.id.datePicker);
        int day = p.getDayOfMonth();
        int month = p.getMonth();
        int year = p.getYear();

        // Get current date
        Calendar c = Calendar.getInstance();
        int currentDay = c.get(Calendar.DAY_OF_MONTH);
        int currentMonth = c.get(Calendar.MONTH) + 1;
        int currentYear = c.get(Calendar.YEAR);

        Date past = new Date(year, month, day);
        Date today = new Date(currentYear, currentMonth, currentDay);

        // int days = today - past;

        String currentDate = String.format("Today is %d/%d/%d", currentMonth, currentDay, currentYear);
        // String lived = String.format("You have lived for %d days!!!", days);

        // Change text on TextView
        TextView tv = (TextView) findViewById(R.id.textView2);
        tv.setText(String.format(currentDate));
    }
}
