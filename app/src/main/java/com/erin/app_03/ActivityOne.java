package com.erin.app_03;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class ActivityOne extends AppCompatActivity {
    @Override
    protected void onCreate(@NonNull Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        TextView title = (TextView) findViewById(R.id.activityTitle1);
        title.setText("Shopping");

    }
}
