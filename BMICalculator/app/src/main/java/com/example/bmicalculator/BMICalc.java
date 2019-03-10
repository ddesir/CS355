package com.example.bmicalculator;

import android.icu.text.DecimalFormat;
import android.icu.text.NumberFormat;

public class BMICalc {
//    private static float height, weight;

    BMICalc() {

    }

    public static String calcultateBMI(float height, float weight) {
        double bmi = weight / (Math.pow(height, 2))*703;
        NumberFormat formatter = new DecimalFormat("#0.0");

        if (bmi < 18.5) {
            return "Your BMI is " + formatter.format(bmi) + ".\nYou are underweight.";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            return "Your BMI is " + formatter.format(bmi) + ".\nYou are healthy.";
        } else if (bmi >= 25.0 && bmi <= 29.9) {
            return "Your BMI is " + formatter.format(bmi) + ".\nYou are overweight.";
        } else {
            return "Your BMI is " + formatter.format(bmi) + ".\nYou are obese.";
        }

        }
}
