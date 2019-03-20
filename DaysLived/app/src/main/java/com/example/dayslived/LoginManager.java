package com.example.dayslived;

public class LoginManager {
    public static boolean isKnownUser(String name, String psswd) {
        if (name.equals("name") && psswd.equals("password")) {
            return true;
        } else {
            return false;
        }
    }
}
