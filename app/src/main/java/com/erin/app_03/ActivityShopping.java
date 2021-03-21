package com.erin.app_03;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityShopping extends AppCompatActivity {
    @Override
    protected void onCreate(@NonNull Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_shopping);

        TextView title = (TextView) findViewById(R.id.activityTitleShopping);
        title.setText("Shopping");

    }
}
