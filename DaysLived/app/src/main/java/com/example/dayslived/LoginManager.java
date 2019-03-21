package com.example.dayslived;

public class LoginManager {
    public static boolean isKnownUser(String name, String pwd) {
        if (name.equals("name") && pwd.equals("password")) {
            return true;
        } else {
            return false;
        }
    }
}
