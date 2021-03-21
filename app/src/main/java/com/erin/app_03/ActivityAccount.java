package com.erin.app_03;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


public class ActivityAccount extends AppCompatActivity {
    @Override
    protected void onCreate(@NonNull Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_account);

        TextView title = (TextView) findViewById(R.id.activityTitleAccount);
        title.setText("Account");

        ImageView accountImage = (ImageView) findViewById(R.id.imageView);


    }
}