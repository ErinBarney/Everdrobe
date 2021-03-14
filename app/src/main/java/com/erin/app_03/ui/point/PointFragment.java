package com.erin.app_03.ui.point;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.erin.app_03.R;

public class PointFragment extends Fragment {

    private PointViewModel pointViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        pointViewModel =
                new ViewModelProvider(this).get(PointViewModel.class);
        View root = inflater.inflate(R.layout.fragment_point, container, false);
        final TextView textView = root.findViewById(R.id.text_point);
        pointViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}