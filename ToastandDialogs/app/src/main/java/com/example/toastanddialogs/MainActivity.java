package com.example.toastanddialogs;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createNotificationChannel();
    }

    public void createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel channel = new NotificationChannel("my_channel_id", "App Notification", NotificationManager.IMPORTANCE_DEFAULT);
            NotificationManager notificationManager = getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(channel);
        }
    }

    public void displayToast (View view) {
        EditText input = (EditText) findViewById(R.id.editText);
        String text = input.getText().toString();

        Toast.makeText(getApplicationContext(), text, Toast.LENGTH_LONG).show();
    }

    public void displayAlert (View view) {
        EditText input = (EditText) findViewById(R.id.editText);
        String text = input.getText().toString();

        new AlertDialog.Builder(this).setTitle("Alert Dialog")
                .setMessage(text).setPositiveButton("Accept", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "You clicked the ACCEPT button", Toast.LENGTH_LONG).show();
            }
        })
                .setNegativeButton("Reject", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), "You Clicked the REJECT button", Toast.LENGTH_LONG).show();
                    }
                }).setIcon(R.mipmap.ic_launcher).show();
    }

    public void displayNotification (View view) {
        final int NOTIF_ID = 1111;
        NotificationManager notifManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        PendingIntent intent = PendingIntent.getActivity(this, 0, new Intent(this, GreetingActivity.class), 0);
        NotificationCompat.Builder note = new NotificationCompat.Builder(this, "my_channel_id");
        note.setSmallIcon(R.mipmap.ic_launcher);
        note.setContentTitle("New Greeting");
        note.setContentText("You have a new greeting message");
        note.setContentIntent(intent);
        note.setAutoCancel(true);
        Notification notif = note.build();
        notifManager.notify(NOTIF_ID, notif);
    }
}
