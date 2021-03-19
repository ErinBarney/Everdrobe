package com.erin.app_03;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityThree extends AppCompatActivity {
    @Override
    protected void onCreate(@NonNull Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);

        TextView title = (TextView) findViewById(R.id.activityTitle3);
        title.setText("Point");
    }
}