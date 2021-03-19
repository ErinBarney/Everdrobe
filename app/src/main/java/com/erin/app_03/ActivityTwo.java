package com.erin.app_03;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


public class ActivityTwo extends AppCompatActivity {
    @Override
    protected void onCreate(@NonNull Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        TextView title = (TextView) findViewById(R.id.activityTitle2);
        title.setText("Account");

        TextView textView = (TextView) findViewById(R.id.text_username);
        textView.setText("Username");
    }
}