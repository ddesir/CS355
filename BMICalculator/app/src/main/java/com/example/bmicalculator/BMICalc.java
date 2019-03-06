package com.example.bmicalculator;

public class BMICalc {
//    private static float height, weight;

    BMICalc() {

    }

/*    public static void setHeight(float x) {
        height = x;
    }

    public static void setWeight(float y) {
        weight = y;
    } */

    public static float calcultateBMI(float x, float y) {
        Float height = Float.parseFloat(x);
        Float weight = Float.parseFloat(y);
        return Math.pow(height, 2)/weight;
    }
}
