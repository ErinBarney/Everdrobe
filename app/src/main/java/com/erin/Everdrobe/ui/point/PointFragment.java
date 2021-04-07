package com.erin.Everdrobe.ui.point;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.erin.Everdrobe.R;


public class PointFragment extends Fragment {


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        View root = inflater.inflate(R.layout.fragment_point, container, false);
        final TextView textView = root.findViewById(R.id.text_point);

        Button btnFragment = (Button) root.findViewById(R.id.button_purchasesustainable);
        btnFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction fr = getParentFragmentManager().beginTransaction();
                fr.replace(R.id.container, new SustainableClothesFragment());
                fr.addToBackStack(null);
                fr.commit();


            }
        });

        Button btnFragment2 = (Button) root.findViewById(R.id.button_howto);
        btnFragment2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction fr = getParentFragmentManager().beginTransaction();
                fr.replace(R.id.container, new HowToFragment());
                fr.addToBackStack(null);
                fr.commit();

            }
        });

        return root;

    }
}