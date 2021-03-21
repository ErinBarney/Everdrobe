package com.erin.app_03;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityPoint extends AppCompatActivity {
    @Override
    protected void onCreate(@NonNull Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_point);

        TextView title = (TextView) findViewById(R.id.activityTitlePoint);
        title.setText("Point");
    }
}